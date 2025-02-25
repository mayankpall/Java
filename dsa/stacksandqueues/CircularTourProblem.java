package com.bridgelabz.dsa.stacksandqueues;

public class CircularTourProblem {
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;

        int start = 0;
        int currentPetrol = 0;
        int totalDeficit = 0;

        for (int i = 0; i < n; i++) {
            currentPetrol += pumps[i].petrol - pumps[i].distance;

            if (currentPetrol < 0) {
                totalDeficit += currentPetrol;
                start = i + 1;
                currentPetrol = 0;
            }
        }

        return currentPetrol + totalDeficit >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int startPoint = findStartingPoint(pumps);

        if (startPoint != -1) {
            System.out.println("Starting point to complete circular tour: " + startPoint);
        } else {
            System.out.println("No solution exists");
        }

        // Verify the solution
        if (startPoint != -1) {
            int currentPetrol = 0;
            boolean possible = true;

            for (int i = 0; i < pumps.length; i++) {
                int current = (startPoint + i) % pumps.length;
                currentPetrol += pumps[current].petrol - pumps[current].distance;

                if (currentPetrol < 0) {
                    possible = false;
                    break;
                }
            }

            System.out.println("Solution verification: " +
                    (possible ? "Valid circular tour" : "Invalid solution"));
        }
    }
}