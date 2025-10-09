package com.pluralsight;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Ajith");
        students.add("Suno");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
