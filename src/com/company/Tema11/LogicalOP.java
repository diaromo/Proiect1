package com.company.Tema11;

import java.util.concurrent.LinkedTransferQueue;

public class LogicalOP {

    //Punctul 3 if/else

    public int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }
    //Punctul 4 if/else

    public String companyName(String x) {
        if (x.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }
    //Punctul 5 if/else

    public String companyName2(String a, int b) {
        if (a.equals("FastTrackIT") && b <= 3) {
            return (a + b);
        } else if (!a.equals("FastTrackIT") && b >= 4) {
            return (b + a);
        }
        return "";

    }
    //Punctul 6 if/else

    public String zapada(int z) {
        if (z > 8 || z == 6) {
            return "The amount of snow this winter was(cm): " + z;
        } else {
            return "The forecast snow is(cm):" + z;
        }
    }

    //Punctul 7 if/else
    public String numarp7(int p) {
        if (p > 3 && p != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (p == 4) {
            return "The number is lower than 3";
        } else {
            return "The number is equal to 4";
        }
    }

    //Punctul 8 if/else
    public void swmethod(int x) {
        switch (x) {
            case 1:
                System.out.println("The number is:  1 !");
                break;
            case 2:
                System.out.println("The number is:  2 !");
                break;
            case 3:
                System.out.println("The number is:  3 !");
                break;
            case 4:
                System.out.println("The number is:  4 !");
                break;
            case 5:
                System.out.println("The number is:  5 !");
                break;
            case 6:
                System.out.println("The number is:  6 !");
                break;
            case 7:
                System.out.println("The number is:  7 !");
                break;
            case 8:
                System.out.println("The number is:  8 !");
                break;
            case 9:
                System.out.println("The number is:  9 !");
                break;
            case 10:
                System.out.println("The number is: 10 !");
                break;
            default:
                System.out.println("Not between 1 and 10");

        }
    }

    //Punctul 9 if/else
    public Boolean isNumberEven(int e) {
        if (e%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Punctul 10 if/else
    public Boolean isEligibleToVote(int v){
        if (v>=18) {
            return true;
        }else {
            return false;
        }
    }

    //Punctul 11 if/else
    public int maiMare(int x,int y, int z){
        if (x>=y && x>=z) {
            return x;
        }
        else if (y>=x && y>=z){
            return y;
        }
        return z;
    }


}
