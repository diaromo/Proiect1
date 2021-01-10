package com.company.Tema13;

public class LogicalOp {
    //Java Arrays Punct 2
    public int[] setValuesToArray ( int maxValue){
        int[] array = new int[maxValue];
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + ", ");
        }
        return array;
    }

    //Java Arrays Punct 3
    public int[] evenArray (int[] emptyArray){
        int i = 0;
        for (int j = 1; j<=100; j++) {
            if (j % 2 == 0) {
                emptyArray[i] = j;
                i++;
            }
        }
        return emptyArray;
    }

    //Java Arrays Punct 4
    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    //Java Arrays Punct 5

    public boolean checkValueFromString(String[] a, String s){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) {
                return true;
            }
        }
        return false;
    }

    //Java Arrays Punct 6


    public int checkPositionFromArray(int[] a, int s){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) {
                return i;
            }
        }
        return -1;
    }

    //Java Arrays Punct 7

    public void printSymbols(String[] s){
        for (int i=0; i < 10; i++){
            for(int j=0; j < s.length; j++){
                System.out.print(s[j]);
            }
            System.out.print("\n");
        }
    }

    //Java Arrays Punct 8

    public int[] checkArray(int[] a, int s){
        int[] b = new int[a.length-1];

        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] != s) {
                b[j++] = a[i];
            }
        }
        return b;
    }

    //Java Arrays Punct 9


    public int returnSeconSmallest (int [] a){
        int smallest = a[0];
        int secondSmallest = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < smallest){
                secondSmallest = smallest;
                smallest = a[i];
            }
            else if (a[i] < secondSmallest) {
                secondSmallest = a[i];
            }
        }
        return secondSmallest;
    }

    //Java Arrays Punct 10

    public int[] copyArray(int[] a, int[] b){

        for (int i = 0; i < a.length; i++) {
           b[i]=a[i];
        }
        return b;
    }
    //Arrays Optional Punct 2

    public String returnBigAndSmall (int [] a){
        int smallest = a[0];
        int biggest = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < smallest){
                smallest = a[i];
            }
            if (a[i] > biggest) {
                biggest = a[i];
            }
        }
        return ("\nSmallest =" + smallest + " and Biggest = " + biggest);
    }

}

