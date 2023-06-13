package com.ynov.oop.building;

import com.ynov.oop.globalParameter.HaveGlobalParameter;
import com.ynov.oop.resource.Cost;
import com.ynov.oop.resource.ResourceStockpile;

// This class ables to create buildings.

public class Builder {
    /*
    1. Verifies if we have enough Plants in our warehouse.
    2. Verifies if we have enough Steel in our warehouse.
    3. Verifies if we have enough Credit in our warehouse.
    4. If all conditions are verified, returns true else returns false.
    */
    private boolean canBuild(ResourceStockpile resourceStockpile, Cost constructionCost){
        return resourceStockpile.getCredits().getValue() >= constructionCost.credit
                && resourceStockpile.getPlants().getValue() >= constructionCost.plant
                && resourceStockpile.getSteel().getValue() >= constructionCost.steel
        ;
    }

    private void useConstructionCost(ResourceStockpile resourceStockpile, Cost constructionCost) {
        resourceStockpile.getSteel().use(constructionCost.steel);
        resourceStockpile.getPlants().use(constructionCost.plant);
        resourceStockpile.getCredits().use(constructionCost.credit);
    }

    /*
    1. Verifies if we can build.
    2. If we can construct then we use cost.
    3. Create City.
    4. Activate City's effect.
    5. Returns City.
    */

    public City createCity(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, City.constructionCost)) {
            this.useConstructionCost(resourceStockpile, City.constructionCost);
            City newCity = new City();
            newCity.effect(resourceStockpile);
            return newCity;
        }
        return null;
    }

    /*
    1. Verifies if we can build.
    2. If we can construct then we use cost.
    3. Create Forest.
    4. Activate Forest's effect.
    5. Returns Forest.
    */

    public Forest createForest(ResourceStockpile resourceStockpile, HaveGlobalParameter haveGlobalParameter){
        if(this.canBuild(resourceStockpile, Forest.constructionCost)) {
            this.useConstructionCost(resourceStockpile, Forest.constructionCost);
            Forest newForest = new Forest();
            newForest.effect(haveGlobalParameter);
            return newForest;
        }
        return null;
    }

    /*
    1. Verifies if we can build.
    2. If we can construct then we use cost.
    3. Create Greenhouse.
    4. Activate Greenhouse's effect.
    5. Returns Greenhouse.
    */

    public Greenhouse createGreenhouse(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, Greenhouse.constructionCost)) {
            this.useConstructionCost(resourceStockpile, Greenhouse.constructionCost);
            Greenhouse newGreenhouse = new Greenhouse();
            newGreenhouse.effect(resourceStockpile);
            return newGreenhouse;
        }
        return null;
    }

    /*
    1. Verifies if we can build.
    2. If we can construct then we use cost.
    3. Create Mine.
    4. Activate Mine's effect.
    5. Returns Mine.
    */

    public Mine createMine(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, Mine.constructionCost)) {
            this.useConstructionCost(resourceStockpile, Mine.constructionCost);
            Mine newMine = new Mine();
            newMine.effect(resourceStockpile);
            return newMine;
        }
        return null;
    }

    /*
    1. Verifies if we can build.
    2. If we can construct then we use cost.
    3. Create Nuclear Plant.
    4. Activate Nuclear Plant's effect.
    5. Returns Nuclear Plant.
    */

    public NuclearPlant createNuclearPlant(ResourceStockpile resourceStockpile, HaveGlobalParameter haveGlobalParameter){
        if(this.canBuild(resourceStockpile, NuclearPlant.constructionCost)) {
            this.useConstructionCost(resourceStockpile, NuclearPlant.constructionCost);
            NuclearPlant newNuclearPlant = new NuclearPlant();
            newNuclearPlant.effect(haveGlobalParameter);
            return newNuclearPlant;
        }
        return null;
    }

}
