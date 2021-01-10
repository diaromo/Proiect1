package com.company.inheritance;

public class Female extends Adopter{

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    private String hairColor = "Brunete";

    void kissPet() {
        System.out.println("Love you more!");
    }
}
