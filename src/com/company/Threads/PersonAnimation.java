package com.company.Threads;

import com.company.MainGame.GameView;

import javax.swing.*;
import java.io.IOException;

public class PersonAnimation extends Thread implements Runnable {


    private JLabel picLabel;
    private int j = 2;
    private int i = 7;
    private boolean side = true;

    public PersonAnimation(GameView gameView) throws IOException {
        picLabel = gameView.getPicLabel2();
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
        if(picLabel.getX()>250)
            side=false;
        if(picLabel.getX()<200)
            side=true;

        if(side){
            picLabel.setBounds(picLabel.getX()+j,picLabel.getY()-i,40,30);
        }
        else{
            picLabel.setBounds(picLabel.getX()-j,picLabel.getY()+i,30,30);
        }
    }
}

