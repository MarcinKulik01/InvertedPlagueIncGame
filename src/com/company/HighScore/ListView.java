package com.company.HighScore;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ListView extends JFrame {

    public ListView() throws IOException {
        generateFrame();
    }

    public void generateFrame() throws IOException {


        File plik = new File("src/com/company/IMG/HighScoreInf.txt");
        plik.createNewFile();

        FileReader fileReader1 = new FileReader(plik);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

        int j=1;
        while (bufferedReader1.readLine()!= null) {
            j+=1;
        }

        String[][] elementy = new String[j][9];

        bufferedReader1.close();

                try {

                    FileReader fileReader = new FileReader(plik);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String str;

                    int i = 0;
                    while ((str = bufferedReader.readLine()) != null) {
                        str = (i+1)+","+str;
                        elementy[i] = str.split(",");
                        i++;
                    }
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }



        String[] kolumny = {"Nr","Imię", "Nazwisko", "Wiek","Punkty","Czas","Data","poziom","rodzaj"};


        boolean sorted = false; //https://stackabuse.com/sorting-algorithms-in-java/ tak pol na pol
        String temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < elementy.length - 2; i++) {
                if (Integer.parseInt(elementy[i][4]) < Integer.parseInt(elementy[i+1][4])) {
                    temp = elementy[i][4];
                    elementy[i][4] = elementy[i+1][4];
                    elementy[i+1][4] = temp;
                    sorted = false;
                }
            }
        }

        JTable jTable = new JTable();

        jTable.setModel(new ListModel(elementy, kolumny));

        JScrollPane jScrollPane = new JScrollPane(jTable);

        add(jScrollPane);
        JButton jButton = new JButton("Sortowanie");
        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
