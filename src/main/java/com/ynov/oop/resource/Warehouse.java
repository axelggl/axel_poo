package com.ynov.oop.resource;

import com.ynov.oop.CheckVictoryConditions;
import com.ynov.oop.EndTurnAction;

public class Warehouse implements EndTurnAction, CheckVictoryConditions, ResourceStockpile {
    private Credits credits;
    private Plants plants;
    private Steel steel;

    @Override
    public void endTurnAction() {
        this.credits.endTurnAction();
        this.plants.endTurnAction();
        this.steel.endTurnAction();
    }

    @Override
    public boolean isWin() {
        return credits.isWin() && plants.isWin();
    }

    @Override
    public Credits getCredits() {
        return this.credits;
    }

    @Override
    public Plants getPlants() {
        return this.plants;
    }

    @Override
    public Steel getSteel() {
        return this.steel;
    }

    // The Constructor allow another to instantiate this class with specific attributes
    public Warehouse(Credits credits, Plants plants, Steel steel){
        this.credits = credits;
        this.plants = plants;
        this.steel = steel;
    }
    @Override
    public String toString() {
        return String.format("%s\n%s\n%s",this.credits,this.plants,this.steel);
    }
}
