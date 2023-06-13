package com.ynov.oop.resource;

import com.ynov.oop.CheckVictoryConditions;
import com.ynov.oop.EndTurnAction;

public class Plants extends Resource implements CheckVictoryConditions {

    @Override
    public boolean isWin() {
        return this.getValue() >= 4;
    }

    public Plants(){
     super(0,0);
    }

    @Override
    public String toString() {
        return String.format("You have %d plants and you produce %d plants per turn.",this.getValue(),this.getProduction());
    }
}
