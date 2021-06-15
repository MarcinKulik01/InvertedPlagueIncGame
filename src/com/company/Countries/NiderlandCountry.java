package com.company.Countries;

import com.company.Countries.CountriesInterfaces.CargoPlane;
import com.company.Countries.CountriesInterfaces.OnFoot;

public class NiderlandCountry extends Country implements OnFoot, CargoPlane {

    public NiderlandCountry(String name, String capitol, int population) {
        super(name, capitol, population);
        super.setBonus(countBonus());
    }



    @Override
    public int howFastPeopleCanCrossBorder() {
        return 3;
    }

    @Override
    public int howManyPeoplePerDay() {
        return 2;
    }

    @Override
    public int boost() {
        return 8;
    }

    @Override
    public boolean isItOnFootBorder() {
        return true;
    }

    public int countBonus(){
        int bonusPom = howFastPeopleCanCrossBorder()+howManyPeoplePerDay()+boost();
        return bonusPom;
    }

    @Override
    public String toString() {
        return super.toString()+"\n jezyk niderlandzki\n " +
                "ryzyko zarazenia \n " + bonus +
                "%\n "+" Rozpowszechnianie \n cargo\n , pieszo\n ";
    }
}
