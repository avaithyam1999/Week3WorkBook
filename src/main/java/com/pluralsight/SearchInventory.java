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
        System.out.println("We carry the following inventory: ");
        System.out.println("What would you like to add to the inventory: ");
        String userInput = scanner.nextLine();
        inventory.add(new Product(1235,"Wood", 215));
        for (Product p : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try (BufferedReader buffReader = new BufferedReader(new FileReader("inventory.csv"));){
            String item;
            buffReader.readLine();

            while ((item = buffReader.readLine()) != null) {
                String[] parts = item.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                float price = Float.parseFloat(parts[2]);

                inventory.add(new Product(id, name, price));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return inventory;
    }
}