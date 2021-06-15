package com.company.Countries;

import com.company.Countries.CountriesInterfaces.Car;
import com.company.Countries.CountriesInterfaces.Plane;

public class EnglishCountry extends Country implements Plane, Car{

    public EnglishCountry(String name, String capitol, int population) {
        super(name, capitol, population);
        super.setBonus(countBonus());
    }

    @Override
    public int howFastCarCanCrossBorder() {
        return 1;
    }

    @Override
    public int howManyCatsCrossBorder() {
        return 2;
    }

    @Override
    public boolean isItCarBorder() {
        return false;
    }

    @Override
    public int howManyPlanePerDay() {
        return 3;
    }

    @Override
    public int boost() {
        return 2;
    }

    @Override
    public boolean isItPlaneBorder() {
        return false;
    }

    public int countBonus(){
        int bonusPom = howFastCarCanCrossBorder()+howManyCatsCrossBorder()+howManyPlanePerDay()+boost();
        return bonusPom;
    }

    @Override
    public String toString() {
        return super.toString()+"\n jezyk angielski\n " +
                "ryzyko zarazenia " + bonus +
                "%\n "+" Rozpowszechnianie \n samoloty,\n  samochody";
    }
}
