package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = new String[10];
        boolean running = true;

        quotes[0] = "The only way to do great work is to love what you do.";
        quotes[1] = "In the middle of every difficulty lies opportunity.";
        quotes[2] = "Success is not final, failure is not fatal: it is the courage to continue that counts.";
        quotes[3] = "It always seems impossible until it’s done.";
        quotes[4] = "Don’t watch the clock; do what it does. Keep going.";
        quotes[5] = "The future belongs to those who believe in the beauty of their dreams.";
        quotes[6] = "Believe you can and you're halfway there.";
        quotes[7] = "Act as if what you do makes a difference. It does.";
        quotes[8] = "You miss 100% of the shots you don’t take.";
        quotes[9] = "Do something today that your future self will thank you for.";

        while (running) {
            System.out.println("Select a number 1-10 for your quote \nOr for a random quote, type 'random' \nEnter 0 to quit: ");
            String userInput = scanner.nextLine();

            if (userInput.trim().equals("0")) {
                running = false;
                System.out.println("Thanks for using quotes generator. GoodBYE!");
            } else if (userInput.trim().equalsIgnoreCase("random")||userInput.trim().equalsIgnoreCase("r")) {
                int randomNumber = (int) (Math.random() * quotes.length);
                System.out.println("Your random quote is:\n" + quotes[randomNumber]);
            } else {
                int userNumber = Integer.parseInt(userInput);
                int matchedQuote = userNumber - 1;
                try {
                    System.out.printf("Your selected quote is: \n%s\n", (quotes[matchedQuote]));
                }
                catch (Exception e) {
                    System.out.println("I said 1-10 dummy. \nTry again.\n");
                }
            }
        }
        scanner.close();
    }
}
