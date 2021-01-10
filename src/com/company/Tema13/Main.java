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
    }
}
