package com.company.Threads;

import com.company.MainGame.GameView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PlaneAnimation extends Thread implements Runnable {


    private JLabel picLabel;
    private int j = 5;
    private int i = 11;
    private boolean side = true;

    public PlaneAnimation(GameView gameView) throws IOException {
        picLabel = gameView.getPicLabel3();
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
        if(picLabel.getX()>230)
            side=false;
        if(picLabel.getX()<110)
            side=true;

        if(side){
            picLabel.setBounds(picLabel.getX()+i,picLabel.getY()-j,30,30);
        }
        else{
            picLabel.setBounds(picLabel.getX()-i,picLabel.getY()+j,30,30);
        }
    }
}

