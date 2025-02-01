import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false; 
        return age >= 18;  
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];

        System.out.println("Enter the age of 10 students:");

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

        }

        System.out.println("\nStudent Voting Eligibility:");
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + (canVote ? " Can Vote " : " Cannot Vote "));
        }

        input.close();
    }
}
