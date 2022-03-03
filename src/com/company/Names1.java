package com.company;

public class Names1 {
    public static void main(String[] args) {
       String firstName = "Ada";
       String lastName = "Lovelace";
        System.out.println(firstName + " " + lastName);
        System.out.println(makeFullName(firstName, lastName));
        System.out.println(makeFullName("Grace", "Hopper"));
    }

    public static String makeFullName (String firstName, String lastName) {

        return firstName + " " + lastName;
    }
}
