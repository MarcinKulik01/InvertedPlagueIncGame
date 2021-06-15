package com.company.Countries;

import com.company.Countries.CountriesInterfaces.Car;
import com.company.Countries.CountriesInterfaces.CargoPlane;
import com.company.Countries.CountriesInterfaces.OnFoot;
import com.company.Countries.CountriesInterfaces.Plane;

public class SpanishCountry extends Country implements Car, CargoPlane, Plane, OnFoot {

    public SpanishCountry(String name, String capitol, int population) {
        super(name, capitol, population);
        super.setBonus(countBonus());
    }

    @Override
    public int howFastCarCanCrossBorder() {
        return 3;
    }

    @Override
    public int howManyCatsCrossBorder() {
        return 2;
    }

    @Override
    public int howFastPeopleCanCrossBorder() {
        return 4;
    }

    @Override
    public int howManyPeoplePerDay() {
        return 3;
    }

    @Override
    public int howManyPlanePerDay() {
        return 2;
    }

    @Override
    public int boost() {
        return 3;
    }

    @Override
    public boolean isItPlaneBorder() {
        return true;
    }

    @Override
    public boolean isItOnFootBorder() {
        return true;
    }

    @Override
    public boolean isItCarBorder() { return true; }

    public int countBonus(){
        int bonusPom = howFastCarCanCrossBorder()+howManyCatsCrossBorder()+howManyPlanePerDay()+boost();
        return bonusPom;
    }

    @Override
    public String toString() {
        return super.toString()+"\n jezyk hiszpanski\n " +
                "ryzyko zarazenia " + bonus +
                "%\n  "+"Rozpowszechnianie \n   cargo,\n  pieszo,\n  samolot,\n  samochod";
    }
}
