package test;

import org.junit.jupiter.api.*;

public class Test {

    double dbl = 2.03;

    @org.junit.jupiter.api.Test
    public void Main() {
        String str = "abc";
        System.out.println("str: " + str);
        System.out.println(dbl);
        print();
    }


    public void print() {
        int n = 0;

        while (n == 0) {
            int m = 0;
            while (m < 6) {
                System.out.print("A");
                m++;
            }
            System.out.println();
            n++;
        }

        while (n > 0 && n < 4) {
            int m = 0;
            if (m ==0) {
                System.out.print("A");
                m++;
            }
            while (m < 5 && m > 0) {
                System.out.print(" ");
                m++;
            }
            if (m == 5) {
                System.out.print("A");
                m++;
            }

            System.out.println();
            n++;
        }

        if (n == 4) {
            int m = 0;
            while (m < 6) {
                System.out.print("A");
                m++;
            }
            System.out.println();
            n++;
        }

    }


}
