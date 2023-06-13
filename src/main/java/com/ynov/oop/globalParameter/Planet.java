package com.ynov.oop.globalParameter;

import com.ynov.oop.CheckVictoryConditions;

public class Planet implements CheckVictoryConditions, HaveGlobalParameter {
    private Oxygen oxygen;
    private Temperature temperature;

    @Override
    public boolean isWin() {
        return oxygen.isWin() && temperature.isWin();
    }

    @Override
    public Oxygen getOxygen() {
        return this.oxygen;
    }

    @Override
    public Temperature getTemperature() {
        return this.temperature;
    }

    public Planet(Oxygen oxygen, Temperature temperature) {
        this.oxygen = oxygen;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s",this.oxygen,this.temperature);
    }
}
