package com.company.Save;

import com.company.LvClass.ShowLv;
import com.company.MainGame.GameView;
import com.company.Menu.MenuView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveController {

    private GameView gameView;
    private SaveView saveView;
    private SaveModel saveModel;
    private MenuView menuView;

    public SaveController(SaveView saveView, SaveModel saveModel, MenuView menuView, GameView gameView) {
    this.saveModel = saveModel;
    this.saveView = saveView;
    this.menuView = menuView;
    this.gameView = gameView;
    }

    public void initController() {
        saveView.getEasy().addActionListener(e -> {
            try {

                File plik = new File("src/com/company/IMG/HighScoreInf.txt");

                FileWriter fileWriter = new FileWriter(plik,true);
                String str = "\n"+saveView.getName1().getText()+","+saveView.getSurname().getText()+","+saveView.getAge().getText()+","+
                                     saveModel.getPoints()+","+saveModel.getTime()+","+saveModel.getOut()+","+saveModel.getPoziom()+","+saveModel.getRodzaj();
                fileWriter.write(str);

                fileWriter.flush();
                fileWriter.close();

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            menuView.getjFrame().setVisible(true);
            gameView.getjFrame().dispose();
            saveView.getjFrame().dispose();
        });
    }
}
