package com.company.inheritance;

public class Store extends Food{

    public String getFoodTypeStore() {
        return foodTypeStore;
    }

    public void setFoodTypeStore(String foodTypeStore) {
        this.foodTypeStore = foodTypeStore;
    }

    private String foodTypeStore = "Urinary";
    void petTreatmentUrinary() {System.out.println("Prevents infection");}
}
