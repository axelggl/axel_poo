package com.ynov.oop.building;

import java.util.Scanner;
public class Building {

    private String name;

    protected Building(String newName){
        this.name = newName;
    }

    public static void buildingNameInput(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the building name ?");
        String buildingName = myObj.nextLine();
        System.out.println("This building is named " + buildingName);
    }

    public String getName(){
        return this.name;
    }

}
