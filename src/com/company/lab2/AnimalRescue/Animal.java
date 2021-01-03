package com.company.lab2.AnimalRescue;

public class Animal {

    String type = "dog";    //cat, dog, fish
    String name = "Yoda";
    double ageYears = 7.5;
    int healthLevel = 10; //1 to 10
    int hungerLevel = 6; //1 to 10
    int happinessLevel = 8; //1 to 10
    String favoriteFood = "RoyalCanin";
    String favoriteActivity = "Running";
    Boolean chip = true;

    void play() {
        System.out.println("Catch stick");
    }

    void eat(){
        System.out.println("Nonnomnom");
    }

    void sleep(){
        System.out.println("ZZZzzzzzzz");
    }

    void bark(){
        System.out.println("Ham");
    }
}

