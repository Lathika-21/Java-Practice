import java.util.Scanner;

public class EvenorOdd {
    public static void main(String []args){
        Scanner var = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int num = var.nextInt();
            if (num %2 == 0){
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } finally {
            var.close();
        }
    }
}
