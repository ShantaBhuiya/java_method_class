package com.syntexpro2.basic;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("this is my calculator");

        Scanner input = new Scanner(System.in);

        System.out.println("enter a integer number");
        int number1  = input.nextInt();

        System.out.println("enter another integer number");
        int number2 = input.nextInt();

        int sum = number1+number2;

        System.out.println("the result is " +sum);



    }
}
