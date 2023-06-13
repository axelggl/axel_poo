package com.ynov.oop.globalParameter;

import com.ynov.oop.CheckVictoryConditions;

public class Oxygen implements CheckVictoryConditions {
    private int oxygenRate;

    @Override
    public boolean isWin() {
        return this.oxygenRate >= 8;
    }

    // Constructor for Oxygen
    public Oxygen(){
        this.oxygenRate = 0;
    }

    // This method will be used to sum the percentage of oxygen present on our planet, due to Forest implantation.
    public void oxygenProduced(int producedOxygen){
        this.oxygenRate += producedOxygen;
    }
    @Override
    public String toString() {
        return String.format("You currently have %d%% of Oxygen in atmosphere.",this.oxygenRate);
    }
}
