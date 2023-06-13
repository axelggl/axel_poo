package com.ynov.oop;

import com.ynov.oop.building.Builder;
import com.ynov.oop.globalParameter.Oxygen;
import com.ynov.oop.globalParameter.Planet;
import com.ynov.oop.globalParameter.Temperature;
import com.ynov.oop.resource.Credits;
import com.ynov.oop.resource.Plants;
import com.ynov.oop.resource.Steel;
import com.ynov.oop.resource.Warehouse;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Credits credits = new Credits();
        Plants plants = new Plants();
        Steel steel = new Steel();
        Warehouse warehouse = new Warehouse(credits,plants,steel);

        Oxygen oxygen = new Oxygen();
        Temperature temperature = new Temperature();
        Planet planet = new Planet(oxygen,temperature);

        Builder builder = new Builder();

        GameLoop gameLoop = new GameLoop(warehouse, planet, builder);

        Scanner scanner = new Scanner(System.in);

        Terminal terminal = new Terminal(gameLoop, scanner);

        terminal.execute();
    }
}
