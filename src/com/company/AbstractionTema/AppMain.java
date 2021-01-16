package com.company.AbstractionTema;

public class AppMain {
    public static void main(String[] args) {
//Animal Category
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Rabbit myRabbit = new Rabbit();
        //Animal myAnimal = new Animal(); - cannot be instantiated

//Calling Abstract
        myCat.speak();
        myDog.speak();
        myRabbit.speak();
//Calling other
        myCat.sleep();
        myDog.sleep();
        myRabbit.sleep();

//Activity category
        CatActivity myCatActivity = new CatActivity();
        DogActivity myDogActivity = new DogActivity();
        RabbitActivity myRabbitActivity = new RabbitActivity();
        myCatActivity.walk();
        myDogActivity.walk();
        myRabbitActivity.walk();

        myCatActivity.begForAttention();
        myDogActivity.begForAttention();
        myRabbitActivity.begForAttention();
 //Adopter category
        Female myFemale = new Female();
        Male myMale = new Male();

        myFemale.likes();
        myMale.likes();

        myFemale.petsAnimal();
        myMale.petsAnimal();
//Vet category
        CatVet myCatVet = new CatVet();
        DogVet myDogVet = new DogVet();
        RabbitVet myRabbitVet = new RabbitVet();
        myCatVet.regularCheckup();
        myDogVet.regularCheckup();
        myRabbitVet.regularCheckup();

        myCatVet.desinfestation();
        myDogVet.desinfestation();
        myRabbitVet.desinfestation();
//Food category

        CatFood myCatFood = new CatFood();
        DogFood myDogFood = new DogFood();
        RabbitFood myRabbitFood = new RabbitFood();
        myCatFood.homemade();
        myDogFood.homemade();
        myRabbitFood.homemade();

        myCatFood.fromStore();
        myDogFood.fromStore();
        myRabbitFood.fromStore();

    }
}
