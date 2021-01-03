package com.company.inheritance;

public class Cat extends Animal{

    public boolean isPottyTrained() {
        return pottyTrained;
    }

    public void setPottyTrained(boolean pottyTrained) {
        this.pottyTrained = pottyTrained;
    }

    private boolean pottyTrained;
    void purr(int noiseVolume){
        System.out.println("Purrrpurrr at volume " + noiseVolume + " Decibels");
    }
}
