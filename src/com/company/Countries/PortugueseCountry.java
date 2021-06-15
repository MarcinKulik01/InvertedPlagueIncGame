package com.company.Countries;

import com.company.Countries.CountriesInterfaces.Car;
import com.company.Countries.CountriesInterfaces.CargoPlane;
import com.company.Countries.CountriesInterfaces.Plane;
import com.company.Countries.CountriesInterfaces.Train;

public class PortugueseCountry extends Country implements Train, Car, CargoPlane, Plane {

    public PortugueseCountry(String name, String capitol, int population) {
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
        return 4;
    }

    @Override
    public int boost() {
        return 1;
    }

    @Override
    public boolean isItPlaneBorder() {
        return false;
    }

    @Override
    public boolean isItCarBorder() {
        return false;
    }

    public int countBonus(){
        int bonusPom = howFastCarCanCrossBorder()+howManyCatsCrossBorder()+howManyPlanePerDay()+boost();
        return bonusPom;
    }

    @Override
    public String toString() {
        return super.toString()+"\n jezyk portugalski\n " +
                "ryzyko zarazenia " + bonus +
                "%\n "+" Rozpowszechnianie \n  pociag,\n  samochod,\n  cargo, samolot";
    }
}
