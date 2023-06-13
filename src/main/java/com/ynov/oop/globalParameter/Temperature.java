package com.ynov.oop.globalParameter;

import com.ynov.oop.CheckVictoryConditions;

public class Temperature implements CheckVictoryConditions {
    private int currentTemperature;

    @Override
    public boolean isWin() {
        return this.currentTemperature >= 8;
    }

    // Constructor for Oxygen
    public Temperature(){
        this.currentTemperature = -30;
    }

    // This method will be used to increase the temperature of our planet, regarding the number of Nuclear Plants the player built.
    public void increaseTemperature(int addTemperature){
        this.currentTemperature += addTemperature;
    }
    @Override
    public String toString() {
        return String.format("The current temperature is %d°C",this.currentTemperature);
    }
}
