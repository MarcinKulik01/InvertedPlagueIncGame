package com.company.Save;

import javax.swing.*;
import java.awt.*;

public class SaveView extends JFrame {

    private JFrame jFrame;
    private JButton easy;
    private JTextArea name1;
    private JTextArea surname;
    private JTextArea age;

    public SaveView(){
        createView();
    }

    public void createView(){

        jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("Zapisz gre");

        easy = new JButton("...Save...");
        easy.setBounds(300,100,140,50);
        easy.setOpaque(false);
        easy.setVisible(true);

        createInput();

        jFrame.add(easy);

        jFrame.getContentPane().setBackground(Color.orange);
        jFrame.setSize(500,200);
        jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
    }

    private void createInput() {
        name1 = new JTextArea("Podaj imie");
        name1.setBounds(40,30,120,40);
        name1.setOpaque(false);
        name1.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        name1.setWrapStyleWord(true);
        name1.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        name1.setVisible(true);

        surname = new JTextArea("Podaj nazwisko");
        surname.setBounds(180,30,120,40);
        surname.setOpaque(false);
        surname.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        surname.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        surname.setVisible(true);

        age = new JTextArea("Podaj wiek");
        age.setBounds(320,30,120,40);
        age.setOpaque(false);
        age.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        age.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        age.setVisible(true);

        jFrame.add(name1);
        jFrame.add(surname);
        jFrame.add(age);
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public JButton getEasy() {
        return easy;
    }

    public void setEasy(JButton easy) {
        this.easy = easy;
    }


    public JTextArea getName1() {
        return name1;
    }

    public void setName1(JTextArea name1) {
        this.name1 = name1;
    }

    public JTextArea getSurname() {
        return surname;
    }

    public void setSurname(JTextArea surname) {
        this.surname = surname;
    }

    public JTextArea getAge() {
        return age;
    }

    public void setAge(JTextArea age) {
        this.age = age;
    }
}
