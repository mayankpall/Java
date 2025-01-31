import java.util.Scanner;

public class FriendsHeightAndAge {
  
    
    static String findYoungest(int age1, int age2, int age3, String name1, String name2, String name3) {
        if (age1 <= age2 && age1 <= age3) return name1;
        if (age2 <= age1 && age2 <= age3) return name2;
        return name3;
    }

    static String findTallest(double height1, double height2, double height3, String name1, String name2, String name3) {
        if (height1 >= height2 && height1 >= height3) return name1;
        if (height2 >= height1 && height2 >= height3) return name2;
        return name3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Amar's height : ");
        double heightAmar = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Akbar's height : ");
        double heightAkbar = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Anthony's height : ");
        double heightAnthony = input.nextDouble();

        String youngest = findYoungest(ageAmar, ageAkbar, ageAnthony, "Amar", "Akbar", "Anthony");
        String tallest = findTallest(heightAmar, heightAkbar, heightAnthony, "Amar", "Akbar", "Anthony");

        
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        input.close();
    }


}
