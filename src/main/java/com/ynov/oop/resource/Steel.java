package com.ynov.oop.resource;

import com.ynov.oop.CheckVictoryConditions;
import com.ynov.oop.EndTurnAction;

public class Steel extends Resource {

    public Steel(){
        super(1,0);
    }

    @Override
    public String toString() {
        return String.format("You have %d steel and you produce %d steel per turn.",this.getValue(),this.getProduction());
    }
}
