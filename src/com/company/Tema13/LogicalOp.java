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
    public double getAverageFromArray(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum/array.length;
    }
}

