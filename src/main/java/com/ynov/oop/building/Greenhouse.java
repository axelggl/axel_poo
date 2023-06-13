package com.ynov.oop.building;

import com.ynov.oop.resource.Cost;
import com.ynov.oop.resource.ResourceStockpile;

public class Greenhouse extends Building {

    public Greenhouse(){
        super("trinityGreenhouse");
    }
    public static Cost constructionCost = new Cost(0,2,0);

    public void effect(ResourceStockpile resourceStockpile){
        resourceStockpile.getPlants().increaseProduction(1);
    }

}
