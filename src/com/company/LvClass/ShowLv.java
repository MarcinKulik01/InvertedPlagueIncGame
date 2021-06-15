package com.company.LvClass;

import com.company.MainGame.GameController;
import com.company.MainGame.GameModel;
import com.company.MainGame.GameView;
import com.company.Menu.MenuView;
import com.company.Threads.*;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ShowLv extends JFrame {


    private JFrame jFrame;
    private JButton easy;
    private JButton medium;
    private JButton hard;
    private MenuView menuView;
    private BusAnimation busAnimation;
    private CargoAnimation cargoAnimation;
    private GameEnd gameEnd;
    private GameInfections gameInfections;
    private MainTread mainTread;
    private PersonAnimation personAnimation;
    private PlaneAnimation planeAnimation;
    private Time time;
    private TrainAnimation trainAnimation;
    private GameTreatment gameTreatment;


    public ShowLv(MenuView menuView){
        this.menuView = menuView;

        jFrame = new JFrame();
        jFrame.setTitle("WYBIERZ POZIOM TRUDNOSCI");
        jFrame.setLayout(null);

        easy = new JButton("EASY");
        easy.setBounds(10,10,80,50);
        easy.setBorderPainted(true);
        easy.setOpaque(true);
        easy.setBorder(BorderFactory.createLineBorder(Color.white,3));
        easy.setBackground(new Color(0x00FF11));
        easy.setVisible(true);

        medium = new JButton("MEDIUM");
        medium.setBounds(105,10,80,50);;
        medium.setBorderPainted(true);
        medium.setOpaque(true);
        medium.setBorder(BorderFactory.createLineBorder(Color.white,3));
        medium.setBackground(new Color(0xFF6301));
        medium.setVisible(true);

        hard = new JButton("HARD");
        hard.setBounds(200,10,80,50);
        hard.setBorderPainted(true);
        hard.setOpaque(true);
        hard.setBorder(BorderFactory.createLineBorder(Color.white,3));
        hard.setBackground(new Color(0xFF1D00));
        hard.setVisible(true);

        jFrame.add(easy);
        jFrame.add(medium);
        jFrame.add(hard);

        jFrame.setSize(300,100);
        jFrame.getContentPane().setBackground(new Color(0x474747));
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    public JButton getEasy() {
        return easy;
    }

    public void setEasy(JButton easy) {
        this.easy = easy;
    }

    public JButton getMedium() {
        return medium;
    }

    public void setMedium(JButton medium) {
        this.medium = medium;
    }

    public JButton getHard() {
        return hard;
    }

    public void setHard(JButton hard) {
        this.hard = hard;
    }

    public void startGame(int number) throws IOException {

        SwingUtilities.invokeLater(() -> {
            GameModel gameModel = new GameModel(number);
            GameView gameView = null;
            try {
                gameView = new GameView("GAME", gameModel);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            GameController gameController = new GameController(gameModel, gameView, menuView
            );
            gameController.initController();

            time = new Time();
            time.start();

            mainTread = new MainTread(gameView, time);
            mainTread.start();

            gameInfections = new GameInfections(gameModel, gameView);
            gameInfections.start();

            gameTreatment = new GameTreatment(gameModel, gameView);
            gameTreatment.start();


            try {
                busAnimation = new BusAnimation(gameView);
                cargoAnimation = new CargoAnimation(gameView);
                personAnimation = new PersonAnimation(gameView);
                trainAnimation = new TrainAnimation(gameView);
                planeAnimation = new PlaneAnimation(gameView);
                planeAnimation.start();
                busAnimation.start();
                cargoAnimation.start();
                personAnimation.start();
                trainAnimation.start();
                GameEnd gameEnd = new GameEnd(time, gameView, mainTread, gameTreatment, gameInfections, gameModel, menuView,
                        planeAnimation, trainAnimation, cargoAnimation, personAnimation, busAnimation);
                gameEnd.start();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });
    }

    }

