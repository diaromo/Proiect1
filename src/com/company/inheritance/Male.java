package com.company.inheritance;

public class Male extends Adopter {

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    private String shape = "Athletic";

    void hugPet() {
        System.out.println("Love you!");
    }

}