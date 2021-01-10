package com.company.inheritance;

public class Homemade extends Food{

        public String getFoodType() {
            return foodType;
        }

        public void setFoodType(String foodType) {
            this.foodType = foodType;
        }

        private String foodType = "Vegetarian";
        void petReaction() {System.out.println("I like veggies!");}
}
