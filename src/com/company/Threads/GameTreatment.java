package com.company.Threads;

import com.company.Countries.Country;
import com.company.MainGame.GameModel;
import com.company.MainGame.GameView;

public class GameTreatment extends Thread implements Runnable{
    private GameView gameView;
    private GameModel gameModel;
    private int allCured;
    private int partCured;
    private int countryCured;
    private int toGetPoints;


    public GameTreatment(GameModel gameModel, GameView gameView){
        this.gameModel = gameModel;
        this.gameView = gameView;
        toGetPoints=800*gameModel.getGameLv();
    }

    @Override
    synchronized public void run() {
        boolean check = false;
        int pom;
        while (true) {

            try {

             for(Country country: gameModel.getCountryLinkedList()){
                 if(country.getInfected()>100){

                     countryCured = country.getInfected()*(gameModel.getBonusTreatment())/100;
                     partCured = partCured + countryCured;
                     allCured = allCured + countryCured;
                     if(country.getInfected()>countryCured) {
                         country.setInfected(country.getInfected() - countryCured);
                         gameModel.setInfected(gameModel.getInfected() - countryCured);
                         countryCured = 0;
                     }
                     else{
                         country.setInfected(0);
                         gameModel.setInfected(0);
                         countryCured = 0;
                     }
                 }
                 if((check==false)&&(country.getName().equals("Wenezuela")&&(country.getInfected()>100))){
                     check=true;
                 }
                 if(check){
                     int howMany=0;
                     if(country.getInfected()<=1000){
                         countryCured = country.getInfected()/5;
                         if(country.getInfected()<100){
                             gameModel.setInfected(gameModel.getInfected()-country.getInfected());
                             country.setInfected(0);
                             howMany++;
                         }
                         if(howMany==7){
                             gameModel.setInfected(0);
                         }
                         partCured = partCured + countryCured;
                         allCured = allCured + countryCured;
                         country.setInfected(country.getInfected()-countryCured);
                         gameModel.setInfected(gameModel.getInfected()-countryCured);
                         countryCured = 0;
                     }
                     if(country.getInfected()<=10){
                         country.setInfected(country.getInfected()-country.getInfected());
                         gameModel.setInfected(gameModel.getInfected()-country.getInfected());
                     }
                 }
             }
                if(partCured>10000){
                    toGetPoints=10000;
                }

                pom = partCured/toGetPoints;
                partCured=partCured%toGetPoints;
                gameModel.setPoints(gameModel.getPoints()+pom);
                gameView.getPointsA().setText(gameModel.getPoints()+"");
                gameView.getCuredA().setText(allCured+"");


                Thread.sleep(4000);
            } catch (InterruptedException exc) {
                System.out.println("Wątek symulacji lecznia zoostał przerwany.");
                return;
            }
        }

    }

}
