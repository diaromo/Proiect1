package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*        System.out.println("Hello");
        System.out.println("Diana");*/

        //Chem Metode Punct 1

        salutare("Diana");

       /* System.out.println(5+3);
        System.out.println(Integer.sum(5,3));
        System.out.println("Sum of 5 and 3 is " + Integer.sum(5,3));
        System.out.println("Sum of 5 and 3 is " + (5+3));*/


        int rezultatulAdunarii = adunare(5,4);
        System.out.println("Suma este " + rezultatulAdunarii);


/*        int a = 10;
        double b = 3;
        System.out.println(a/b);

        int a1 = 10;
        int b1 = 3;
        double c1=b1;
        System.out.println(a1/c1);*/

        double rezultatulImpartire = impartire(10,3);
        System.out.println("Rezultatul impartirii este " + rezultatulImpartire);

/*        System.out.println(-5+8*6);

        int x = -5;
        int y = 8;
        int z = 6;
        System.out.println(x+y*z);*/

        int rezultatCalul1 = calculComplex1(-5,8,6);
        System.out.println("Rezultat calculului este " + rezultatCalul1);
        System.out.println("Rezultat calculului este " + calculComplex1(-5,8,6));


        //System.out.println((55+9)%9);

        int rezultatCalcul2 = calcul2(55,9,9);
        System.out.println("Rezultat calculului este " + rezultatCalcul2);

   /*    double z1 = 20;
       double z2 = -3;
       double z3 = 5;
       double z4 = 8;
       System.out.println(z1+z2*z3/z4);
       System.out.println(20 + -3*5 / 8);*/

        double rezultatCalcul3 = calcul3(20, -3, 5, 8);
        System.out.println("Rezultat calculului este " + rezultatCalcul3);

       //System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        int rezultatCalcul4 = calcul4(5,15,3,2,8,3);
        System.out.println("Rezultatul calcului este " + rezultatCalcul4);

        //Chem Metode Punct 2

        int substraction = subs(5,1);
        System.out.println("Rezultatul scaderii este " + substraction);

        double divide = div(5,2);
        System.out.println("Rezultatul imparitrii este " + divide);

        int add = addition(5,8);
        System.out.println("Rezultatul adunarii este " + add);

        double multip = multiplication(3.2,4.5);
        System.out.println("Rezultatul inmultirii este " + multip);

        //Chem Metode - Punct 3

        String scrieJ = "   J    a  v     v   a\n" + "   J   a a  v   v   a a\n" + "J  J  aaaaa  V V   aaaaa\n" + " JJ  a     a  V   a     a\n";
        printWord(scrieJ);


        //Chem Metode Punct 4

        double rezultatMedie = mediaAritmetica(10,5,7);
        System.out.println("Rezultat este " + rezultatMedie);

        //Refolosesc Metoda Punct 3

        String scrieFace = """
                          +\"\"\"\"\"+
                         [| o o |]
                          |  ^  |
                          | '_' |
                          +-----+     
                          
                         """;

        String scrieFace2 = "  +\"\"\"\"\"+\n" + " [| o o |]\n" + "  |  ^  |\n"  + "  | '_' | \n" + "  +-----+\n";

        printWord(scrieFace);
        printWord(scrieFace2);

        //Chem Metode Punct 6

        //int rezultatModulo = modulo(10,3);
       // System.out.println("Rezultat este " + rezultatModulo);
        System.out.println("Rezultat este " + modulo(10,3));

        //Chem Metode Punct 7

        double c = transform(70);
        System.out.println("Transformare F= " + c + "C");

        //Chem Metode Punct 8

        double m = convert(24.2);
        System.out.println("Transformare in= " +m + "M");

        //Chem Metode Punct 8

        viteza(1000,1,60,0);

    }


//Tema Metode - Punct 1

    static void salutare(String nume) {
        System.out.println("Hello " + nume + "!");
    }

    static int adunare(int a, int b) {
        return (a+b);
    }

    static double impartire(double x, int y) {
        return (x/y);
    }

    static int calculComplex1(int x,int y, int z) {
        return (x+y*z);
    }

    static int calcul2 (int x,int y, int z) {
        return (x+y%z);
    }

    static double calcul3 (double z1, double z2, double z3, double z4) {
        return (z1+z2*z3/z4);
    }

    //Result will always result integer because of Modulo %
    static int calcul4 (int y1, int y2, int y3, int y4, int y5, int y6) {
        return (y1 + y2 / y3 * y4 - y5 % y6);
    }

    //Tema Metode - Punct 2

    static int subs(int firstnumber, int secondnumber) {
        return (firstnumber - secondnumber);

    }

    static double div(double didi, double romo) {
        return (didi/romo);

    }

    static int addition(int cat, int dog) {
        return (cat + dog);

    }

    static double multiplication(double d, double c) {
        return (d * c);
    }

    //Tema Metode - Punct 3 (aplicabil si pt. punct 5)

    static void printWord(String propozitie) {
        System.out.println(propozitie);


    }

    //Tema Metode - Punct 4

    static double mediaAritmetica (double c, int e, int f) {
        return (c+e+f)/3;
    }

    //Tema Metode - Punct 6

    static int modulo(int x, int y) {
        return (x%y);
    }

    //Tema Metode - Punct 7

    static double transform(int f) {
        return (5.0 / 9.0 * (f - 32));

    }

    //Tema Metode - Punct 8

    static double convert(double in) {
        return (in * 0.254);
    }

    //Tema Metode - Punct 9

    static void viteza(int d, int h, int m, int s) {
        double secunde = s+60*m+3600*h;
        double minute = secunde/60;
        double ore = minute/60;

        double vitezaMPS = d/secunde;
        double vitezaKPH = d/1000.0/ore;
        double vitezaMPH = d/1609.0/ore;

        System.out.println("metri/secunda: " + vitezaMPS);
        System.out.println("kilometri/ora: " + vitezaKPH);
        System.out.println("mile/ora: " + vitezaMPH);
    }
}
