package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String[] stories = {"goldilocks.txt", "hansel_and_gretel.txt", "mary_had_a_little_lamb"};
        System.out.println("What story would you like to hear? ");
        String userInput = scanner.nextLine();
        boolean running = true;

//        while(running)
//            if (userInput.equals(stories[0])) {
//                BufferedReader buffReader = new BufferedReader(new FileReader(userInput));
//                String text;
//
//                System.out.println(text);
//            }



    }
}
