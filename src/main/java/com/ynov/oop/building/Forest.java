package com.ynov.oop.building;

import com.ynov.oop.globalParameter.HaveGlobalParameter;
import com.ynov.oop.resource.Cost;

public class Forest extends Building {

    public Forest(){
        super("trinityForest");
    }
    public static Cost constructionCost = new Cost(0,0,3);

    public void effect(HaveGlobalParameter haveGlobalParameter){
        haveGlobalParameter.getOxygen().oxygenProduced(1);
    }

}
