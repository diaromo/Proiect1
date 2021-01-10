package com.company.inheritance;

public class AppMain {
    public static void main(String[] args) {

        //Cat
        Cat cat1 = new Cat();

        //inherited
        cat1.setFavoriteFood("Purina");
        System.out.println(cat1.getFavoriteFood());
        cat1.sleep();

        //specific
        cat1.purr(20);
        cat1.setPottyTrained(true);
        System.out.println(cat1.isPottyTrained());

        //Dog
        Dog dog1 = new Dog();
        //dog1.purr(20); does not work, dogs do not purr

        //inherited
        dog1.setAgeYears(7.5);
        System.out.println(dog1.getAgeYears());
        dog1.play();

        //specific
        dog1.playWithStick();
        System.out.println(dog1.getBreed());

        //rabbit
        Rabbit rabbit1 = new Rabbit();

        //inherited
        rabbit1.setHappinessLevel(10);
        System.out.println(rabbit1.getHappinessLevel());
        rabbit1.eat();

        //specific
        rabbit1.pinchPartner();
        System.out.println(rabbit1.getEarType());


        //Walk
        Walk activity1 = new Walk();
        //inherited
        activity1.setDurationMinutes(30);
        System.out.println(activity1.getDurationMinutes());
        activity1.happy();
        //specific
        activity1.escapeFromLeash();
        System.out.println(activity1.getWalkType());


        //Sleep
        Sleep activity2 = new Sleep();
        //inherited
        activity2.setLocation("Bed");
        System.out.println(activity2.getLocation());
        activity2.running();
        //specific
        activity2.getUp();
        System.out.println(activity2.getSleepType());

        //Male
        Male maleAdopter = new Male();
        //inherited
        maleAdopter.setName("Andrei");
        System.out.println(maleAdopter.getName());
        maleAdopter.petsTheAnimal();
        //specific
        maleAdopter.hugPet();
        System.out.println(maleAdopter.getShape());

        //Female
        Female femaleAdopter = new Female();
        //inherited
        femaleAdopter.setName("Diana");
        System.out.println(femaleAdopter.getName());
        femaleAdopter.dressesTheAnimal();
        //specific
        femaleAdopter.kissPet();
        System.out.println(femaleAdopter.getHairColor());

        //Homemade Food
        Homemade homeMadeFood = new Homemade();
        //inherited
        homeMadeFood.setQuantity(1);
        System.out.println(homeMadeFood.getQuantity());
        homeMadeFood.iCantStopEating();
        //specific
        homeMadeFood.petReaction();
        System.out.println(homeMadeFood.getFoodType());


        //Store Food
        Store storeFood = new Store();
        //inherited
        storeFood.setPriceRon(75);
        System.out.println(storeFood.getPriceRon());
        storeFood.iOnlyLikeWetFood();
        //specific
        storeFood.petTreatmentUrinary();
        System.out.println(storeFood.getFoodTypeStore());

        //Vet HomeConsult
        HomeConsult homeConsult = new HomeConsult();
        //inherited
        homeConsult.setLocation("Zorilor");
        System.out.println(homeConsult.getLocation());
        homeConsult.desinfestation();
        //specific
        homeConsult.stayStill();
        System.out.println(homeConsult.getConsultType1());

        //Vet CabinetConsult
        CabinetConsult cabinetConsult = new CabinetConsult();
        //inherited
        cabinetConsult.setSchedule("9:00 AM to 15:00 PM");
        System.out.println(cabinetConsult.getSchedule());
        cabinetConsult.regularCheckup();
        //specific
        cabinetConsult.beScared();
        System.out.println(cabinetConsult.getConsultType2());
    }

}
