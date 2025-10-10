package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        printInventory(inventory);
        askUserInput(running, scanner, inventory);

    }


    private static void askUserInput(boolean running, Scanner scanner, ArrayList<Product> inventory) {
        while (running) {
            System.out.println("What would you like to add to the inventory(Enter in id:__|name:__|price:xx.xx format): \nEnter 'quit' to leave\n");
            String userInput = scanner.nextLine();
            if (userInput.equals("quit")) {
                printUpdatedInventory("Final Count on Inventory", inventory);
                System.out.println("Goodbye!");
                break;
            }
            else {
                try {
                    String[] splitInput = userInput.split("\\|");
                    int newID = Integer.parseInt(splitInput[0].trim());
                    String newName = splitInput[1].trim();
                    float newPrice = Float.parseFloat(splitInput[2].trim());
                    inventory.add(new Product(newID, newName, newPrice));
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }

//            askUserInput(scanner, inventory);
            printUpdatedInventory("Updated Inventory: ", inventory);
        }
    }

    private static void printUpdatedInventory(String x, ArrayList<Product> inventory) {
        System.out.println(x);
        for (Product p : inventory) {
            System.out.printf("id: %d Item Name: %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    private static void printInventory(ArrayList<Product> inventory) {
        printUpdatedInventory("We carry the following inventory: ", inventory);
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        try (BufferedReader buffReader = new BufferedReader(new FileReader("inventory.csv"));){
            String item;
            buffReader.readLine();

            while ((item = buffReader.readLine()) != null) {
                String[] parts = item.split("\\|");

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                float price = Float.parseFloat(parts[2].trim());

                inventory.add(new Product(id, name, price));
            }
        } catch (IOException e) {
            System.out.println("Make sure you are entering in the proper format");
        }

        return inventory;
    }
}