import java.sql.*;
import java.util.Scanner;

public class LoginSystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== LOGIN SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    register();
                    break;

                case 2:
                    login();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    // REGISTER USER
    static void register() {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/userdb",
                    "root",
                    "Lathika@2004");

            String sql = "INSERT INTO users(username, password) VALUES(?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter username: ");
            String username = sc.next();

            System.out.print("Enter password: ");
            String password = sc.next();

            ps.setString(1, username);
            ps.setString(2, password);

            ps.executeUpdate();

            System.out.println("Registration Successful!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // LOGIN USER
    static void login() {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/userdb",
                    "root",
                    "Lathika@2004");

            String sql = "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter username: ");
            String username = sc.next();

            System.out.print("Enter password: ");
            String password = sc.next();

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful! Welcome " + username);
            } else {
                System.out.println("Invalid Username or Password!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}