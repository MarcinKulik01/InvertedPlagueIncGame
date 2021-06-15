package com.company.Menu;

import com.company.HighScore.ListView;
import com.company.LvClass.ShowLv;
import com.company.LvClass.ShowLvController;

import javax.swing.*;
import java.io.IOException;

public class MenuController {


    private MenuView menuView;



    public MenuController(MenuView menuView) throws IOException {
        this.menuView = menuView;
    }

    public void initController() {
        menuView.getStartNewGame().addActionListener(e -> {
            SwingUtilities.invokeLater(()-> {
                ShowLv showLv = new ShowLv(menuView);
                ShowLvController showLvController = new ShowLvController(showLv);
                showLvController.initController();
                menuView.getjFrame().setVisible(false);
            });
        });
        menuView.getLoadGame().addActionListener(e -> {
            Runtime.getRuntime().exit(1);
        });
        menuView.getShowHightScore().addActionListener(e -> {
                SwingUtilities.invokeLater(()-> {
                    try {
                        new ListView();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                });

        });
    }
}
