package com.bridgelabz.methods.levelthree;

import java.util.Random;

public class BonusSalary {

        static double[][] generateEmployeeData(int employees) {
            Random random = new Random();
            double[][] employeeData = new double[employees][2];

            for (int i = 0; i < employees; i++) {
                employeeData[i][0] = random.nextInt(90000) + 10000;
                employeeData[i][1] = random.nextInt(11);
            }
            return employeeData;
        }

        static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
            double[][] updatedSalaries = new double[employeeData.length][2];

            for (int i = 0; i < employeeData.length; i++) {
                double oldSalary = employeeData[i][0];
                double yearsOfService = employeeData[i][1];
                double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
                double newSalary = oldSalary + bonus;

                updatedSalaries[i][0] = newSalary;
                updatedSalaries[i][1] = bonus;
            }
            return updatedSalaries;
        }

        static void displayEmployeeData(double[][] employeeData, double[][] updatedSalaries) {
            double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

            System.out.printf("%-10s %-10s %-15s %-15s %-15s\n", "Emp ID", "Years", "Old Salary", "New Salary", "Bonus");


            for (int i = 0; i < employeeData.length; i++) {
                totalOldSalary += employeeData[i][0];
                totalNewSalary += updatedSalaries[i][0];
                totalBonus += updatedSalaries[i][1];

                System.out.printf("%-10d %-10.0f %-15.2f %-15.2f %-15.2f\n",
                        (i + 1), employeeData[i][1], employeeData[i][0], updatedSalaries[i][0], updatedSalaries[i][1]);
            }

            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-21s %-15.2f %-15.2f %-15.2f\n", "TOTAL:", totalOldSalary, totalNewSalary, totalBonus);
        }

        public static void main(String[] args) {
            int numberOfEmployees = 10;

            double[][] employeeData = generateEmployeeData(numberOfEmployees);
            double[][] updatedSalaries = calculateBonusAndNewSalary(employeeData);

            displayEmployeeData(employeeData, updatedSalaries);
        }
    }

