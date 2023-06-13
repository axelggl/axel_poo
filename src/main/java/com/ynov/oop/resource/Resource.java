package com.ynov.oop.resource;

import com.ynov.oop.EndTurnAction;

public class Resource implements EndTurnAction {

    @Override
    public void endTurnAction() {
        this.value += this.production;
    }

    private int value;
    private int production;

    protected Resource(int value, int production){
        this.value = value;
        this.production = production;
    }

    public void use(int resourceUsed){
        this.value -= resourceUsed;
        // this.creditsValue = this.creditsValue - resourceUsed;
    }

    public void increaseProduction(int productionIncrease){
        this.production += productionIncrease;
        // this.production = this.production + productionIncrease;
    }

    public int getValue() {
        return this.value;
    }

    public int getProduction() {
        return this.production;
    }

}
