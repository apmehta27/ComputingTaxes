package com.company;


import java.util.Scanner;

public class Main {
    //    Asking for the Status and Income
    //  Declare the Variables
    //  we need user input i.e. scanner
    // Use If/Else conditionals
    public static void main(String[] args) {
        // write your code here Hello people!
        Scanner input = new Scanner(System.in);
        int tax = 0;
        System.out.println("Please enter your filing status, either: 1.Single, 2.Married jointly, 3.Married separate, 4.Head of Household: ");
        int status = input.nextInt();
        System.out.println("Please enter your annual income:");
        int income = input.nextInt();
        // Single
        if (status == 1) {
            if (income >= 0 && income <= 8350) {
                tax = 10;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 8351 && income <= 33950) {
                tax = 15;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 33951 && income <= 82250) {
                tax = 25;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 82251 && income <= 171550) {
                tax = 28;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 171551 && income <= 372950) {
                tax = 33;
                System.out.println("The tax rate is " + tax + "%");
            } else {
                tax = 35;
                System.out.println("The tax rate is " + tax + "%");
            }
        }
        //Married filed jointly
        if (status == 2) {
            if (income >= 0 && income <= 16700) {
                tax = 10;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 16701 && income <= 67900) {
                tax = 15;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 67901 && income <= 137050) {
                tax = 25;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 137051 && income <= 208850) {
                tax = 28;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 208851 && income <= 372950) {
                tax = 33;
                System.out.println("The tax rate is " + tax + "%");
            } else {
                tax = 35;
                System.out.println("The tax rate is " + tax + "%");
            }
        }
        //Married Filing Separately
        if (status == 3) {
            if (income >= 0 && income <= 8350) {
                tax = 10;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 8351 && income <= 33950) {
                tax = 15;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 33951 && income <= 68525) {
                tax = 25;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 68526 && income <= 104425) {
                tax = 28;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 104426 && income <= 186475) {
                tax = 33;
                System.out.println("The tax rate is " + tax + "%");
            } else {
                tax = 35;
                System.out.println("The tax rate is " + tax + "%");
            }
        }
        // Head of Household
        if (status == 4) {
            if (income >= 0 && income <= 11950) {
                tax = 10;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 11951 && income <= 45500) {
                tax = 15;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 45501 && income <= 117450) {
                tax = 25;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 117451 && income <= 190200) {
                tax = 28;
                System.out.println("The tax rate is " + tax + "%");
            } else if (income >= 190201 && income <= 372950) {
                tax = 33;
                System.out.println("The tax rate is " + tax + "%");
            } else {
                tax = 35;
                System.out.println("The tax rate is " + tax + "%");
            }
        }
    }
}

