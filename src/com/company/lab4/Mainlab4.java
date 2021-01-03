package com.company.lab4;

import com.company.Tema11.Calculator;

public class Mainlab4 {

    public static void main(String[] args) {

        int start = 10;
        int finish = 5;

        for (int i=start; i>=finish;i--){
            System.out.println(i);
        }
        logiclab4.printFromHighToLow(start, finish);

        //Sum the numbers from 1 to 100
        int sum = 0;
        for(int i=1; i<=100;i++){
            sum = i+sum;
            System.out.println(sum);


        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int arr[] = {2, 6, 8, 10};
        for (int i : arr) {
            System.out.println(i);
        }
        int z = 25;
        for (int j=z;j<=100;j++){
            System.out.println(j);
        }

        logiclab4 logic = new logiclab4();
        logic.printToHundred(z);
        System.out.println(logic.getSum(1,100));


    }

}