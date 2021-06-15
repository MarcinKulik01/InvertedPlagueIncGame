package com.company.Threads;

import com.company.MainGame.GameView;

import javax.swing.*;
import java.io.IOException;

public class BusAnimation extends Thread implements Runnable {


    private JLabel picLabel;
    private int j = 5;
    private int i = 3;
    private boolean side = true;

    public BusAnimation(GameView gameView) throws IOException {
        picLabel = gameView.getPicLabel();
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
        if(picLabel.getX()==320)
            side=false;
        if(picLabel.getX()==100)
            side=true;

        if(side){
            picLabel.setBounds(picLabel.getX()+j,picLabel.getY()+i,30,30);
        }
        else{
            picLabel.setBounds(picLabel.getX()-j,picLabel.getY()-i,30,30);
        }
    }
}

