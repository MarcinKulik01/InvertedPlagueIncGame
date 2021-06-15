package com.company.Countries;

public abstract class Country {

    private static int counter = 0;
    public int bonus;
    private int id;
    private String name;
    private String capital;
    private int population;
    private int hospitals;
    private int infected;
    private int maxToclose;


    public Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        maxToclose= population/100*40;
        id = counter++;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int getBonus) {
        this.bonus = getBonus;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Country.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getHospitals() {
        return hospitals;
    }

    public void setHospitals(int hospitals) {
        this.hospitals = hospitals;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    @Override
    public String toString() {
        return " Nazwa kraju: \n   " + name  +
                "\n stolica:  \n    " + capital  +
                "\n ludnosc:  \n     " + population +
                "\n ilosc hospitalizowanych: \n    " + hospitals +
                "\n ilosc zarazonych: \n     " + infected;
    }
}
