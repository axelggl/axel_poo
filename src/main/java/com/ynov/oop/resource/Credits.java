package com.ynov.oop.resource;

import com.ynov.oop.CheckVictoryConditions;
import com.ynov.oop.EndTurnAction;

public class Credits extends Resource implements CheckVictoryConditions {

    @Override
    public boolean isWin() {
        return this.getValue() >= 10;
    }

    public Credits(){
        super(2,1);
    }

    @Override
    public String toString() {
        return String.format("You have %d credits and you produce %d credits per turn.",this.getValue(),this.getProduction());
    }
}
