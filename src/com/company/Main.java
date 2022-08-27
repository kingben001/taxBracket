package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your income");
        double income = keyboard.nextDouble();

        if (income >= 0 && income <=10000){
           double taxed = income * .10;
            System.out.println("You owe $" +taxed);
        }
        if (income >10000 && income <=50000){
            double taxed = income * .20;
            System.out.println("You owe $" +taxed);
        }
        if (income > 50000 && income <=100000){
            double taxed = income * .30;
            System.out.println("You owe $" +taxed);
        }
        if (income >= 100000){
            double taxed = income * .40;
            System.out.println("You owe $" +taxed);
        }
    }
}
