package com.company.encapsulation;

public class Animal {

    private String type;
    private String animalName;
    private double ageYears;
    private int healthLevel;
    private int hungerLevel;
    private int happinessLevel;
    private String favoriteFood;
    private String favoriteActivity;
    private Boolean chip = true;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(double ageYears) {
        this.ageYears = ageYears;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public Boolean getChip() {
        return chip;
    }

    public void setChip(Boolean chip) {
        this.chip = chip;
    }



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
