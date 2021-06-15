package com.company.Threads;

import com.company.MainGame.GameView;

import javax.swing.*;
import java.io.IOException;

public class TrainAnimation extends Thread implements Runnable {


    private JLabel picLabel;
    private int j = 1;
    private int i = 9;
    private boolean side = true;

    public TrainAnimation(GameView gameView) throws IOException {
        picLabel = gameView.getPicLabel4();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                animate();

            } catch (InterruptedException exc) {
                System.out.println("Wątek symulacji stopera zoostał przerwany.");
                return;
            }

        }
    }

    private void animate() {
        if(picLabel.getX()<200)
            side=false;
        if(picLabel.getX()>220)
            side=true;

        if(side){
            picLabel.setBounds(picLabel.getX()-j,picLabel.getY()-i,30,30);
        }
        else{
            picLabel.setBounds(picLabel.getX()+j,picLabel.getY()+i,30,30);
        }
    }
}

