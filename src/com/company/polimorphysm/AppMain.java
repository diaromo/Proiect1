package com.company.polimorphysm;

import static com.company.polimorphysm.CabinetConsult.*;

public class AppMain {
    public static void main(String[] args) {

    Animal myAnimal1 = new Animal();
    Dog myDog = new Dog();

    myAnimal1.play();
    myDog.play();

    Cat myCat = new Cat();

    myAnimal1.eat();
    myCat.eat();

    Rabbit myRabbit = new Rabbit();

    myAnimal1.sleep();
    myRabbit.sleep();

   Activity myActivity = new Activity();

   Sleep itSleeps = new Sleep();

   myActivity.sleep();
   itSleeps.sleep();

   Walk isWalking = new Walk();

   myActivity.running();
   isWalking.running();

   Food myFood = new Food();
   Homemade isFromHome = new Homemade();

   myFood.iCantStopEating();
   Homemade.iCantStopEating();

   Store isFromStore = new Store();

   myFood.iOnlyLikeWetFood();
   Store.iOnlyLikeWetFood();

   Vet myVet = new Vet();

   HomeConsult isHome = new HomeConsult();

   myVet.desinfestation();
   HomeConsult.desinfestation();

   CabinetConsult isAtCabiet = new CabinetConsult();

   myVet.regularCheckup();
   CabinetConsult.regularCheckup();

   Adopter myAdopter = new Adopter();

   Male maleAdopter = new Male();
   myAdopter.petsTheAnimal();
   maleAdopter.petsTheAnimal();

   Female femaleAdopter = new Female();
   myAdopter.dressesTheAnimal();
   femaleAdopter.dressesTheAnimal();
    }
}
