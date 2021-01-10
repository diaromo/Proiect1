package com.company.encapsulation;

public class AppMain {
    public static void main(String[] args) {

        Animal myAnimal1 = new Animal();
        myAnimal1.setType("Cat");
        System.out.println(myAnimal1.getType());
        myAnimal1.setAnimalName("Yoda");
        System.out.println(myAnimal1.getAnimalName());
        myAnimal1.setAgeYears(5);
        System.out.println(myAnimal1.getAgeYears());
        myAnimal1.setFavoriteActivity("Sleep");
        System.out.println(myAnimal1.getFavoriteActivity());
        myAnimal1.setFavoriteFood("Wet");
        System.out.println(myAnimal1.getFavoriteFood());
        myAnimal1.setHappinessLevel(8);
        System.out.println(myAnimal1.getHappinessLevel());
        myAnimal1.setHungerLevel(5);
        System.out.println(myAnimal1.getHungerLevel());
        myAnimal1.setChip(true);
        System.out.println(myAnimal1.getChip());

        myAnimal1.eat();


        Food myFood1 = new Food();
        myFood1.setName("Royal Canin");
        System.out.println(myFood1.getName());
        myFood1.setPrice(100);
        System.out.println(myFood1.getPrice());
        myFood1.setPriceRon(99.99);
        System.out.println(myFood1.getPriceRon());
        myFood1.setType("Wet");
        System.out.println(myFood1.getType());
        myFood1.setQuantity(1);
        System.out.println(myFood1.getQuantity());
        myFood1.setQuantityKG(1);
        System.out.println(myFood1.getQuantityKG());
        myFood1.setStock(true);
        System.out.println(myFood1.getStock());


        Activity myActivity1 = new Activity();
        myActivity1.setDuration("30");
        System.out.println(myActivity1.getDuration());
        myActivity1.setDurationMinutes(30);
        System.out.println(myActivity1.getDurationMinutes());
        myActivity1.setLocation("Zorilor");
        System.out.println(myActivity1.getLocation());

        Vet myVet1 = new Vet();
        myVet1.setName("Zuzu");
        System.out.println(myVet1.getName());
        myVet1.setExperience(10);
        System.out.println(myVet1.getExperience());
        myVet1.setLocation("Zorilor");
        System.out.println(myVet1.getLocation());
        myVet1.setPrizes("Excellence for cats");
        System.out.println(myVet1.getPrizes());
        myVet1.setSchedule("9:00 AM to 17:00 PM");
        System.out.println(myVet1.getSchedule());
        myVet1.setSpecialisation("All");
        System.out.println(myVet1.getSpecialisation());
        myVet1.trim();
        myVet1.regularCheckup();
        myVet1.desinfestation();

        Adopter myAdopter1 = new Adopter();
        myAdopter1.setName("Diana");
        System.out.println(myAdopter1.getName());
        myAdopter1.setSex("F");
        System.out.println(myAdopter1.getSex());
        myAdopter1.setAdress("Zorilor");
        System.out.println(myAdopter1.getAdress());
        myAdopter1.setBudget(500);
        System.out.println(myAdopter1.getBudget());


    }

}
