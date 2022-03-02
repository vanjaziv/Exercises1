package com.company;

public class Discount {
    public static void main(String[] args) {
        boolean seniorCitizen = true;
        boolean dog = false;
        boolean student = false;
        System.out.println("On this bus you get discount: " + (seniorCitizen || dog || student));

        int nonFiction = 1;
        int fiction = 2;
        System.out.println("In this bookshop I get a discount: " + (nonFiction>= 2 && fiction > 0));

        int nonAlcoholic = 1;
        int alchocolic = 0;
        System.out.println("In this grocery I get a discount: " + (nonAlcoholic>= 1 && alchocolic< 1));
    }
}
