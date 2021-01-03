package com.company.inheritance;

public class Dog extends Animal{

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed = "Pug";
    void playWithStick() {System.out.println("Catch stick");}
}
