import java.util.Scanner;

public class RunAthlete {
    static double getTotalRounds(double side1, double side2, double side3){
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;  
        double rounds = totalDistance / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first side of the triangular park in m: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the second side of the triangular park in m : ");
        double side2 = input.nextDouble();

        System.out.print("Enter the third side of the triangular park in m : ");
        double side3 = input.nextDouble();

        double rounds = getTotalRounds(side1,side2,side3);

        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

        input.close();
    }
  }


