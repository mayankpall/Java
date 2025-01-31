import java.util.Scanner;

public class CalculateGradesTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100)");

            marks[i][0] = getValidMarks(input, "Physics");
            marks[i][1] = getValidMarks(input, "Chemistry");
            marks[i][2] = getValidMarks(input, "Math");

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = determineGrade(percentages[i]);
        }

       
    
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Percentage", "Grade");
      

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-10s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        input.close();
    }

    static int getValidMarks(Scanner input, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + " marks: ");
            marks = input.nextInt();
            if (marks >= 0 && marks <= 100) break;
            System.out.println("Invalid marks! Enter a value between 0 and 100.");
        }
        return marks;
    }

    static String determineGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }
}
