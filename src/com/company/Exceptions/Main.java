package com.company.Exceptions;

import com.company.Tema14.Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main<myArrayOfFloat, myFloat> {

    public static void main(String[] args) {

   //In clasa Read, din programul vostru, creati o metoda tratat,
   // care sa returneze un numar de la tastatura.

        Read read = new Read();
       int[] myArray = {5, 2, 3, 1};
       int myInt = read.readInt();
       System.out.println(myArray[myInt]);

    //In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
    // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

        float[] myArrayOfFloat = { 5.2F,1.3F, 4.5F, 6.8F};
        float myFloat = read.readFloat();
        System.out.println(myArrayOfFloat[(int) myFloat]);

        double[] myArrayOfDouble = {1.1,3.3,4.4,5.5};
        double myDouble = read.readDouble();
        System.out.println(myArrayOfDouble[(int) myDouble]);

        long[] myArrayOfLong = {1536622219999999999L,1222211223891069999L};
        long myLong = (long) read.readLong();
        System.out.println(myArrayOfLong[(int) myLong]);

        String[] myArrayOfString = { "Diana", "Romosan"};
        String myString = read.readString();
        System.out.println(myArrayOfString[Integer.parseInt(myString)]);

        // Punct 4

        read.printIntArray(read.returnInputArray(5));
        read.returnInputList();

        Logic logic = new Logic();
        logic.printListValues(read.returnInputList()); //print method imported from tema 14

        //Punct 5
        LogicalOp lop = new LogicalOp();
        int[] ar = {1,2,3,4,5};
        System.out.println(lop.printPositionFromArray(ar, 2));
        System.out.println(lop.printPositionFromArray(ar, 7));

        //Punct 6
        lop.wait(3);
    }
}










