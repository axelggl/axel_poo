package com.ynov.oop.building;

import com.ynov.oop.resource.Cost;
import com.ynov.oop.resource.ResourceStockpile;

public class City extends Building {

    public City(){
        super("trinityCity");
    }
    public static Cost constructionCost = new Cost(1,0,0); // static means

    public void effect(ResourceStockpile resourceStockpile) {
        resourceStockpile.getCredits().increaseProduction(1);
    }

}
