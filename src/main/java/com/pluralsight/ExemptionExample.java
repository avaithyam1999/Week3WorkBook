package com.pluralsight;

public class ExemptionExample {
    public static void main(String[] args) {
        String[] students = {"Ajith", "Suno", "Radhi"};

        try {
            System.out.println(students[3]);
        } catch (Exception e) {
            System.out.println("Your entry was out of bounds, do better");
//            e.printStackTrace(); //This line prints the actual error code
        }
    }
}
