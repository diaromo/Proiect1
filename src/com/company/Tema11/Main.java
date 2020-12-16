package com.company.Tema11;

import com.company.lab2.AnimalRescue.Animal;

public class Main {

    public static void main(String[] args) {
//Chem Metoda Punct 1
        Calculator myCalculator = new Calculator();

        System.out.println("Substraction = " + myCalculator.subs(1.2,2));
        System.out.println("Division = " + myCalculator.div(5,4));
        System.out.println("Addition = " + myCalculator.addition(3.2,2));
        System.out.println("Multiplication = " + myCalculator.multiplication(1.2,6));

 //Chem Metoda Punct 3
        LogicalOP myLogic = new LogicalOP();

        int x=5;
        int y=7;

        System.out.println("BiggerNumber is " + myLogic.checkBiggerNumber(x,y));

        int biggest = myLogic.checkBiggerNumber(x,y);
        System.out.println("BiggerNumber is " + biggest);

  //Chem Metoda Punct 4

        System.out.println(myLogic.companyName("orice"));
        System.out.println(myLogic.companyName("FastTrackIT"));
        System.out.println(myLogic.companyName("fasttrackit"));

//Chem Metoda Punct 5

        System.out.println(myLogic.companyName2("FastTrackIT",5));
        System.out.println(myLogic.companyName2("FastTrackIT",2));
        System.out.println(myLogic.companyName2("FastTrackIT",3));
        System.out.println(myLogic.companyName2("orice1",2));
        System.out.println(myLogic.companyName2("orice2",4));

//Chem Metoda Punct 6

        System.out.println(myLogic.zapada(9));
        System.out.println(myLogic.zapada(6));
        System.out.println(myLogic.zapada(15));
        System.out.println(myLogic.zapada(4));
        System.out.println(myLogic.zapada(8));

//Chem Metoda Punct 7

        System.out.println(myLogic.numarp7(5));
        System.out.println(myLogic.numarp7(4));
        System.out.println(myLogic.numarp7(2));

//Chem Metoda Punct 8
       myLogic.swmethod(4);
       myLogic.swmethod(5);
       myLogic.swmethod(11);
       myLogic.swmethod(-1);

//Chem Metoda Punct 9

        System.out.println(myLogic.isNumberEven(6));
        System.out.println(myLogic.isNumberEven(5));
        System.out.println(myLogic.isEligibleToVote(0));

//Chem Metoda Punct 10

        System.out.println(myLogic.isEligibleToVote(17));
        System.out.println(myLogic.isEligibleToVote(18));
        System.out.println(myLogic.isEligibleToVote(19));

//Chem Metoda Punct 11

        System.out.println(myLogic.maiMare(17,20,0));
        System.out.println(myLogic.maiMare(2,17,17));
        System.out.println(myLogic.maiMare(18,18,2));
        System.out.println(myLogic.maiMare(-2,-3,-9));

    }
}