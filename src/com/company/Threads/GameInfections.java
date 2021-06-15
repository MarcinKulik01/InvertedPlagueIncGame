package com.company.Threads;

import com.company.Countries.Country;
import com.company.MainGame.GameModel;
import com.company.MainGame.GameView;

import java.util.Random;

public class GameInfections extends Thread implements Runnable {

    private GameModel gameModel;
    private GameView gameView;
    private int gameLv;
    private Random random = new Random();
    private boolean countryPom = false;

    public GameInfections(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        gameLv = gameModel.getGameLv();
        this.gameView = gameView;
        gameModel.getBrazil().setInfected(1);

    }

    @Override
    synchronized public void run() {


        while (true) {
            try {

                if(gameModel.getBrazil().getInfected()>1000||countryPom==true)
                    otherCountryInfection();
                else
                    brazilInfection();

                int pom = 0;
                for (Country country : gameModel.getCountryLinkedList())
                    pom += country.getInfected();

                gameModel.setInfected(pom);
                gameView.getInfected().setValue(pom);
                gameView.getInfectedShowA().setText(gameModel.getInfected()+"");
                Thread.sleep(3000);

            } catch (InterruptedException exc) {
                System.out.println("Wątek symulacji zarazen zostal przerwany.");
                return;
            }
        }

    }

    private void otherCountryInfection() {
        int counterPom;
        int a;
        for (Country country : gameModel.getCountryLinkedList()) {
                a = random.nextInt(20);
                if (a > 10 / gameLv && country.getInfected()==0) {
                        country.setInfected(1);
                        gameView.getGameInformations().setText("UWAGA UWAGA W " + country.getName() + " POJAWIL SIE WIRUS");
                }
                if (country.getInfected() < 1000 && country.getInfected() >= 1) {
                    counterPom = country.getInfected() * 2;
                    country.setInfected(counterPom);
                    country.setHospitals(country.getInfected() / 10);

                } else if (country.getInfected() > 1000) {

                    counterPom = (country.getInfected() + (country.getInfected() * (country.getBonus() + 20) * gameLv / 100));
                    if (counterPom < country.getPopulation()) {
                        country.setInfected(counterPom);
                        country.setHospitals(country.getInfected() / 10);
                    } else {
                        country.setInfected(country.getPopulation());
                        country.setHospitals(country.getInfected() / 10);
                    }
                }
            }
        }


    private void brazilInfection() {



            gameModel.getBrazil().setInfected(gameModel.getBrazil().getInfected() * 3);
            gameModel.getBrazil().setHospitals((int) (gameModel.getBrazil().getInfected() * 0.1));

            if (gameModel.getBrazil().getInfected() == 3) {
                gameView.getGameInformations().setText("UWAGA UWAGA W BRAZYLI ZLE SIE DZIEJE\n SKORZYSTAJ Z ULEPSZEN ABY ZNISZCZYC WIRUSA");
                gameView.getBuy().setVisible(true);
            }

            if (gameModel.getBrazil().getInfected() == 243) {
                gameView.getGameInformations().setText(" Za kazde ocalone 1000 osob otrzymasz 1 pk\n SKORZYSTAJ Z ULEPSZEN ABY ZNISZCZYC WIRUSA");

            }
            if(gameModel.getBrazil().getInfected()==729)
                countryPom=true;
    }
}
