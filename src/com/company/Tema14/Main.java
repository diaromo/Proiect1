package com.company.Tema14;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Integer> myList = new ArrayList<>();

        myList.add(11);
        myList.add(20);
        myList.add(70);
        myList.add(41);
        myList.add(50);

     Logic logic = new Logic();

    //Tema 14 Punct 1
    System.out.println("Tema 14.1");
    logic.printListValues(myList);

    //Tema 14 Punct 2
        System.out.println("Tema 14.2");
    logic.addNumberToList(myList,60);
    logic.printListValues(myList);

    //Tema 14 Punct 3
    System.out.println("Tema 14.3");
    logic.printListValuesFrom(myList,41);

   //Tema 14 Punct 4
    System.out.println("Tema 14.4");
    logic.printListValuesReversed(myList);

    //Tema 14 Punct 5
        List<String> myListString = new ArrayList<>();

        myListString.add("Diana");
        myListString.add("Matz");
        myListString.add("Yoda");

        System.out.println("Tema 14.5");
        logic.addStringToListAtPosition(myListString,2,"Cat");
        logic.printListValuesS(myListString);

        //Tema 14 Punct 6
        System.out.println("Tema 14.6");
        logic.addStringToListAtStart(myListString, "Dog");
        logic.printListValuesS(myListString);

        //Tema 14 Punct 7
        System.out.println("Tema 14.7");
        logic.printListStringWithPosition(myListString);

        //Tema 14 Punct 8
        System.out.println("Tema 14.8");
        System.out.println(logic.returnBiggest(myList));

        //Tema 14 Punct 1 Optional
        System.out.println("Tema 14.1 Optional");

        logic.changePosition(myList,0,2);
        logic.printListValues(myList);

        System.out.println("Tema 14.2 Optional");
        logic.changeEven(myList);
        logic.printListValues(logic.changeEven(myList));
    }
}
