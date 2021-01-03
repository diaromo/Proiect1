package com.company.inheritance;

import com.company.encapsulation.Activity;
import com.company.encapsulation.Adopter;
import com.company.encapsulation.Food;
import com.company.encapsulation.Vet;

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



    }

}
