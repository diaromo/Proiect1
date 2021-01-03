package com.company.lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Animal myAnimal1 = new Animal();

        System.out.println(myAnimal1.type);
        myAnimal1.type = "Cat";
        System.out.println(myAnimal1.type);
        System.out.println(myAnimal1.name);
        System.out.println(myAnimal1.ageYears);
        System.out.println(myAnimal1.favoriteActivity);
        System.out.println(myAnimal1.favoriteFood);
        System.out.println(myAnimal1.happinessLevel);
        System.out.println(myAnimal1.hungerLevel);
        System.out.println(myAnimal1.chip);
        myAnimal1.eat();

        Food myFood1 = new Food();
        System.out.println(myFood1.name);
        System.out.println(myFood1.price);
        System.out.println(myFood1.priceRon);
        System.out.println(myFood1.type);
        System.out.println(myFood1.quantity);
        System.out.println(myFood1.quantityKG);
        System.out.println(myFood1.stock);

        Activity myActivity1 = new Activity();
        System.out.println(myActivity1.duration);
        System.out.println(myActivity1.durationMinutes);
        System.out.println(myActivity1.location);

        Vet myVet1 = new Vet();
        System.out.println(myVet1.name);
        System.out.println(myVet1.experience);
        System.out.println(myVet1.location);
        System.out.println(myVet1.prizes);
        System.out.println(myVet1.schedule);
        System.out.println(myVet1.specialisation);
        myVet1.trim();
        myVet1.regularCheckup();
        myVet1.desinfestation();

        Adopter myAdopter1 = new Adopter();

        myAdopter1.name = "Tzitzi";
        System.out.println(myAdopter1.name);
        System.out.println(myAdopter1.sex);
        System.out.println(myAdopter1.address);
        System.out.println(myAdopter1.budget);

        Adopter myAdopter2 = new Adopter();
        System.out.println(myAdopter2.name);

    }

}
