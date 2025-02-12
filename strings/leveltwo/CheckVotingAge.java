package com.bridgelabz.strings.leveltwo;


public class CheckVotingAge {
    public static int[] getRandomAgeArray (int noOfStudents){
        int[] studentAge = new int[noOfStudents];

        for(int index = 0; index < noOfStudents; index++){
            studentAge[index] = (int)(Math.random()*90) + 10;
        }
        return studentAge;
    }
    public static String checkAge(int age ){
        if(age < 0) return "Negative value Cannot vote ";
        if(age < 18) return "Less than 18 can't vote";
        return "You can vote";
    }

    public static String[][] convertToTwoD(int[] students){
        String[][] ageWithStatus = new String[students.length][2];
        for(int index = 0; index < students.length; index++){
            ageWithStatus[index][0] = String.valueOf(students[index]);
            ageWithStatus[index][1] = checkAge(students[index]);
        }
        return ageWithStatus;
    }

    public static void displayArray(String[][] students){
        System.out.printf("%-10s %-15s %n","Age","Status");

        for (String[] student : students) {
            int age = Integer.parseInt(student[0]);
            String status = student[1];
            System.out.printf("%-10d %-15s %n", age, status);
        }


    }

    public  static void  main(String[] args){
        int noOfStudents = 10;

        int[] randomAge = getRandomAgeArray(noOfStudents);
        String[][] studentAndAge = convertToTwoD(randomAge);
        displayArray(studentAndAge);

    }
}
