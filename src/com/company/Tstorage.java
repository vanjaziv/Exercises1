package com.company;

public class Tstorage {
    public static void main(String[] args) {
        float first = 2.1f;
        float second = 2.2f;
        float temporaryStorage;

        temporaryStorage = first;
        first = second;
        second = temporaryStorage;

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}
