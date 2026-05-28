import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main (String []args){
        try (Scanner var = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            int num1 = var.nextInt();
            System.out.println("Enter the second number");
            int num2 = var.nextInt();

            System.out.println("The sum of two numbers is: " + (num1 + num2));
        }
    }
}
