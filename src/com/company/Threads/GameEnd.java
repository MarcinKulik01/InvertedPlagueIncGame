package com.company.Threads;

import com.company.Countries.Country;
import com.company.Exception.InterruptedExceptionLoss;
import com.company.Exception.InterruptedExceptionWin;
import com.company.MainGame.GameModel;
import com.company.MainGame.GameView;
import com.company.Menu.MenuView;
import com.company.Save.SaveController;
import com.company.Save.SaveModel;
import com.company.Save.SaveView;

import javax.swing.*;
import java.util.Date;
import java.util.InputMismatchException;

public class GameEnd extends Thread implements Runnable{

    private GameView gameView;
    private Time time;
    private MainTread mainTread;
    private GameTreatment gameTreatment;
    private GameInfections gameInfections;
    private GameModel gameModel;
    private MenuView menuView;
    private PlaneAnimation planeAnimation;
    private TrainAnimation shipAnimation;
    private CargoAnimation cargoAnimation;
    private PersonAnimation personAnimation;
    private BusAnimation busAnimation;
    private Date date = new Date();

    public GameEnd(Time time,GameView gameView, MainTread mainTread, GameTreatment gameTreatment, GameInfections gameInfections, GameModel gameModel, MenuView menuView,
                   PlaneAnimation planeAnimation, TrainAnimation shipAnimation, CargoAnimation cargoAnimation, PersonAnimation personAnimation, BusAnimation busAnimation) {
        this.gameView = gameView;
        this.time = time;
        this.mainTread = mainTread;
        this.gameTreatment = gameTreatment;
        this.gameInfections = gameInfections;
        this.gameModel = gameModel;
        this.menuView = menuView;
        this.planeAnimation = planeAnimation;
        this.shipAnimation = shipAnimation;
        this.cargoAnimation = cargoAnimation;
        this.personAnimation = personAnimation;
        this.busAnimation = busAnimation;
    }

    @Override
    public void run() {

        boolean check = true;
        while (true) {

            try {
                if (check) {
                    Thread.sleep(60000);
                    check = false;
                } else {
                    Thread.sleep(2000);
                    if (gameModel.getAllPeople() == gameModel.getInfected()) {
                        SwingUtilities.invokeLater(()-> {
                            gameModel.setFinalPoints(gameModel.getFinalPoints()*gameModel.getGameLv());
                            SaveView saveView = new SaveView();
                            SaveModel saveModel = new SaveModel("loss",gameModel.getGameLv()+"",+gameModel.getFinalPoints(), gameView.getTime().getText(), date);
                            SaveController saveController = new SaveController(saveView, saveModel, menuView,gameView);
                            saveController.initController();
                        time.stop();
                        mainTread.stop();
                        gameTreatment.stop();
                        gameInfections.stop();
                        planeAnimation.stop();
                        shipAnimation.stop();
                        cargoAnimation.stop();
                        personAnimation.stop();
                        busAnimation.stop();
                        });
                        throw new InterruptedExceptionLoss();
                    }
                    if (gameModel.getInfected() == 0) {
                        SwingUtilities.invokeLater(()-> {
                                    gameModel.setFinalPoints(gameModel.getFinalPoints()*gameModel.getGameLv()+500);
                                    if(time.getTime()<1500)
                                        gameModel.setFinalPoints(gameModel.getFinalPoints()+500);
                                    SaveView saveView = new SaveView();
                                    SaveModel saveModel = new SaveModel("win",gameModel.getGameLv()+"",gameModel.getFinalPoints(), gameView.getTime().getText(), date);
                                    SaveController saveController = new SaveController(saveView, saveModel, menuView,gameView);
                                    saveController.initController();
                        time.stop();
                        mainTread.stop();
                        gameTreatment.stop();
                        gameInfections.stop();
                        planeAnimation.stop();
                        shipAnimation.stop();
                        cargoAnimation.stop();
                        personAnimation.stop();
                        busAnimation.stop();
                        });
                        throw new InterruptedExceptionWin();
                    }
                }
            } catch (InterruptedExceptionLoss interruptedExceptionLoss) {
                return;
            }catch (InterruptedExceptionWin interruptedExceptionWin){
                return;
            }catch (InputMismatchException e){

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
