package com.pluralsight;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PayRollCalc {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("employees.csv");
        System.out.println(fileReader.read());
    }
}
