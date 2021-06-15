package com.company;

import com.company.Menu.MenuController;
import com.company.Menu.MenuView;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
    SwingUtilities.invokeLater(()-> {

        MenuView menuView = null;
        try {
            menuView = new MenuView("GAME MENU");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        MenuController mainController = null;
        try {
            mainController = new MenuController(menuView);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        mainController.initController();
    });

    }
}
