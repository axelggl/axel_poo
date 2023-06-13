package com.ynov.oop;

import java.util.Scanner;

public class Terminal {

    // execute est la boucle du jeu principal
    // à chaque tour de boucle on regarde les interactions joueur
    // et on exécute les actions de fin de tour
    // on continue la boucle si le joueur n'a pas gagné la partie
    // si le joueur a gagné la partie on affiche un message de fin de partie

    private GameLoop gameLoop;
    private Scanner scanner;
    private void playerInteraction() {
        int actionPlayer = -1;
        do {
            System.out.println(this.gameLoop); //System.out.println(this.game.toString());
            System.out.println("Possible actions :");
            System.out.println("1. Build a City [1 steel].");
            System.out.println("2. Plant a Forest [3 plants].");
            System.out.println("3. Create a Mine [1 credit].");
            System.out.println("4. Construct a Nuclear Plant [4 steel] [2 credits].");
            System.out.println("5. Prepare a Greenhouse [2 credits].");
            System.out.println("6. Start the next loop.");
            actionPlayer = this.scanner.nextInt();
            switch (actionPlayer) {
                case 1:

                    this.gameLoop.createBuilding("city");
                    break;
                case 2:
                    this.gameLoop.createBuilding("forest");
                    break;
                case 3:
                    this.gameLoop.createBuilding("mine");
                    break;
                case 4:
                    this.gameLoop.createBuilding("nuclearplant");
                    break;
                case 5:
                    this.gameLoop.createBuilding("greenhouse");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("This aint an action fool.");
            }
        } while(actionPlayer != 6);
    }

    public Terminal(GameLoop gameLoop, Scanner scanner) {
        this.gameLoop = gameLoop;
        this.scanner = scanner;
    }

    public void execute() {
        while(!gameLoop.isWin()) {
            playerInteraction();
            gameLoop.endTurnAction();
        }
        System.out.println("You finished the game, congratulations !");
    }
}
