import java.util.Scanner;

public class GradeGuidlines {

    static double calculateAverage(double physics, double chemistry, double math) {
        return (physics + chemistry + math) / 3;
    }

    static String determineGrade(double averageMarks) {
        if (averageMarks >= 80) return "A";
        if (averageMarks >= 70) return "B";
        if (averageMarks >= 60) return "C";
        if (averageMarks >= 50) return "D";
        if (averageMarks >= 40) return "E";
        return "R";
    }

    static String getRemarks(String grade) {
        switch (grade) {
            case "A": return "Level 4, above agency-normalized standards";
            case "B": return "Level 3, at agency-normalized standards";
            case "C": return "Level 2, below, but approaching agency-normalized standards";
            case "D": return "Level 1, well below agency-normalized standards";
            case "E": return "Level 1-, too below agency-normalized standards";
            default: return "Remedial standards";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double physics = input.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter marks in Math: ");
        double math = input.nextDouble();

        double averageMarks = calculateAverage(physics, chemistry, math);
        String grade = determineGrade(averageMarks);
        String remarks = getRemarks(grade);

      
        System.out.println("Average Marks: " + averageMarks + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
