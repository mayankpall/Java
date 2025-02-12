package com.bridgelabz.strings.levelthree;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCard {


        static String[] initializeDeck() {
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            int numOfCards = suits.length * ranks.length;
            String[] deck = new String[numOfCards];

            int index = 0;
            for (String suit : suits) {
                for (String rank : ranks) {
                    deck[index++] = rank + " of " + suit;
                }
            }

            return deck;
        }

        static void shuffleDeck(String[] deck) {
            Random random = new Random();
            int n = deck.length;

            for (int i = 0; i < n; i++) {
                int randomCardNumber = i + random.nextInt(n - i);//n - i calculates the remaining number of cards to be shuffled.
                String temp = deck[i];
                deck[i] = deck[randomCardNumber];
                deck[randomCardNumber] = temp;
            }
        }

        static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
            if (numOfCards % numOfPlayers != 0) {
                System.out.println("Cannot distribute cards evenly among players.");
                return null;
            }

            int cardsPerPlayer = numOfCards / numOfPlayers;
            String[][] players = new String[numOfPlayers][cardsPerPlayer];

            int index = 0;
            for (int i = 0; i < numOfPlayers; i++) {
                for (int j = 0; j < cardsPerPlayer; j++) {
                    players[i][j] = deck[index++];
                }
            }

            return players;
        }

        static void printPlayersCards(String[][] players) {
            if (players == null) return;

            for (int i = 0; i < players.length; i++) {
                System.out.println("Player " + (i + 1) + "'s cards:");
                for (String card : players[i]) {
                    System.out.println("  " + card);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] deck = initializeDeck();
            shuffleDeck(deck);

            System.out.print("Enter number of cards to distribute: ");
            int numOfCards = scanner.nextInt();

            System.out.print("Enter number of players: ");
            int numOfPlayers = scanner.nextInt();

            String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
            printPlayersCards(players);

            scanner.close();
        }
    }

