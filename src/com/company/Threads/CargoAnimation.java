package com.company.Threads;

import com.company.MainGame.GameView;

import javax.swing.*;
import java.io.IOException;

public class CargoAnimation extends Thread implements Runnable {


    private JLabel picLabel;
    private int j = 1;
    private int i = 10;
    private boolean side = true;

    public CargoAnimation(GameView gameView) throws IOException {
        picLabel = gameView.getPicLabel1();
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
        if(picLabel.getX()==130)
            side=false;
        if(picLabel.getX()==160)
            side=true;

        if(side){
            picLabel.setBounds(picLabel.getX()-j,picLabel.getY()-i,50,50);
        }
        else{
            picLabel.setBounds(picLabel.getX()+j,picLabel.getY()+i,50,50);
        }
    }
}

