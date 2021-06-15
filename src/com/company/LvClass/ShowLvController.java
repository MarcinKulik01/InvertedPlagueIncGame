package com.company.LvClass;

import com.company.LvClass.ShowLv;

import java.io.IOException;

public class ShowLvController{

    private ShowLv showLv;

    public ShowLvController(ShowLv showLv) {
       this.showLv = showLv;
    }

    public void initController() {
        showLv.getEasy().addActionListener(e -> {
            try {
                showLv.startGame(1);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            showLv.getjFrame().dispose();
        });
        showLv.getMedium().addActionListener(e -> {
            try {
                showLv.startGame(2);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            showLv.getjFrame().dispose();
        });
        showLv.getHard().addActionListener(e -> {
            try {
                showLv.startGame(3);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            showLv.getjFrame().dispose();
        });

    }
}
