package com.company.inheritance;

public class Adopter {

    private String name;
    private double budget;
    private String adress;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    void dressesTheAnimal() {System.out.println("What a nice coat");}

    void petsTheAnimal() {System.out.println("There, there");}
}
