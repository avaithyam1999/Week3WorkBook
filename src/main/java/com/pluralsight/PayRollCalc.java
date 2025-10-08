package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PayRollCalc {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);
            String line;
            //Skips header line
            buffReader.readLine();
            while ((line = buffReader.readLine()) != null) {
//                System.out.println(line);
                Employee employee = new Employee();
                String[] parts = line.split("\\|");
                setParts(employee, parts);
                System.out.printf("ID: %d\nName: %s\nHours Worked: %.2f\nPay Rate: %.2f\nGross Pay: %.2f\n\n",employee.getEmployeeId(),employee.getName(),employee.getHoursWorked(),employee.getPayRate(),employee.getGrossPay());
            }
            buffReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void setParts(Employee employee, String[] parts) {
        employee.setEmployeeId(Integer.parseInt(parts[0]));
        employee.setName(parts[1]);
        employee.setHoursWorked(Double.parseDouble(parts[2]));
        employee.setPayRate(Double.parseDouble(parts[3]));
        employee.getGrossPay();
    }
}
