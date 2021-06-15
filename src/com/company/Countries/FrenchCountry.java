package com.company.Countries;

import com.company.Countries.CountriesInterfaces.Car;
import com.company.Countries.CountriesInterfaces.CargoPlane;
import com.company.Countries.CountriesInterfaces.Plane;

public class FrenchCountry extends Country implements Car, CargoPlane, Plane {

    public FrenchCountry(String name, String capitol, int population) {
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
    public int howManyPlanePerDay() {
        return 5;
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
    public boolean isItCarBorder() {
        return true;
    }

    public int countBonus(){
        int bonusPom = howFastCarCanCrossBorder()+howManyCatsCrossBorder()+howManyPlanePerDay()+boost();
        return bonusPom;
    }

    @Override
    public String toString() {
        return super.toString()+"\n jezyk francuzki\n " +
                "ryzyko zarazenia " + bonus +
                "%\n "+" Rozpowszechnianie \n samoloty,\n  samochody,\n  pieszo";
    }
}
