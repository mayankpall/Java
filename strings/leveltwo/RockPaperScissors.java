package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class RockPaperScissors {

    public static String getRandomChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int) (Math.random() * 3)];
    }

    public static String chooseWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "Tie";

        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] playGame(int rounds) {
        String[][] results = new String[rounds][3];
        int userWins = 0, computerWins = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter 'rock', 'paper', or 'scissors': ");
            String userChoice = input.next().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input, skipping round.");
                results[i][0] = "Invalid";
                results[i][1] = "Invalid";
                results[i][2] = "Invalid";
                continue;
            }

            String computerChoice = getRandomChoice();
            String winner = chooseWinner(userChoice, computerChoice);

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
        }

        input.close();
        displayResults(results, userWins, computerWins, rounds);
        return results;
    }

    public static void displayResults(String[][] results, int userWins, int computerWins, int totalGames) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-10s %-10s\n", "User", "Computer", "Winner");

        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s\n", result[0], result[1], result[2]);
        }

        double userWinRate = (userWins / (double) totalGames) * 100;
        double computerWinRate = (computerWins / (double) totalGames) * 100;

        System.out.println("\nFinal Stats:");
        System.out.printf("User Wins: %d (%.2f%%)\n", userWins, userWinRate);
        System.out.printf("Computer Wins: %d (%.2f%%)\n", computerWins, computerWinRate);
        System.out.printf("Ties: %d\n", totalGames - (userWins + computerWins));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rounds: ");
        int rounds = input.nextInt();

        playGame(rounds);
        input.close();
    }
}
