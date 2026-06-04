import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    updateStudent(sc);
                    break;

                case 5:
                    deleteStudent(sc);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    // 1. ADD STUDENT
    static void addStudent(Scanner sc) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            String sql = "INSERT INTO students VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Department: ");
            String dept = sc.next();

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dept);

            ps.executeUpdate();

            System.out.println("Student Added Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. VIEW STUDENTS
    static void viewStudents() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. SEARCH STUDENT
    static void searchStudent(Scanner sc) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            String sql = "SELECT * FROM students WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4. UPDATE STUDENT
    static void updateStudent(Scanner sc) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            String sql = "UPDATE students SET department=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Department: ");
            String dept = sc.next();

            ps.setString(1, dept);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student Updated!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 5. DELETE STUDENT
    static void deleteStudent(Scanner sc) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            String sql = "DELETE FROM students WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Student Deleted!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}