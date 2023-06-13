package com.ynov.oop.building;

import com.ynov.oop.globalParameter.HaveGlobalParameter;
import com.ynov.oop.resource.Cost;

public class NuclearPlant extends Building {

    public NuclearPlant() {
        super("trinityNuclearPlant");
    }
    public static Cost constructionCost = new Cost(4,2,0);

    public void effect(HaveGlobalParameter haveGlobalParameter){
        haveGlobalParameter.getTemperature().increaseTemperature(2);
    }

}
