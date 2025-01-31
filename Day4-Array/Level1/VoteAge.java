import java.util.Scanner;

class VoteAge{
  public static void main(String[] args){
    int[] students = new int[10];
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < students.length; i++){
      
      System.out.print("Enter student "+ (i+1) +" age : ");
      students[i] = input.nextInt();
      
    }

    for(int i = 0; i < students.length; i++){
        if(students[i] >= 18){
          System.out.println("The student with the age "+ students[i] +" can vote.");
        }
        else if (students[i] < 0){
          System.out.println("An invalid age.");
          
        }
        else{
          System.out.println("The student with the age "+ students[i] +" cannot vote.");
        }
    }

    input.close();
  }
}