package com.company.MainGame;

import com.company.Countries.Country;
import com.company.Menu.MenuView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class GameController{

    private GameModel gameModel;
    private GameView gameView;
    private MenuView menuView;


    public GameController(GameModel gameModel, GameView gameView, MenuView menuView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
        this.menuView = menuView;
    }

    public void initController() {

        gameView.getjFrame().addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {

                JFrame frame = new JFrame("CLOSE");
                int result = JOptionPane.showConfirmDialog(frame, "Czy na pewno chcesz zamknac okno?");

                if(result == 0)
                {
                    gameView.getjFrame().dispose();
                     Runtime.getRuntime().exit(1);
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        gameView.getjFrame().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Q) && ((e.getModifiers() &
                        KeyEvent.CTRL_MASK) != 0)&& ((e.getModifiers() & KeyEvent.SHIFT_MASK) != 0)) {
                    gameView.getjFrame().dispose();

                    menuView.getjFrame().setVisible(true);
                    for (Thread t : Thread.getAllStackTraces().keySet())
                    {  if (t.getState()==Thread.State.RUNNABLE)
                        t.stop();
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        gameView.getChoseCountry().addActionListener(e->{
            String[] strings = new String[gameModel.getCountryLinkedList().size()];
            int pom=0;
            for(Country country : gameModel.getCountryLinkedList()){
                strings[pom++] = country.getName();
            }

                String s = (String) JOptionPane.showInputDialog(null,
                        "Wybierz kraj i zatwierdz wybor",
                        "Chose country",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        strings,
                        strings[0]);

            if(strings!=null) {
                gameView.getShowCountry().setText(" "+s);
                for(Country country : gameModel.getCountryLinkedList()){
                    if(s==country.getName())
                        gameView.getShow().setText(country.toString());
                }
            }
            else
                gameView.getShowCountry().setText(" wybierz ->");
        });


        for(JLabel gj : gameView.getLabels()) {
            gj.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {

                       SwingUtilities.invokeLater(()-> {
                           try {
                               showOptionMessege(gj);
                           } catch (IOException ioException) {
                               ioException.printStackTrace();
                           }
                       });
                }
            });
        }
        gameView.getOption1Number1().addActionListener(e->{
            function(gameView.getOption1Number1(),5);
        });

        gameView.getOption2Number1().addActionListener(e->{
            function(gameView.getOption2Number1(),5);
        });

        gameView.getOption3Number1().addActionListener(e->{
            function(gameView.getOption3Number1(),5);
        });

        gameView.getOption4Number1().addActionListener(e->{
            function(gameView.getOption4Number1(),5);
        });

        gameView.getOption5Number1().addActionListener(e->{
            function(gameView.getOption5Number1(),5);
        });

        gameView.getOption6Number1().addActionListener(e->{
            function(gameView.getOption6Number1(),5);
        });

        gameView.getOption1Number2().addActionListener(e->{
            function(gameView.getOption1Number1(),gameView.getOption1Number2(),10);
        });

        gameView.getOption2Number2().addActionListener(e->{
            function(gameView.getOption2Number1(),gameView.getOption2Number2(),10);
        });

        gameView.getOption3Number2().addActionListener(e->{
            function(gameView.getOption3Number1(),gameView.getOption3Number2(),10);
        });

        gameView.getOption4Number2().addActionListener(e->{
            function(gameView.getOption4Number1(),gameView.getOption4Number2(),10);
        });

        gameView.getOption5Number2().addActionListener(e->{
            function(gameView.getOption5Number1(),gameView.getOption5Number2(),10);
        });

        gameView.getOption6Number2().addActionListener(e->{
            function(gameView.getOption6Number1(),gameView.getOption6Number2(),10);
        });

        gameView.getOption1Number3().addActionListener(e->{
            function(gameView.getOption1Number2(),gameView.getOption1Number1(),gameView.getOption1Number3(),10);
        });

        gameView.getOption2Number3().addActionListener(e->{
            function(gameView.getOption2Number2(),gameView.getOption2Number1(),gameView.getOption2Number3(),15);
        });

        gameView.getOption3Number3().addActionListener(e->{
            function(gameView.getOption3Number1(),gameView.getOption3Number2(),gameView.getOption3Number3(),15);
        });

        gameView.getOption4Number3().addActionListener(e->{
            function(gameView.getOption4Number2(),gameView.getOption4Number1(),gameView.getOption4Number3(),15);
        });

        gameView.getOption5Number3().addActionListener(e->{
            function(gameView.getOption5Number2(),gameView.getOption5Number1(),gameView.getOption5Number3(),15);
        });

        gameView.getOption6Number3().addActionListener(e->{
            function(gameView.getOption6Number2(),gameView.getOption6Number1(),gameView.getOption6Number3(),15);
        });

        gameView.getOption7Number1().addActionListener(e->{
            function(gameView.getOption7Number1(),30);
        });

        gameView.getOption8Number1().addActionListener(e->{
            function(gameView.getOption8Number1(),40);
        });

        gameView.getOption9Number1().addActionListener(e->{
            function(gameView.getOption9Number1(),50);
        });

        gameView.getBuy().addActionListener(e->{
            createGameInfo();
        });

    }

    private void createGameInfo() {
        JFrame frame = new JFrame("Game INFO");
        JOptionPane pane = new JOptionPane("** *** ** *** **     GAME INFO   ** *** ** *** **\n\n" +
                " 1: Licznik wskazuje procent zakazonych \n"+
                " 2: Z lewej strony znajduja sie dane z gry,\n " +
                "    moze wybrac kokretne dane do wyswietlenia\n"+
                " 3: Z prawej znajduja sie ulepszenia\n" +
                "    poziomowane i kontkretne (numerek oznacza)\n" +
                "    ilosc punktow potrzebnych do ulepszenia\n"+
                " 4: U gory znajduje sie rowniez tablica co sie\n" +
                "    dzieje w grze\n"+
                " 5: Gra toczy sie do osiagniecia 0 zakazonych lub\n" +
                "    100% zakozonych (ps czasem licznik wskazuje 0\n " +
                "    ale nie wszyscy sa zakazni. Mozna sprawdzic " +
                "    to najezdzajac na info ikony lub wypierajac\n " +
                "    z listy krajow   \n"+
                "6:  1 poziom = bonus 1%, 2 i 3 poziom=bonus2%\n" +
                "    ulepszenia dodatkowe od gory 10%,15%,20%\n"+
                " 7: Wyjscie z gry ctrl+shift+q\n\n"+
                "** *** ** *** **    GAME INFO  ** *** ** *** **");

        pane.setPreferredSize(new Dimension(350,400));
        JDialog dialog = pane.createDialog(frame, "Information");
        dialog.setVisible(true);
        dialog.dispose();
    }

    private void function(JButton buttonCheck, JButton buttonCheck1, JButton button, int number) {
        if(buttonCheck.getBackground()==Color.green&&buttonCheck1.getBackground()==Color.green) {
            if (button.getBackground()!=Color.GREEN) {
                if (gameModel.getPoints() >= number) {
                    button.setBackground(Color.GREEN);
                    gameModel.setPoints(gameModel.getPoints() - number);
                    gameView.getPointsA().setText(gameModel.getPoints() + "");
                    addBonus(number);
                } else {
                    JOptionPane.showMessageDialog(null, " Za malo punktow ", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, " Najpierw odblokuj wczesniejsze ulepszenia ", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }


    private void function(JButton buttonCheck , JButton button, int number) {
        if (buttonCheck.getBackground() == Color.GREEN) {
            if (button.getBackground() != Color.GREEN) {
                if (gameModel.getPoints() >= number) {
                    button.setBackground(Color.GREEN);
                    gameModel.setPoints(gameModel.getPoints() - number);
                    gameView.getPointsA().setText(gameModel.getPoints() + "");
                    addBonus(number);
                } else {
                    JOptionPane.showMessageDialog(null, " Za malo punktow ", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, " Najpierw odblokuj wczesniejsze ulepszenia ", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void function(JButton button, int number) {
        if(button.getBackground()!=Color.GREEN) {
            if(gameModel.getPoints()>=number) {
                button.setBackground(Color.GREEN);
                gameModel.setPoints(gameModel.getPoints() - number);
                gameView.getPointsA().setText(gameModel.getPoints() + "");
                addBonus(number);
            }
            else{
                JOptionPane.showMessageDialog(null, " Za malo punktow ", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private void addBonus(int number){
        switch (number){
            case 5 -> gameModel.setBonusTreatment(gameModel.getBonusTreatment()+1);
            case 10 -> gameModel.setBonusTreatment(gameModel.getBonusTreatment()+2);
            case 15 -> gameModel.setBonusTreatment(gameModel.getBonusTreatment()+2);
            case 30 -> gameModel.setBonusTreatment(gameModel.getBonusTreatment()+10);
            case 40 -> gameModel.setBonusTreatment(gameModel.getBonusTreatment()+15);
            case 50 -> gameModel.setBonusTreatment(gameModel.getBonusTreatment()+20);
            default -> System.out.println("err");
        }

        switch (number){
            case 5 -> gameView.getGameInformations().setText("WOW WOW WOW poziom 1 spiesz sie wirus sie rowzija");
            case 10 -> gameView.getGameInformations().setText("WOW WOW WOW poziom 2 spiesz sie wirus sie rowzija");
            case 15 -> gameView.getGameInformations().setText("WOW WOW WOW poziom 3 spiesz sie wirus sie rowzija");
            case 30 -> gameView.getGameInformations().setText("wszedzie policjaaaaaa, czas wyjechac z kraju");
            case 40 -> gameView.getGameInformations().setText("komu maske komu komu???");
            case 50 -> gameView.getGameInformations().setText("Teraz to ludzie beda sie nudzic... ahh ta pandemia");
            default -> System.out.println("err");
        }

        gameModel.setFinalPoints(gameModel.getFinalPoints()+number);
        gameView.getFinalPointsA().setText(gameModel.getFinalPoints()+"");

        gameModel.setUpgradePoints(gameModel.getUpgradePoints()+1);
        gameView.getFinalUpgradesA().setText(gameModel.getUpgradePoints()+"/36");
    }

    private void showOptionMessege(JLabel gj) throws IOException {

        JFrame frame = new JFrame("choseSTH");
        JOptionPane pane = new JOptionPane();
        pane.setPreferredSize(new Dimension(300,130));

        Country country;

        switch (gj.getName()){

            case "brazil" ->  country = gameModel.getBrazil();
            case "venezuela" -> country = gameModel.getVenezuela();
            case "colombia" ->country = gameModel.getColombia();
            case "ecuador" ->country = gameModel.getEcuador();
            case "peru" ->country = gameModel.getPeru();
            case "chile" ->country = gameModel.getChile();
            case "argentina" ->country = gameModel.getArgentina();
            case "uruguay" ->country = gameModel.getUruguay();
            case "paraguay" ->country = gameModel.getParaguay();
            case "bolivia" ->country = gameModel.getBolivia();
            case "suriname" ->country = gameModel.getSuriname();
            case "guyanaFR" ->country = gameModel.getGuyanaFR();
            case "guyana" ->country = gameModel.getGuyana();

            default -> throw new IllegalStateException("Unexpected value: " + gj.getName());
        }


        pane.setMessage("W "+country.getName()+" wystopilo "+country.getInfected()+" zarazen");
        JProgressBar jProgressBar = new JProgressBar(1,country.getPopulation());
        jProgressBar.setValue(country.getInfected());
        jProgressBar.setForeground(Color.red);
        jProgressBar.setStringPainted(true);
        pane.add(jProgressBar,1);
        JDialog dialog = pane.createDialog(frame, "Information");
        dialog.setVisible(true);
        dialog.dispose();
    }

}

