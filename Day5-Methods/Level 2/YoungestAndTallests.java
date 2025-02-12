import java.util.Scanner;


public class YoungestAndTallests {
  
      public static String findYoungest(String[] names, int[] ages) {
          int minAgeIndex = 0;
          for (int i = 1; i < ages.length; i++) {
              if (ages[i] < ages[minAgeIndex]) {
                  minAgeIndex = i;
              }
          }
          return names[minAgeIndex];
      }
  
      public static String findTallest(String[] names, double[] heights) {
          int maxHeightIndex = 0;
          for (int i = 1; i < heights.length; i++) {
              if (heights[i] > heights[maxHeightIndex]) {
                  maxHeightIndex = i;
              }
          }
          return names[maxHeightIndex];
      }
  
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
  
          String[] names = {"Amar", "Akbar", "Anthony"};
          int[] ages = new int[3];
          double[] heights = new double[3];
  
          System.out.println("Enter age and height for Amar, Akbar, and Anthony:");
  
          for (int i = 0; i < 3; i++) {
              System.out.print("Enter age of " + names[i] + ": ");
              ages[i] = input.nextInt();
  
              System.out.print("Enter height of " + names[i] + " in cm: ");
              heights[i] = input.nextDouble();
          }
  
          String youngestFriend = findYoungest(names, ages);
          String tallestFriend = findTallest(names, heights);
  
          
          System.out.println("The youngest friend is: " + youngestFriend);
          System.out.println("The tallest friend is: " + tallestFriend);
  
          input.close();
      }
  }
  
