import java.util.Scanner;

public class CheckNumber {
    static int checkNumber(int number){
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } 
        return 0;


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int check = checkNumber(number);

        System.out.println(check);

        input.close();
    }
}
