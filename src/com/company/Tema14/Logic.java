package com.company.Tema14;

import java.util.*;

public class Logic {

    //Tema 14 Punct 1
    // Scrieti o metoda Java,
    // care sa primeasca parametru o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, fiecare pe rand nou.

    public void printListValues(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    //String Method - separat
    public void printListValuesS(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    //Tema 14 Punct 2
    //Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addNumberToList(List<Integer> myList, int number) {
        myList.add(number);
    }
    //Tema 14 Punct 3
    //Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printListValuesFrom(List<Integer> myList, int number) {
        for (int i = myList.indexOf(number); i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    //Tema 14 Punct 4
    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void printListValuesReversed(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }
    //Tema 14 Punct 5
    //Scrieti o metoda Java, care sa primeasca trei parametrii:
    // unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg
    // reprezinta pozitia la care sa fie pus acel String.

    public void addStringToListAtPosition(List<String> myList, int number, String s) {
        myList.add(number, s);
    }
    //Tema 14 Punct 6
    //Scrieti o metoda Java, care sa primeasca doi parametrii.
    //Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void addStringToListAtStart(List<String> myList, String s) {
        myList.add(0, s);
    }
    //Tema 14 Punct 7
    //Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
    // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void printListStringWithPosition(List<String> myStringList) {

        for (int i = 0; i < myStringList.size(); i++) {
            System.out.println("Pe pozitia " + i + " valoarea este " + myStringList.get(i));
        }
    }

    //Tema 14 Punct 8
    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.


    public int returnBiggest(List<Integer> myList) {
        int biggest = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > biggest) biggest = myList.get(i);
        }
        return biggest;
    }

    //Tema 14 Optional
    //Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,

    public void changePosition(List<Integer> myList, int x, int y) {
        Collections.swap(myList, x, y);
    }
    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista,
    // care sa contina doar numerele pare din lista primita.

    public List changeEven(List<Integer> myList){
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++){
            if(myList.get(i)%2 ==0) evenList.add(myList.get(i));
        }
        return evenList;
    }
}
