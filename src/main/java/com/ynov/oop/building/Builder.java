package com.ynov.oop.building;

import com.ynov.oop.globalParameter.HaveGlobalParameter;
import com.ynov.oop.resource.Cost;
import com.ynov.oop.resource.ResourceStockpile;

public class Builder {
    /*
    1. vérifier qu'il y a moins de Plant dans le constructionCost que dans le warehouse
    2. vérifier qu'il y a moins de Steel dans le constructionCost que dans le warehouse
    3. vérifier qu'il y a moins de Credit dans le constructionCost que dans le warehouse
    4. si toutes les conditions sont bonnes renvoyer true sinon renvoyer false
    */
    public boolean canBuild(ResourceStockpile resourceStockpile, Cost constructionCost){
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
    1. vérifier si on peut la construire
    2. si construction possible utiliser le coût
    3. créer la City
    4. activer l'effect de la City
    5. renvoyer la City
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

    public Forest createForest(ResourceStockpile resourceStockpile, HaveGlobalParameter haveGlobalParameter){
        if(this.canBuild(resourceStockpile, Forest.constructionCost)) {
            this.useConstructionCost(resourceStockpile, Forest.constructionCost);
            Forest newForest = new Forest();
            newForest.effect(haveGlobalParameter);
            return newForest;
        }
        return null;
    }

    public Greenhouse createGreenhouse(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, Greenhouse.constructionCost)) {
            this.useConstructionCost(resourceStockpile, Greenhouse.constructionCost);
            Greenhouse newGreenhouse = new Greenhouse();
            newGreenhouse.effect(resourceStockpile);
            return newGreenhouse;
        }
        return null;
    }

    public Mine createMine(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, Mine.constructionCost)) {
            this.useConstructionCost(resourceStockpile, Mine.constructionCost);
            Mine newMine = new Mine();
            newMine.effect(resourceStockpile);
            return newMine;
        }
        return null;
    }

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
