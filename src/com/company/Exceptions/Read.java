package com.company.Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {

//1. In clasa Read, din programul vostru, creati o metoda tratat,
// care sa returneze un numar de la tastatura.

    public int readInt() {
        int x = 0;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return x;
    }

//2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
// care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

    public float readFloat() {
        float x = 0;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextFloat();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return x;
    }

    public double readDouble() {
        double x = 0;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextDouble();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return x;
    }

    public double readLong() {
        long x = 0;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextLong();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return x;
    }

    public String readString() {
        String x = "Tip String";
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.next();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return x;
    }

    public void printIntArray (int[] a) {
        for (int i = 0; i< a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

 //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
// Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] returnInputArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu numarul " + (i+1) + " din " + n + ": ");
            a[i] = scanner.nextInt();
        }
        return a;
    }

// 4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
// Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public List returnInputList() {
        List<Integer> l = new ArrayList<>();
        boolean read = true;
        int x = 0;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextInt();
                l.add(x);
            } catch (InputMismatchException e) {
                System.out.println("Valoarea introdusa nu e un numar. Ne oprim si printam lista");
                read = false;
            }
        }
        return l;
    }
}
