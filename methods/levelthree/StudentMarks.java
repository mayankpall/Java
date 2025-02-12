package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class StudentMarks {

        public static int[][] generateRandomScores(int numStudents) {
            int[][] scores = new int[numStudents][3];
            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < 3; j++) {
                    scores[i][j] = (int) (Math.random() * 50) + 50;
                }
            }
            return scores;
        }

        public static double[][] calculateTotalAveragePercentage(int[][] scores) {
            int numStudents = scores.length;
            double[][] results = new double[numStudents][3];

            for (int i = 0; i < numStudents; i++) {
                int total = scores[i][0] + scores[i][1] + scores[i][2];
                double average = total / 3.0;
                double percentage = (total / 300.0) * 100;

                results[i][0] = total;
                results[i][1] = Math.round(average * 100.0) / 100.0;
                results[i][2] = Math.round(percentage * 100.0) / 100.0;
            }
            return results;
        }

        public static String determineGrade(double percentage) {
            if (percentage >= 80) return "A";
            else if (percentage >= 70) return "B";
            else if (percentage >= 60) return "C";
            else if (percentage >= 50) return "D";
            else if (percentage >= 40) return "E";
            else return "R";
        }

        public static void displayScorecard(int[][] scores, double[][] results) {
            System.out.println("\nStudent Scorecard:");
            System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
            for (int i = 0; i < scores.length; i++) {
                System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\t\t%s\n",
                        i + 1, scores[i][0], scores[i][1], scores[i][2],
                        (int) results[i][0], results[i][1], results[i][2], determineGrade(results[i][2]));
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int numStudents = input.nextInt();

            int[][] scores = generateRandomScores(numStudents);
            double[][] results = calculateTotalAveragePercentage(scores);

            displayScorecard(scores, results);

            input.close();
        }
    }

