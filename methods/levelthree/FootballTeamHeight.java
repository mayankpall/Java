package com.bridgelabz.methods.levelthree;

public class FootballTeamHeight {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            // Generates height between 150 to 250 cm
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11;
        int[] heights = generateHeights(teamSize);

        System.out.println("Player Heights in cm: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\nMean Height: " + findMean(heights) + " cm");
        System.out.println("Shortest Player Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Player Height: " + findTallest(heights) + " cm");
    }
}
