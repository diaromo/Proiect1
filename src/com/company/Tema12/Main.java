package com.company.Tema12;

import com.company.lab4.logiclab4;

public class Main {
    public static void main(String[] args) {

        LogicalOp logic = new LogicalOp();
        logic.printToHundred(50);
        logic.printToHundred(98);

        logic.printToMinusHundred(0);
        logic.printToMinusHundred(-60);

        logic.printFromTo(2, 15);
        logic.printFromTo(5, 3); // does not work

        logic.printFromToOk(5, 3);
        logic.printFromToOk(3, 5);
        logic.printFromToOk(4, 4);

        logic.oneToHundredEven();

        logic.oneToHundredOdd();

        System.out.println(logic.getSum(1, 100));

        System.out.println(logic.getSum2(2, 4));
        System.out.println(logic.getSum2(2, 3)); //only works with start>stop

        logic.asterX();

        logic.printToHundredWhile(90);

        logic.printStartEndWhile(7,11);

        logic.printLoops1(1,4);

        logic.printLoops(1,5);
        logic.printLoops(5,1);
        logic.printLoops(0,1);

        logic.oneToHundredEven2(80);

        logic.oneToHundredOdd2(5);


        logic.sumAverage(111,113);
        logic.sumAverage(111,8899);

        System.out.println(logic.seven(6,15));
        System.out.println(logic.seven(6,21));

        logic.fibonacci(20);

        System.out.println("\n");

        logic.printCoza(1,110);
    }
}
