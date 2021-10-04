package com.company;


import java.util.Scanner;

public class Main {
    //    Asking for the Status and Income
    //  Declare the Variables
    //  we need user input i.e. scanner
    // Use If/Else conditionals
    public static void main(String[] args) {
       // write your code here Hello people!
/*
        slide 42
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

         //slide 39
        // Calculate Body Mask Index
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kilograms:");
        float weight = input.nextFloat();
        System.out.println("Please enter your height in centimeters:");
        float height = input.nextFloat();

        float bmi = weight \ (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi >=25.0 && bmi < 30.0){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }


             Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your weight in kilograms:");
//        float weight = input.nextFloat();
//        System.out.println("Please enter your height in Meters:");
//        float height = input.nextFloat();
//        float squareHeight = (height * height);
//        float bmi = weight / squareHeight;
//        System.out.println(bmi);
//        if (bmi < 18.5) {
//            System.out.println("Underweight");
//        } else if (bmi >= 18.5 && bmi < 25.0) {
//            System.out.println("Normal");
//        } else if (bmi >=25.0 && bmi < 30.0){
//            System.out.println("Overweight");
//        } else {
//            System.out.println("Obese");
//        }
//        Scanner input = new Scanner(System.in);
//        double userWeight;
//        double userHeight;
//        double sqrHeight;
//        double bmi;
//
//        System.out.println("Enter your height in meters: ");
//        userHeight = input.nextDouble();
//        System.out.println("Enter your weight in kilograms: ");
//        userWeight = input.nextDouble();
//        sqrHeight = (userHeight * userHeight);
//        bmi = userWeight / sqrHeight;
//        System.out.printf("Your BMI is %.2f :", bmi);







        Slide 56
        Write a program that prompts the user to enter a year
        and displays the animal for the year.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = input.nextInt();
        switch(year) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }
        System.out.println();


        Slide 21

        Write a program that randomly generates a lottery of a two-digit number,
                prompts the user to enter a two-digit number, and determines whether the user wins
        according to the following rule:
        If the user input matches the lottery exactly, the award is $5,000.
        If the user input matches both digits but in the wrong order, the award is $1,000.
        If either digit of the user input matches any digit of the lottery, the award is $250.
                Otherwise the award is $0.

*/


        double random = (0 + Math.random()* 50).Math.round();
        int newNumber = (int)random;
        System.out.println(random);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the two digit number: ");
        int number =  input.nextInt();
            if (newNumber == number) {
            System.out.println("You got the award of 5000");
            else if (newNumber ==  )
            System.out.println("");

    }
}

