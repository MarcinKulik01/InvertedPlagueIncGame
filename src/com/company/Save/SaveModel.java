package com.company.Save;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SaveModel {


    private int points;
    private String time;
    private Date date = new Date();
    private String out = new SimpleDateFormat("yyyy-MM-dd").format(date);;
    private String rodzaj;
    private String poziom;

    public SaveModel(String rodzaj,String poziom,int points, String time, Date date) {
        this.points = points;
        this.time = time;
        this.date = date;
        this.rodzaj = rodzaj;
        this.poziom = poziom;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public int getPoints() {
        return points;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getPoziom() {
        return poziom;
    }

    public void setPoziom(String poziom) {
        this.poziom = poziom;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
