package com.company.lab4;

public class logiclab4 {

    public void printToHundred(int startValue){
        for (int i =startValue;i<=100;i++){
            System.out.println(i);
        }
    }
    public void printToHundredWhile (int startValue){
        while (startValue<=100){
            System.out.println(startValue);
            startValue++;
        }
    }

    public static void printFromHighToLow(int start, int finish){
        for (int i=start; i>=finish;i--){
            System.out.println(i);
        }
    }
    public int getSum(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = i + sum;}
            {
                return sum;
            }
    }
}