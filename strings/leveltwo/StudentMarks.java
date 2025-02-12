package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class StudentMarks {

        public static int[][] generateRandomScores(int numStudents) {
            int[][] scores = new int[numStudents][3];

            for (int i = 0; i < numStudents; i++) {
                scores[i][0] = (int) (Math.random() * 101);
                scores[i][1] = (int) (Math.random() * 101);
                scores[i][2] = (int) (Math.random() * 101);
            }
            return scores;
        }

        public static double[][] calculateTotalAndPercentage(int[][] scores) {
            int numStudents = scores.length;
            double[][] results = new double[numStudents][3];

            for (int i = 0; i < numStudents; i++) {
                int total = scores[i][0] + scores[i][1] + scores[i][2];
                double average = total / 3.0;
                double percentage = Math.round((total / 300.0) * 100 * 100.0) / 100.0;

                results[i][0] = total;
                results[i][1] = Math.round(average * 100.0) / 100.0;
                results[i][2] = percentage;
            }
            return results;
        }

        public static String[] assignGrades(double[][] results) {
            int numStudents = results.length;
            String[] grades = new String[numStudents];

            for (int i = 0; i < numStudents; i++) {
                double percentage = results[i][2];

                if (percentage >= 80) grades[i] = "A";
                else if (percentage >= 70) grades[i] = "B";
                else if (percentage >= 60) grades[i] = "C";
                else if (percentage >= 50) grades[i] = "D";
                else if (percentage >= 40) grades[i] = "E";
                else grades[i] = "R";
            }
            return grades;
        }

        public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                    "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");

            for (int i = 0; i < scores.length; i++) {
                System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f %-10s\n",
                        (i + 1), scores[i][0], scores[i][1], scores[i][2],
                        results[i][0], results[i][1], results[i][2], grades[i]);
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = input.nextInt();

            int[][] scores = generateRandomScores(numStudents);
            double[][] results = calculateTotalAndPercentage(scores);
            String[] grades = assignGrades(results);

            displayScorecard(scores, results, grades);

            input.close();
        }
    }
