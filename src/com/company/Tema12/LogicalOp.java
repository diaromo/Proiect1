package com.company.Tema12;

public class LogicalOp {

    //Punct 1 - Java For Loops

    public void printToHundred(int startValue) {
        for (int i = startValue; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //Punct 2 - Java For Loops
    public void printToMinusHundred(int startValue) {
        for (int i = startValue; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //Punct 3 - Java For Loops - Works if startValue<stopValue
    public void printFromTo(int startValue, int stopValue) {
        for (int i = startValue; i <= stopValue; i++) {
            System.out.println(i);
        }
    }

    //Punct 4 - Java For Loops
    public void printFromToOk(int startValue, int stopValue) {
        if (startValue <= stopValue) {
            for (int i = startValue; i <= stopValue; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = startValue; i >= stopValue; i--)
                System.out.println(i);
        }
    }

    //Punct 5 - Java For Loops
    public void oneToHundredEven() {
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    //Punct 6 - Java For Loops
    public void oneToHundredOdd() {
        for (int x = 1; x <= 100; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    //Punct 7 - Java For Loops
    public int getSum(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = i + sum;
        }
        return sum;
    }

    //Punct 8 - Java For Loops
    public double getSum2(double first, double last) {
        double average = 0;
        for (double i = first; i <= last; i++) {
            average = (first + last) / 2;
        }
        return average;
    }

    //Punct 9 - Java For Loops
    public void asterX() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    //Punct 1 - Java While Loops
    public void printToHundredWhile(int startValue) {
        while (startValue <= 100) {
            System.out.println(startValue);
            startValue++;
        }
    }

    //Punct 2 - Java While Loops
    public void printStartEndWhile(int startValue, int stopValue) {
        while (startValue <= stopValue) {
            System.out.println(startValue);
            startValue++;
        }
    }

    //Punct 3 - Java While Loops
    public void printLoops1(int startValue, int stopValue) {
        if (startValue <= stopValue) {
            while (startValue <= stopValue) {
                System.out.println(startValue);
                startValue++;
            }
        }
    }

    //Punct 4 - Java While Loops
    public void printLoops(int startValue, int stopValue) {
        if (startValue <= stopValue) {
            while (startValue <= stopValue) {
                System.out.println(startValue);
                startValue++;
            }
        } else {
            while (startValue >= stopValue) {
                System.out.println(startValue);
                startValue--;
            }
        }
    }

    //Punct 5 - Java While Loops
    public void oneToHundredEven2(int startValue) {
        while (startValue <= 100) {
            if (startValue % 2 == 0) {
                System.out.println(startValue);
            }
            startValue = startValue + 1;
        }
    }

    //Punct 6 - Java While Loops
    public void oneToHundredOdd2(int startValue) {
        while (startValue <= 100) {
            if (startValue % 2 != 0) {
                System.out.println(startValue);
            }
            startValue = startValue + 1;
        }
    }

    //Punct 7 - Java While Loops
    public void sumAverage(int first, int last) {
        int count = 0;
        int sum = 0;
        double avg = 0;
        while (first <= last) {
            sum = first + sum;
            first++;
            count++;
        }
        System.out.println(sum);
        System.out.println(count);
        avg = sum / count;
        System.out.println(avg);

    }

    //Punct 8 - Java While Loops
    public double seven(double first, double last) {
        double sum = 0;
        double count = 0;

        while (first <= last) {
            if (first % 7 == 0) {
                sum = first + sum;
                count++;
            }
            first++;
        }
        return sum / count;
    }

    //Punct 9 - Java While Loops
    public void fibonacci(int sir) {
        int count = 20;
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibonacci: ");
        int i = 1;
        while (i <= count) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }

    //Punct 10 - Java While Loops
    public void printCoza(int start, int stop) {
        boolean clwFlag;
        int i = start - 1;
        while (i <= stop) {
            i++;
            clwFlag = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                clwFlag = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                clwFlag = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                clwFlag = true;
            }
            if (!clwFlag) {
                System.out.print(i);
            }
            System.out.print(" ");

            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }

}
