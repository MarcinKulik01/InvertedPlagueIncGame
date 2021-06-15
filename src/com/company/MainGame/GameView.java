package com.company.MainGame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameView {

    private JFrame jFrame;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel topPanel;

    private JLabel finalPoints;
    private JLabel finalPointsA;
    private JLabel finalUpgrades;
    private JLabel finalUpgradesA;
    private JLabel infectedShow;
    private JLabel infectedShowA;
    private JLabel points;
    private JLabel pointsA;
    private JLabel cured;
    private JLabel curedA;
    private JButton buy;
    private JLabel showCountry;
    private JButton choseCountry;
    private JLabel picLabel;
    private JLabel picLabel1;
    private JLabel picLabel2;
    private JLabel picLabel3;
    private JLabel picLabel4;
    private JLabel questionIcon1;

    private JLabel option1;
    private JButton option1Number1;
    private JButton option1Number2;
    private JButton option1Number3;

    private JLabel option2;
    private JButton option2Number1;
    private JButton option2Number2;
    private JButton option2Number3;

    private JLabel option3;
    private JButton option3Number1;
    private JButton option3Number2;
    private JButton option3Number3;

    private JLabel option4;
    private JButton option4Number1;
    private JButton option4Number2;
    private JButton option4Number3;

    private JLabel option5;
    private JButton option5Number1;
    private JButton option5Number2;
    private JButton option5Number3;

    private JLabel option6;
    private JButton option6Number1;
    private JButton option6Number2;
    private JButton option6Number3;

    private JButton option7Number1;
    private JButton option8Number1;
    private JButton option9Number1;


    private JTextArea show;

    private JTextArea gameInformations;
    private JLabel time;
    private JProgressBar infected;
    private GameModel gameModel;

    private JLabel imgLabel;

    private JLabel brazil;
    private JLabel bolivia;
    private JLabel paraguay;
    private JLabel uruguay;
    private JLabel argentina;
    private JLabel chile;
    private JLabel peru;
    private JLabel ecuador;
    private JLabel colombia;
    private JLabel venezuela;
    private JLabel guyana;
    private JLabel guyanaFR;
    private JLabel suriname;

    private JLabel[] labels;

    private JPanel rightPanelUpgrades;

    public GameView(String title,GameModel gameModel) throws IOException {
        this.gameModel = gameModel;
        jFrame = new JFrame();
        jFrame.setTitle(title);

         createPanelLeft();
         createPanelCenter();
         createPanelTOP();
         createPanelRight();


        jFrame.add(rightPanel,BorderLayout.NORTH);
        jFrame.add(leftPanel,BorderLayout.WEST);
        jFrame.add(topPanel,BorderLayout.CENTER);
        jFrame.add(rightPanelUpgrades,BorderLayout.EAST);
        jFrame.setSize(900,790);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setFocusable(true);
        jFrame.requestFocusInWindow();
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);

    }

    private void createPanelRight() {

        rightPanelUpgrades = new JPanel(new GridBagLayout());
        rightPanelUpgrades.setPreferredSize(new Dimension(200,700));
        rightPanelUpgrades.setBackground(Color.orange);
        rightPanelUpgrades.setLayout(null);

        option1 = new JLabel("ulepszenie szpitali");
        option1.setBounds(40,10,140,30);

        option1Number1 = new JButton();
        option1Number1.setBounds(35, 55, 30, 30);
        option1Number1.setOpaque(true);
        option1Number1.setText("5");
        option1Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option1Number1.setBackground(new Color(0xe34234));
        option1Number1.setVisible(true);

        option1Number2 = new JButton();
        option1Number2.setBounds(85, 55, 30, 30);
        option1Number2.setOpaque(true);
        option1Number2.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option1Number2.setBackground(new Color(0xe34234));
        option1Number2.setText("10");
        option1Number2.setVisible(true);

        option1Number3 = new JButton();
        option1Number3.setBounds(135, 55, 30, 30);
        option1Number3.setOpaque(true);
        option1Number3.setText("15");
        option1Number3.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option1Number3.setBackground(new Color(0xe34234));
        option1Number3.setVisible(true);

        option2 = new JLabel("ulepszenie odpornosci");
        option2.setBounds(25,100,150,30);

        option2Number1 = new JButton();
        option2Number1.setText("5");
        option2Number1.setBounds(35,145,30,30);
        option2Number1.setOpaque(true);
        option2Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option2Number1.setBackground(new Color(0xe34234));
        option2Number1.setVisible(true);

        option2Number2 = new JButton();
        option2Number2.setBounds(85,145,30,30);
        option2Number2.setOpaque(true);
        option2Number2.setText("10");
        option2Number2.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option2Number2.setBackground(new Color(0xe34234));
        option2Number2.setVisible(true);

        option2Number3 = new JButton();
        option2Number3.setBounds(135,145,30,30);
        option2Number3.setOpaque(true);
        option2Number3.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option2Number3.setBackground(new Color(0xe34234));
        option2Number3.setText("15");
        option2Number3.setVisible(true);

        option3 = new JLabel("ulepszenie higieny");
        option3.setBounds(30,190,140,30);

        option3Number1 = new JButton();
        option3Number1.setText("5");
        option3Number1.setBounds(35,235,30,30);
        option3Number1.setOpaque(true);
        option3Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option3Number1.setBackground(new Color(0xe34234));
        option3Number1.setVisible(true);

        option3Number2 = new JButton();
        option3Number2.setBounds(85,235,30,30);
        option3Number2.setOpaque(true);
        option3Number2.setText("10");
        option3Number2.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option3Number2.setBackground(new Color(0xe34234));
        option3Number2.setVisible(true);

        option3Number3 = new JButton();
        option3Number3.setBounds(135,235,30,30);
        option3Number3.setOpaque(true);
        option3Number3.setText("15");
        option3Number3.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option3Number3.setBackground(new Color(0xe34234));
        option3Number3.setVisible(true);

        option4 = new JLabel("ulepszenie swiadomosci");
        option4.setBounds(20,280,180,30);

        option4Number1 = new JButton();
        option4Number1.setBounds(35,325,30,30);
        option4Number1.setText("5");
        option4Number1.setOpaque(true);
        option4Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option4Number1.setBackground(new Color(0xe34234));
        option4Number1.setVisible(true);

        option4Number2 = new JButton();
        option4Number2.setBounds(85,325,30,30);
        option4Number2.setText("10");
        option4Number2.setOpaque(true);
        option4Number2.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option4Number2.setBackground(new Color(0xe34234));
        option4Number2.setVisible(true);

        option4Number3 = new JButton();
        option4Number3.setBounds(135,325,30,30);
        option4Number3.setText("15");
        option4Number3.setOpaque(true);
        option4Number3.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option4Number3.setBackground(new Color(0xe34234));
        option4Number3.setVisible(true);

        option5 = new JLabel("odpowiedzialnosc");
        option5.setBounds(40,370,180,30);

        option5Number1 = new JButton();
        option5Number1.setBounds(35,415,30,30);
        option5Number1.setText("5");
        option5Number1.setOpaque(true);
        option5Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option5Number1.setBackground(new Color(0xe34234));
        option5Number1.setVisible(true);

        option5Number2 = new JButton();
        option5Number2.setBounds(85,415,30,30);
        option5Number2.setText("10");
        option5Number2.setOpaque(true);
        option5Number2.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option5Number2.setBackground(new Color(0xe34234));
        option5Number2.setVisible(true);

        option5Number3 = new JButton();
        option5Number3.setBounds(135,415,30,30);
        option5Number3.setText("15");
        option5Number3.setOpaque(true);
        option5Number3.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option5Number3.setBackground(new Color(0xe34234));
        option5Number3.setVisible(true);

        option6 = new JLabel("ulepszenie mycia rak");
        option6.setBounds(30,460,140,30);

        option6Number1 = new JButton();
        option6Number1.setBounds(35,505,30,30);
        option6Number1.setText("5");
        option6Number1.setOpaque(true);
        option6Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option6Number1.setBackground(new Color(0xe34234));
        option6Number1.setVisible(true);

        option6Number2 = new JButton();
        option6Number2.setBounds(85,505,30,30);
        option6Number2.setText("10");
        option6Number2.setOpaque(true);
        option6Number2.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option6Number2.setBackground(new Color(0xe34234));
        option6Number2.setVisible(true);

        option6Number3 = new JButton();
        option6Number3.setBounds(135,505,30,30);
        option6Number3.setText("15");
        option6Number3.setOpaque(true);
        option6Number3.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option6Number3.setBackground(new Color(0xe34234));
        option6Number3.setVisible(true);


        option7Number1 = new JButton();
        option7Number1.setBounds(20,555,160,30);
        option7Number1.setText("godzina policyjna (20)");
        option7Number1.setOpaque(true);
        option7Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option7Number1.setBackground(new Color(0xe34234));
        option7Number1.setVisible(true);

        option8Number1 = new JButton();
        option8Number1.setBounds(20,605,160,30);
        option8Number1.setText("wszedzie maseczki (40)");
        option8Number1.setOpaque(true);
        option8Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option8Number1.setBackground(new Color(0xe34234));
        option8Number1.setVisible(true);

        option9Number1 = new JButton();
        option9Number1.setBounds(10,655,180,30);
        option9Number1.setText("zakaz imprez masowych(50)");
        option9Number1.setOpaque(true);
        option9Number1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        option9Number1.setBackground(new Color(0xe34234));
        option9Number1.setVisible(true);


        rightPanelUpgrades.add(option1);
        rightPanelUpgrades.add(option2);
        rightPanelUpgrades.add(option3);
        rightPanelUpgrades.add(option4);
        rightPanelUpgrades.add(option5);
        rightPanelUpgrades.add(option6);

        rightPanelUpgrades.add(option1Number1);
        rightPanelUpgrades.add(option1Number2);
        rightPanelUpgrades.add(option1Number3);

        rightPanelUpgrades.add(option2Number1);
        rightPanelUpgrades.add(option2Number2);
        rightPanelUpgrades.add(option2Number3);

        rightPanelUpgrades.add(option3Number1);
        rightPanelUpgrades.add(option3Number2);
        rightPanelUpgrades.add(option3Number3);

        rightPanelUpgrades.add(option4Number1);
        rightPanelUpgrades.add(option4Number2);
        rightPanelUpgrades.add(option4Number3);

        rightPanelUpgrades.add(option5Number1);
        rightPanelUpgrades.add(option5Number2);
        rightPanelUpgrades.add(option5Number3);

        rightPanelUpgrades.add(option6Number1);
        rightPanelUpgrades.add(option6Number2);
        rightPanelUpgrades.add(option6Number3);

        rightPanelUpgrades.add(option7Number1);
        rightPanelUpgrades.add(option8Number1);
        rightPanelUpgrades.add(option9Number1);

        rightPanelUpgrades.setBackground(new Color(0xF4AF1B));
        rightPanelUpgrades.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));

    }

    public Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

    public void createPanelTOP(){

        rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(1000,60));
        rightPanel.setLayout(null);


        gameInformations = new JTextArea("Witamy we wspanialej grze!!! Na poczatek otrzymasz 10pk na rozwoj i pokonanie wirusa!");
        gameInformations.setBounds(175,11,550,35);
        gameInformations.setVisible(true);
        gameInformations.setOpaque(true);
        gameInformations.setBackground(Color.LIGHT_GRAY);
        gameInformations.setWrapStyleWord(true);
        gameInformations.setEditable(false);
        gameInformations.setFont(new Font("Arial",Font.PLAIN,12));
        gameInformations.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black,1),
                BorderFactory.createEmptyBorder(5,5,5,5)));

        time = new JLabel("00:00:00");
        time.setBounds(760,15,80,30);
        time.setFont(new Font("Arial",Font.BOLD,20));
        time.setVisible(true);

        infected = new JProgressBar();
        infected.setValue(0);
        infected.setMaximum((int)(gameModel.getAllPeople()));
        infected.setStringPainted(true);
        infected.setBounds(50,gameInformations.getY()+5,100,30);
        infected.setOpaque(true);
        infected.setBorder(BorderFactory.createLineBorder(Color.black,1));
        infected.setVisible(true);
        infected.setBackground(Color.LIGHT_GRAY);

        rightPanel.add(infected);
        rightPanel.add(time);
        rightPanel.add(gameInformations);
        rightPanel.setBackground(new Color(0xF2BC94));
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));

    }

    public void createPanelLeft(){

        leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setPreferredSize(new Dimension(200,700));
        leftPanel.setBackground(Color.orange);
        leftPanel.setLayout(null);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        points = new JLabel("Punkty: ");
        points.setBounds(20,40,60,30);
        points.setVisible(true);

        constraints.gridx = 0;
        constraints.gridy = 0;

        leftPanel.add(points, constraints);

        pointsA = new JLabel("10");
        pointsA.setBounds(80,40,70,30);
        pointsA.setVisible(true);

        constraints.gridx = 1;
        leftPanel.add(pointsA, constraints);


        cured = new JLabel("Wyleczonych: ");
        cured.setBounds(20,80,100,30);
        cured.setVisible(true);


        constraints.gridx = 0;
        constraints.gridy = 1;
        leftPanel.add(cured, constraints);

        curedA = new JLabel(" 0 ");
        curedA.setBounds(120,80,100,30);
        curedA.setVisible(true);

        finalPoints = new JLabel("Wynik:  ");
        finalPoints.setBounds(20,120,50,30);
        finalPoints.setVisible(true);

        constraints.gridx = 0;
        constraints.gridy = 0;

        leftPanel.add(finalPoints, constraints);

        finalPointsA = new JLabel("0");
        finalPointsA.setBounds(70,120,70,30);
        finalPointsA.setVisible(true);

        constraints.gridx = 1;
        leftPanel.add(finalPointsA, constraints);

        finalUpgrades = new JLabel("Ulepszenia: ");
        finalUpgrades.setBounds(20,160,80,30);
        finalUpgrades.setVisible(true);

        constraints.gridx = 0;
        constraints.gridy = 0;

        leftPanel.add(finalUpgrades, constraints);

        finalUpgradesA = new JLabel("0/21");
        finalUpgradesA.setBounds(100,160,50,30);
        finalUpgradesA.setVisible(true);

        infectedShow = new JLabel("Zachorowan: ");
        infectedShow.setBounds(20,200,90,30);
        infectedShow.setVisible(true);

        constraints.gridx = 0;
        constraints.gridy = 0;

        leftPanel.add(infectedShow, constraints);

        infectedShowA = new JLabel("0");
        infectedShowA.setBounds(110,200,80,30);
        infectedShowA.setVisible(true);

        constraints.gridx = 1;
        leftPanel.add(infectedShowA, constraints);


        constraints.gridx = 1;
        leftPanel.add(finalUpgradesA, constraints);

        constraints.gridx = 1;
        leftPanel.add(curedA, constraints);

        showCountry = new JLabel(" wybierz ->");
        showCountry.setBounds(20,300,100,30);
        showCountry.setBorder(BorderFactory.createLineBorder(Color.black,1));
        showCountry.setOpaque(true);
        showCountry.setVisible(true);
        showCountry.setBackground(new Color(0xF2BC94));

        choseCountry = new JButton();
        choseCountry.setBounds(130,300,30,30);
        choseCountry.setVisible(true);
        choseCountry.setBorder(BorderFactory.createLineBorder(Color.black,1));
        choseCountry.setBackground(new Color(0xF2BC94));


        leftPanel.add(showCountry);
        leftPanel.add(choseCountry);

        buy = new JButton(" game info! ");
        buy.setBounds(20,250,150,30);
        buy.setBackground(new Color(0xF2BC94));
        buy.setBorder(BorderFactory.createLineBorder(Color.black,1));
        buy.setOpaque(true);
        buy.setVisible(false);

        leftPanel.add(buy);

        show = new JTextArea();
        show.setEditable(false);
        show.setLineWrap(true);
        show.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black,1),BorderFactory.createEmptyBorder(5,5,5,5)));
        show.setWrapStyleWord(true);
        show.setVisible(true);
        show.setBackground(new Color(0xF2BC94));
        show.setBounds(15,350,160,300);

        leftPanel.setBackground(new Color(0xF4AF1B));
        leftPanel.add(show);
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));

    }

    public void createPanelCenter() throws IOException {

        BufferedImage myPicture = ImageIO.read(new File("src/com/company/IMG/Map.png"));
        Image img = getScaledImage(myPicture,500,700);

        BufferedImage myPicture2 = ImageIO.read(new File("src/com/company/IMG/questionIcon.png"));
        Image img2 = getScaledImage(myPicture2,10,10);

        topPanel = new JPanel();
        topPanel.setLayout(null);

        BufferedImage myPicture3 = ImageIO.read(new File("src/com/company/IMG/bus.png"));
        Image img1 = getScaledImage(myPicture3,30,30);
        picLabel = new JLabel(new ImageIcon(img1));
        picLabel.setBounds(100,100,30,30);
        picLabel.setOpaque(false);
        picLabel.setVisible(true);
        topPanel.add(picLabel);

        BufferedImage myPicture4 = ImageIO.read(new File("src/com/company/IMG/723955.png"));
        Image img4 = getScaledImage(myPicture4,50,50);
        picLabel1 = new JLabel(new ImageIcon(img4));
        picLabel1.setBounds(160,500,50,50);
        picLabel1.setOpaque(false);
        picLabel1.setVisible(true);
        topPanel.add(picLabel1);

        BufferedImage myPicture5 = ImageIO.read(new File("src/com/company/IMG/teamwork.png"));
        Image img5 = getScaledImage(myPicture5,40,30);
        picLabel2 = new JLabel(new ImageIcon(img5));
        picLabel2.setBounds(200,400,40,30);
        picLabel2.setOpaque(false);
        picLabel2.setVisible(true);
        topPanel.add(picLabel2);

        BufferedImage myPicture6 = ImageIO.read(new File("src/com/company/IMG/3176465.png"));
        Image img6 = getScaledImage(myPicture6,30,30);
        picLabel3 = new JLabel(new ImageIcon(img6));
        picLabel3.setBounds(110,130,30,30);
        picLabel3.setOpaque(false);
        picLabel3.setVisible(true);
        topPanel.add(picLabel3);

        BufferedImage myPicture7 = ImageIO.read(new File("src/com/company/IMG/train.png"));
        Image img7 = getScaledImage(myPicture7,30,30);
        picLabel4 = new JLabel(new ImageIcon(img7));
        picLabel4.setBounds(220,250,30,30);
        picLabel4.setOpaque(false);
        picLabel4.setVisible(true);
        topPanel.add(picLabel4);

        imgLabel = new JLabel(new ImageIcon(img));
        imgLabel.setBounds(0,0,500,700);
        imgLabel.setOpaque(false);
        imgLabel.setVisible(true);

        venezuela = new JLabel((new ImageIcon(img2)));
        venezuela.setBounds(200,60,10,10);
        venezuela.setOpaque(false);
        venezuela.setVisible(true);
        venezuela.setName("venezuela");

        colombia = new JLabel((new ImageIcon(img2)));
        colombia.setBounds(150,90,10,10);
        colombia.setOpaque(false);
        colombia.setVisible(true);
        colombia.setName("colombia");

        ecuador = new JLabel((new ImageIcon(img2)));
        ecuador.setBounds(110,130,10,10);
        ecuador.setOpaque(false);
        ecuador.setVisible(true);
        ecuador.setName("ecuador");

        paraguay = new JLabel((new ImageIcon(img2)));
        paraguay.setBounds(250,300,10,10);
        paraguay.setOpaque(false);
        paraguay.setVisible(true);
        paraguay.setName("paraguay");

        bolivia = new JLabel(new ImageIcon(getScaledImage(myPicture2,20,20)));
        bolivia.setBounds(220,250,20,20);
        bolivia.setOpaque(false);
        bolivia.setVisible(true);
        bolivia.setName("bolivia");

        peru = new JLabel(new ImageIcon(getScaledImage(myPicture2,20,20)));
        peru.setBounds(130,180,20,20);
        peru.setOpaque(false);
        peru.setVisible(true);
        peru.setName("peru");

        chile = new JLabel((new ImageIcon(img2)));
        chile.setBounds(160,500,10,10);
        chile.setOpaque(false);
        chile.setVisible(true);
        chile.setName("chile");

        uruguay = new JLabel((new ImageIcon(img2)));
        uruguay.setBounds(275,395,10,10);
        uruguay.setOpaque(false);
        uruguay.setVisible(true);
        uruguay.setName("uruguay");

        argentina = new JLabel((new ImageIcon(getScaledImage(myPicture2,25,25))));
        argentina.setBounds(200,400,25,25);
        argentina.setOpaque(false);
        argentina.setVisible(true);
        argentina.setName("argentina");

        brazil = new JLabel((new ImageIcon(getScaledImage(myPicture2,25,25))));
        brazil.setBounds(330,220,25,25);
        brazil.setOpaque(false);
        brazil.setVisible(true);
        brazil.setName("brazil");

        guyana = new JLabel(new ImageIcon(img2));
        guyana.setBounds(250,75,10,10);
        guyana.setOpaque(false);
        guyana.setVisible(true);
        guyana.setName("guyana");

        suriname = new JLabel(new ImageIcon(img2));
        suriname.setBounds(280,80,10,10);
        suriname.setOpaque(false);
        suriname.setVisible(true);
        suriname.setName("suriname");

        guyanaFR = new JLabel(new ImageIcon(img2));
        guyanaFR.setBounds(300,90,10,10);
        guyanaFR.setOpaque(false);
        guyanaFR.setVisible(true);
        guyanaFR.setName("guyanaFR");

        topPanel.add(venezuela);
        topPanel.add(colombia);
        topPanel.add(ecuador);
        topPanel.add(paraguay);
        topPanel.add(bolivia);
        topPanel.add(peru);
        topPanel.add(chile);
        topPanel.add(uruguay);
        topPanel.add(argentina);
        topPanel.add(brazil);
        topPanel.add(guyana);
        topPanel.add(suriname);
        topPanel.add(guyanaFR);

        labels = new JLabel[] {venezuela,colombia,ecuador,paraguay,bolivia,peru,chile,uruguay,argentina,
                brazil,guyana,suriname,guyanaFR};

        topPanel.setSize(new Dimension(500,700));
        topPanel.setBackground(new Color(0x00154F));
        topPanel.add(imgLabel);
        topPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));

    }

    public JLabel getOption1() {
        return option1;
    }

    public void setOption1(JLabel option1) {
        this.option1 = option1;
    }

    public JButton getOption1Number1() {
        return option1Number1;
    }

    public void setOption1Number1(JButton option1Number1) {
        this.option1Number1 = option1Number1;
    }

    public JButton getOption1Number2() {
        return option1Number2;
    }

    public void setOption1Number2(JButton option1Number2) {
        this.option1Number2 = option1Number2;
    }

    public JButton getOption1Number3() {
        return option1Number3;
    }

    public void setOption1Number3(JButton option1Number3) {
        this.option1Number3 = option1Number3;
    }

    public JLabel getOption2() {
        return option2;
    }

    public void setOption2(JLabel option2) {
        this.option2 = option2;
    }

    public JButton getOption2Number1() {
        return option2Number1;
    }

    public void setOption2Number1(JButton option2Number1) {
        this.option2Number1 = option2Number1;
    }

    public JButton getOption2Number2() {
        return option2Number2;
    }

    public void setOption2Number2(JButton option2Number2) {
        this.option2Number2 = option2Number2;
    }

    public JButton getOption2Number3() {
        return option2Number3;
    }

    public void setOption2Number3(JButton option2Number3) {
        this.option2Number3 = option2Number3;
    }

    public JLabel getOption3() {
        return option3;
    }

    public void setOption3(JLabel option3) {
        this.option3 = option3;
    }

    public JButton getOption3Number1() {
        return option3Number1;
    }

    public void setOption3Number1(JButton option3Number1) {
        this.option3Number1 = option3Number1;
    }

    public JButton getOption3Number2() {
        return option3Number2;
    }

    public void setOption3Number2(JButton option3Number2) {
        this.option3Number2 = option3Number2;
    }

    public JButton getOption3Number3() {
        return option3Number3;
    }

    public void setOption3Number3(JButton option3Number3) {
        this.option3Number3 = option3Number3;
    }

    public JLabel getOption4() {
        return option4;
    }

    public void setOption4(JLabel option4) {
        this.option4 = option4;
    }

    public JButton getOption4Number1() {
        return option4Number1;
    }

    public void setOption4Number1(JButton option4Number1) {
        this.option4Number1 = option4Number1;
    }

    public JButton getOption4Number2() {
        return option4Number2;
    }

    public void setOption4Number2(JButton option4Number2) {
        this.option4Number2 = option4Number2;
    }

    public JButton getOption4Number3() {
        return option4Number3;
    }

    public void setOption4Number3(JButton option4Number3) {
        this.option4Number3 = option4Number3;
    }

    public JLabel getOption5() {
        return option5;
    }

    public void setOption5(JLabel option5) {
        this.option5 = option5;
    }

    public JButton getOption5Number1() {
        return option5Number1;
    }

    public void setOption5Number1(JButton option5Number1) {
        this.option5Number1 = option5Number1;
    }

    public JButton getOption5Number2() {
        return option5Number2;
    }

    public void setOption5Number2(JButton option5Number2) {
        this.option5Number2 = option5Number2;
    }

    public JButton getOption5Number3() {
        return option5Number3;
    }

    public void setOption5Number3(JButton option5Number3) {
        this.option5Number3 = option5Number3;
    }

    public JLabel getOption6() {
        return option6;
    }

    public void setOption6(JLabel option6) {
        this.option6 = option6;
    }

    public JButton getOption6Number1() {
        return option6Number1;
    }

    public void setOption6Number1(JButton option6Number1) {
        this.option6Number1 = option6Number1;
    }

    public JButton getOption6Number2() {
        return option6Number2;
    }

    public void setOption6Number2(JButton option6Number2) {
        this.option6Number2 = option6Number2;
    }

    public JButton getOption6Number3() {
        return option6Number3;
    }

    public void setOption6Number3(JButton option6Number3) {
        this.option6Number3 = option6Number3;
    }

    public JButton getOption7Number1() {
        return option7Number1;
    }

    public void setOption7Number1(JButton option7Number1) {
        this.option7Number1 = option7Number1;
    }



    public JButton getOption8Number1() {
        return option8Number1;
    }

    public void setOption8Number1(JButton option8Number1) {
        this.option8Number1 = option8Number1;
    }

    public JButton getOption9Number1() {
        return option9Number1;
    }

    public void setOption9Number1(JButton option9Number1) {
        this.option9Number1 = option9Number1;
    }

    public JPanel getRightPanelUpgrades() {
        return rightPanelUpgrades;
    }

    public void setRightPanelUpgrades(JPanel rightPanelUpgrades) {
        this.rightPanelUpgrades = rightPanelUpgrades;
    }

    public JLabel getPicLabel1() {
        return picLabel1;
    }

    public void setPicLabel1(JLabel picLabel1) {
        this.picLabel1 = picLabel1;
    }

    public JLabel getPicLabel2() {
        return picLabel2;
    }

    public void setPicLabel2(JLabel picLabel2) {
        this.picLabel2 = picLabel2;
    }

    public JLabel getPicLabel3() {
        return picLabel3;
    }

    public void setPicLabel3(JLabel picLabel3) {
        this.picLabel3 = picLabel3;
    }

    public JLabel getPicLabel4() {
        return picLabel4;
    }

    public void setPicLabel4(JLabel picLabel4) {
        this.picLabel4 = picLabel4;
    }

    public JLabel getInfectedShow() {
        return infectedShow;
    }

    public void setInfectedShow(JLabel infectedShow) {
        this.infectedShow = infectedShow;
    }

    public JLabel getInfectedShowA() {
        return infectedShowA;
    }

    public void setInfectedShowA(JLabel infectedShowA) {
        this.infectedShowA = infectedShowA;
    }

    public JLabel getFinalPoints() {
        return finalPoints;
    }

    public void setFinalPoints(JLabel finalPoints) {
        this.finalPoints = finalPoints;
    }

    public JLabel getFinalPointsA() {
        return finalPointsA;
    }

    public void setFinalPointsA(JLabel finalPointsA) {
        this.finalPointsA = finalPointsA;
    }

    public JLabel getFinalUpgrades() {
        return finalUpgrades;
    }

    public void setFinalUpgrades(JLabel finalUpgrades) {
        this.finalUpgrades = finalUpgrades;
    }

    public JLabel getFinalUpgradesA() {
        return finalUpgradesA;
    }

    public void setFinalUpgradesA(JLabel finalUpgradesA) {
        this.finalUpgradesA = finalUpgradesA;
    }

    public GameModel getGameModel() {
        return gameModel;
    }

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    public JPanel getLeftPanel() {
        return leftPanel;
    }

    public void setLeftPanel(JPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    public JPanel getRightPanel() {
        return rightPanel;
    }

    public void setRightPanel(JPanel rightPanel) {
        this.rightPanel = rightPanel;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public void setTopPanel(JPanel topPanel) {
        this.topPanel = topPanel;
    }

    public JLabel getPoints() {
        return points;
    }

    public void setPoints(JLabel points) {
        this.points = points;
    }

    public JLabel getPointsA() {
        return pointsA;
    }

    public void setPointsA(JLabel pointsA) {
        this.pointsA = pointsA;
    }

    public JLabel getCured() {
        return cured;
    }

    public void setCured(JLabel cured) {
        this.cured = cured;
    }

    public JLabel getCuredA() {
        return curedA;
    }

    public void setCuredA(JLabel curedA) {
        this.curedA = curedA;
    }

    public JButton getBuy() {
        return buy;
    }

    public void setBuy(JButton buy) {
        this.buy = buy;
    }

    public JLabel getShowCountry() {
        return showCountry;
    }

    public void setShowCountry(JLabel showCountry) {
        this.showCountry = showCountry;
    }

    public JButton getChoseCountry() {
        return choseCountry;
    }

    public void setChoseCountry(JButton choseCountry) {
        this.choseCountry = choseCountry;
    }

    public JLabel getQuestionIcon1() {
        return questionIcon1;
    }

    public void setQuestionIcon1(JLabel questionIcon1) {
        this.questionIcon1 = questionIcon1;
    }

    public JTextArea getShow() {
        return show;
    }

    public void setShow(JTextArea show) {
        this.show = show;
    }

    public JTextArea getGameInformations() {
        return gameInformations;
    }

    public void setGameInformations(JTextArea gameInformations) {
        this.gameInformations = gameInformations;
    }

    public JLabel getTime() {
        return time;
    }

    public void setTime(JLabel time) {
        this.time = time;
    }

    public JProgressBar getInfected() {
        return infected;
    }

    public void setInfected(JProgressBar infected) {
        this.infected = infected;
    }

    public JLabel getImgLabel() {
        return imgLabel;
    }

    public void setImgLabel(JLabel imgLabel) {
        this.imgLabel = imgLabel;
    }

    public JLabel getBrazil() {
        return brazil;
    }

    public void setBrazil(JLabel brazil) {
        this.brazil = brazil;
    }

    public JLabel getBolivia() {
        return bolivia;
    }

    public void setBolivia(JLabel bolivia) {
        this.bolivia = bolivia;
    }

    public JLabel getParaguay() {
        return paraguay;
    }

    public void setParaguay(JLabel paraguay) {
        this.paraguay = paraguay;
    }

    public JLabel getUruguay() {
        return uruguay;
    }

    public void setUruguay(JLabel uruguay) {
        this.uruguay = uruguay;
    }

    public JLabel getArgentina() {
        return argentina;
    }

    public void setArgentina(JLabel argentina) {
        this.argentina = argentina;
    }

    public JLabel getChile() {
        return chile;
    }

    public void setChile(JLabel chile) {
        this.chile = chile;
    }

    public JLabel getPeru() {
        return peru;
    }

    public void setPeru(JLabel peru) {
        this.peru = peru;
    }

    public JLabel getEcuador() {
        return ecuador;
    }

    public void setEcuador(JLabel ecuador) {
        this.ecuador = ecuador;
    }

    public JLabel getColombia() {
        return colombia;
    }

    public void setColombia(JLabel colombia) {
        this.colombia = colombia;
    }

    public JLabel getVenezuela() {
        return venezuela;
    }

    public void setVenezuela(JLabel venezuela) {
        this.venezuela = venezuela;
    }

    public JLabel getGuyana() {
        return guyana;
    }

    public void setGuyana(JLabel guyana) {
        this.guyana = guyana;
    }

    public JLabel getGuyanaFR() {
        return guyanaFR;
    }

    public void setGuyanaFR(JLabel guyanaFR) {
        this.guyanaFR = guyanaFR;
    }

    public JLabel getSuriname() {
        return suriname;
    }

    public void setSuriname(JLabel suriname) {
        this.suriname = suriname;
    }

    public JLabel getPicLabel() {
        return picLabel;
    }

    public void setPicLabel(JLabel picLabel) {
        this.picLabel = picLabel;
    }
}
