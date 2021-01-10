package com.company.Tema13;

import com.company.lab3.Logic;

public class Main {
    public static void main(String[] args) {
        //Java Arrays Punct 1
        Calculator c1 = new Calculator();
        System.out.println("Substraction = " + c1.subs(1.2, 2));
        System.out.println("Substraction = " + c1.subs(1.2, 2, 3));
        System.out.println("Substraction = " + c1.subs(3, 2, 3));

        System.out.println("Division = " + c1.div(5, 4));
        System.out.println("Division = " + c1.div(5, 4, 1));
        System.out.println("Division = " + c1.div(5.5f, 4, 1, 2));

        System.out.println("Addition = " + c1.addition(3.2, 2));
        System.out.println("Addition = " + c1.addition(3.2, 2, 4));
        System.out.println("Addition = " + c1.addition(2, 2, 2));

        System.out.println("Multiplication = " + c1.multiplication(1.2, 6));
        System.out.println("Multiplication = " + c1.multiplication(3, 6, 1));
        System.out.println("Multiplication = " + c1.multiplication(1.2f, 6, 2));

        //Java Arrays Punct 2
        LogicalOp logic = new LogicalOp();

        int[] myFirstArray = logic.setValuesToArray(100);
        System.out.println("\n");

        //Java Arrays Punct 3
        int[] arrayGol = new int[50];
        arrayGol = logic.evenArray(arrayGol);

        for (int k = 0; k < arrayGol.length; k++) {
            System.out.print(arrayGol[k] + ", ");
        }

        //Java Arrays Punct 4
        System.out.println("\n " + logic.getAverageFromArray(myFirstArray));
        System.out.println("\n " + logic.getAverageFromArray(arrayGol));

        //Java Arrays Punct 5
        String[] myStringArray = {"Didi","Petru","Cat"};
        System.out.println(logic.checkValueFromString(myStringArray, "Dog"));
        System.out.println(logic.checkValueFromString(myStringArray, "Cat"));
        System.out.println(logic.checkValueFromString(myStringArray, "cat"));

        //Java Arrays Punct 6
        int[] myNumberArray = {5,8,20,26,27};
        System.out.println(logic.checkPositionFromArray(myNumberArray,26));
        System.out.println(logic.checkPositionFromArray(myNumberArray,0));
        System.out.println(logic.checkPositionFromArray(myNumberArray,5));

        //Java Arrays Punct 7
        String[] symbolArray = {"-","-","-","-","-","-","-","-","-","-"};
        logic.printSymbols(symbolArray);

        //Java Arrays Punct 8
        int[] printArray = {5,8,20,26,27};
        for (int x=0; x <printArray.length; x++ ){
            System.out.print(printArray[x] + " ");
        }
        System.out.print("\n");
        int[] printArray2 = logic.checkArray(printArray,26);
        for (int x=0; x <printArray2.length; x++ ){
            System.out.print(printArray2[x] + " ");
        }

        //Java Arrays Punct 9
        int [] printSmallest = {7,3,4,1,2,-1,0,11,10};
        System.out.print("\n");
        System.out.println(logic.returnSeconSmallest(printSmallest));

        //Java Arrays Punct 10
        int[] copyArray1 = {2,6,-1,4};
        int[] copyArray2 = new int[4];
        copyArray2 = logic.copyArray(copyArray1, copyArray2);
        for (int z = 0; z < copyArray2.length; z++) {
            System.out.print(copyArray2[z] + " ");

        }

        //Java Arrays Optional Punct 2
        int[] numbers = {2,6,-1,4};
        System.out.println(logic.returnBigAndSmall(numbers));
    }
}
