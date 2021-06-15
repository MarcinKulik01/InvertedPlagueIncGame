package com.company.MainGame;

import com.company.Countries.*;
import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.util.LinkedList;

public class GameModel {


    private String time;
    private int gameLv;
    private LinkedList<Country> countryLinkedList = new LinkedList<>();
    private int points = 10;
    private int bonusTreatment = 1;
    private long status;
    private long infected;
    private long allPeople;
    private int finalPoints=0;
    private int upgradePoints=0;

    private PortugueseCountry brazil;
    private EnglishCountry guyana;
    private FrenchCountry guyanaFR;
    private NiderlandCountry suriname;
    private SpanishCountry bolivia;
    private SpanishCountry paraguay;
    private SpanishCountry uruguay;
    private SpanishCountry argentina;
    private SpanishCountry chile;
    private SpanishCountry peru;
    private SpanishCountry ecuador;
    private SpanishCountry colombia;
    private SpanishCountry venezuela;

    public GameModel(int gameLv) {
        this.gameLv = gameLv;


        brazil = new PortugueseCountry("Brazylia", "Brasil", 21100000);
        guyana = new EnglishCountry("Gujana","Georgetown", 77000);
        guyanaFR = new FrenchCountry("GujanaFR","Kajenna",23222);
        suriname = new NiderlandCountry("Surinam","Paramaribo",58136);
        bolivia = new SpanishCountry("Boliwia","Sucre",1172200);
        paraguay = new SpanishCountry("Paragwaj","Asunción",694373);
        uruguay = new SpanishCountry("Urugwaj","Montevideo",336014 );
        argentina = new SpanishCountry("Argentyna","Buenos Aires",4388674);
        chile = new SpanishCountry("Chile","Santiago",1754700 );
        peru = new SpanishCountry("Peru","Lima",3303616);
        ecuador = new SpanishCountry("Ekwador","Quito",1662485);
        colombia = new SpanishCountry("Kolumbia","Bogotá",5037242);
        venezuela = new SpanishCountry("Wenezuela","Caracas", 2888711);

        countryLinkedList.add(brazil);
        countryLinkedList.add(guyana);
        countryLinkedList.add(guyanaFR);
        countryLinkedList.add(suriname);
        countryLinkedList.add(paraguay);
        countryLinkedList.add(uruguay);
        countryLinkedList.add(argentina);
        countryLinkedList.add(bolivia);
        countryLinkedList.add(peru);
        countryLinkedList.add(ecuador);
        countryLinkedList.add(chile);
        countryLinkedList.add(colombia);
        countryLinkedList.add(venezuela);

        for(Country country: countryLinkedList){
            allPeople+=country.getPopulation();
        }

    }

    public int getFinalPoints() {
        return finalPoints;
    }

    public void setFinalPoints(int finalPoints) {
        this.finalPoints = finalPoints;
    }

    public int getUpgradePoints() {
        return upgradePoints;
    }

    public void setUpgradePoints(int upgradePoints) {
        this.upgradePoints = upgradePoints;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getGameLv() {
        return gameLv;
    }

    public void setGameLv(int gameLv) {
        this.gameLv = gameLv;
    }

    public LinkedList<Country> getCountryLinkedList() {
        return countryLinkedList;
    }

    public void setCountryLinkedList(LinkedList<Country> countryLinkedList) {
        this.countryLinkedList = countryLinkedList;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getBonusTreatment() {
        return bonusTreatment;
    }

    public void setBonusTreatment(int bonusTreatment) {
        this.bonusTreatment = bonusTreatment;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public long getInfected() {
        return infected;
    }

    public void setInfected(long infected) {
        this.infected = infected;
    }

    public long getAllPeople() {
        return allPeople;
    }

    public void setAllPeople(long allPeople) {
        this.allPeople = allPeople;
    }

    public PortugueseCountry getBrazil() {
        return brazil;
    }

    public void setBrazil(PortugueseCountry brazil) {
        this.brazil = brazil;
    }

    public EnglishCountry getGuyana() {
        return guyana;
    }

    public void setGuyana(EnglishCountry guyana) {
        this.guyana = guyana;
    }

    public FrenchCountry getGuyanaFR() {
        return guyanaFR;
    }

    public void setGuyanaFR(FrenchCountry guyanaFR) {
        this.guyanaFR = guyanaFR;
    }

    public NiderlandCountry getSuriname() {
        return suriname;
    }

    public void setSuriname(NiderlandCountry suriname) {
        this.suriname = suriname;
    }

    public SpanishCountry getBolivia() {
        return bolivia;
    }

    public void setBolivia(SpanishCountry bolivia) {
        this.bolivia = bolivia;
    }

    public SpanishCountry getParaguay() {
        return paraguay;
    }

    public void setParaguay(SpanishCountry paraguay) {
        this.paraguay = paraguay;
    }

    public SpanishCountry getUruguay() {
        return uruguay;
    }

    public void setUruguay(SpanishCountry uruguay) {
        this.uruguay = uruguay;
    }

    public SpanishCountry getArgentina() {
        return argentina;
    }

    public void setArgentina(SpanishCountry argentina) {
        this.argentina = argentina;
    }

    public SpanishCountry getChile() {
        return chile;
    }

    public void setChile(SpanishCountry chile) {
        this.chile = chile;
    }

    public SpanishCountry getPeru() {
        return peru;
    }

    public void setPeru(SpanishCountry peru) {
        this.peru = peru;
    }

    public SpanishCountry getEcuador() {
        return ecuador;
    }

    public void setEcuador(SpanishCountry ecuador) {
        this.ecuador = ecuador;
    }

    public SpanishCountry getColombia() {
        return colombia;
    }

    public void setColombia(SpanishCountry colombia) {
        this.colombia = colombia;
    }

    public SpanishCountry getVenezuela() {
        return venezuela;
    }

    public void setVenezuela(SpanishCountry venezuela) {
        this.venezuela = venezuela;
    }
}
