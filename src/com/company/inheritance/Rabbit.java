package com.company.inheritance;

public class Rabbit extends Animal{
    public String getEarType() {
        return earType;
    }

    public void setEarType(String earType) {
        this.earType = earType;
    }

    private String earType = "Long";
    void pinchPartner() {System.out.println("Give me attention");}
}
