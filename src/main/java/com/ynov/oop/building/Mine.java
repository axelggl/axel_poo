package com.ynov.oop.building;

import com.ynov.oop.resource.Cost;
import com.ynov.oop.resource.ResourceStockpile;

public class Mine extends Building {

    public Mine() {
        super("trinityMine");
    }
    public static Cost constructionCost = new Cost(0,1,0);

    public void effect(ResourceStockpile resourceStockpile){
        resourceStockpile.getSteel().increaseProduction(1);
    }

}
