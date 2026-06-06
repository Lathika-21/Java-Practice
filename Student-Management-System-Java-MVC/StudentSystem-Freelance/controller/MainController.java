package controller;

import java.util.Scanner;
import model.Student;
import service.StudentService;

public class MainController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== STUDENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
              
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Dept: ");
                    String dept = sc.next();

                    System.out.print("Marks: ");
                    int marks = sc.nextInt();

                    Student s = new Student(id, name, dept, marks);
                    service.add(s);

                    System.out.println("Student Added!");
                    break;

                case 2:
                    service.showAll();
                    break;

                case 3:
                    return;
            }
        }
    }
}