package com.company.Menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MenuView{

    private JFrame jFrame;
    private JButton startNewGame;
    private JButton showHightScore;
    private JButton loadGame;
    private JLabel programType;
    private JPanel mainView;


    public MenuView(String title) throws IOException {


        programType = new JLabel(" WITAJ W GRZE POKONAC COVID19 !!!! ");
        programType.setFont(new Font("sans-serif",Font.BOLD,20));
        programType.setForeground(new Color(136, 176, 75));
        programType.setBounds(200,40,410,40);
        programType.setVisible(true);


        startNewGame = new JButton("Start game");
        startNewGame.setBounds(325,100,150,60);
        startNewGame.setOpaque(true);
        startNewGame.setBackground(Color.GREEN);
        startNewGame.setBorder(BorderFactory.createLineBorder(Color.black));
        startNewGame.setVisible(true);

        showHightScore = new JButton("High scores");
        showHightScore.setBounds(325,200,150,60);
        showHightScore.setOpaque(true);
        showHightScore.setBackground(Color.ORANGE);
        showHightScore.setBorder(BorderFactory.createLineBorder(Color.black));
        showHightScore.setVisible(true);

        loadGame = new JButton("EXIT");
        loadGame.setBounds(325,300,150,60);
        loadGame.setOpaque(true);
        loadGame.setBackground(Color.red);
        loadGame.setBorder(BorderFactory.createLineBorder(Color.black));
        loadGame.setVisible(true);


        BufferedImage myPicture = ImageIO.read(new File("src/com/company/IMG/main.png"));
        Image img = getScaledImage(myPicture,800,500);
        jFrame = new JFrame();

        jFrame.setContentPane(new JLabel(new ImageIcon(img)));

        jFrame.setTitle(title);
        jFrame.add(startNewGame);
        jFrame.add(showHightScore);
        jFrame.add(loadGame);
        jFrame.add(programType);

        jFrame.setSize(800,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);


    }

    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    public JButton getStartNewGame() {
        return startNewGame;
    }

    public void setStartNewGame(JButton startNewGame) {
        this.startNewGame = startNewGame;
    }

    public JButton getShowHightScore() {
        return showHightScore;
    }

    public void setShowHightScore(JButton showHightScore) {
        this.showHightScore = showHightScore;
    }

    public JButton getLoadGame() {
        return loadGame;
    }

    public void setLoadGame(JButton loadGame) {
        this.loadGame = loadGame;
    }

    public JLabel getProgramType() {
        return programType;
    }

    public void setProgramType(JLabel programType) {
        this.programType = programType;
    }


}
