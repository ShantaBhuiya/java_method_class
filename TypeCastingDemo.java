package com.syntexpro2.basic;

public class TypeCastingDemo {
    public static void main(String[] args) {
// widening casting : byte-short-char-int-long-float-double
       /* int a =9;
        double b = a;
        System.out.println(b);

//Narrowing casting : double-float-long-int-char-short-byte
        double c = 5.0;
        int d = (int)c;
        System.out.println(d);
        */

        byte a = 9;
        short k = a;
        System.out.println("Widening casting: " +k);

        double c = 5.0;
        int d = (int)c;
        System.out.println("Narrowing casting " + d);

        int x = 20;
        long y = x;
        System.out.println(y);

        byte x1 = 20;
        char y1 = (char)x1;
        System.out.println(y1);

        System.out.println();


    }
}
