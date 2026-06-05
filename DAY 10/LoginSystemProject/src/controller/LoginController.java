

package controller;

import java.util.Scanner;
import service.UserService;

public class LoginController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();

        while (true) {

            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Username: ");
                String u = sc.next();

                System.out.print("Password: ");
                String p = sc.next();

                service.register(u, p);
                System.out.println("Registered Successfully!");

            } else if (choice == 2) {

                System.out.print("Username: ");
                String u = sc.next();

                System.out.print("Password: ");
                String p = sc.next();

                boolean result = service.login(u, p);

                if (result)
                    System.out.println("Login Success!");
                else
                    System.out.println("Invalid Credentials!");

            } else {
                break;
            }
        }
    }
}