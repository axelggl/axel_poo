package com.ynov.oop;

import com.ynov.oop.building.Builder;
import com.ynov.oop.globalParameter.Planet;
import com.ynov.oop.resource.Warehouse;

public class GameLoop implements EndTurnAction, CheckVictoryConditions {

    private int currentGeneration = 0;
    private Warehouse warehouse;
    private Planet planet;
    private Builder builder;

    @Override
    public void endTurnAction() {
        this.warehouse.endTurnAction();
        this.currentGeneration += 1;
    }

    @Override
    public boolean isWin() {
        return this.warehouse.isWin() && this.planet.isWin();
    }

    public GameLoop(Warehouse warehouse, Planet planet, Builder builder) {
        this.warehouse = warehouse;
        this.planet = planet;
        this.builder = builder;
    }

    @Override
    public String toString() {
        return String.format("Generation number : %d.\n%s\n%s",this.currentGeneration, this.warehouse, this.planet);
    }

    public void createBuilding(String buildingToBuild) {
        switch (buildingToBuild.toLowerCase()) {
            case "city":
                this.builder.createCity(warehouse);
                break;
            case "forest":
                this.builder.createForest(warehouse, planet);
                break;
            case "mine":
                this.builder.createMine(warehouse);
                break;
            case "nuclearplant":
                this.builder.createNuclearPlant(warehouse, planet);
                break;
            case "greenhouse":
                this.builder.createGreenhouse(warehouse);
                break;
            default:
                System.out.println("Cannot create this building.");
                break;
        }
    }

}
