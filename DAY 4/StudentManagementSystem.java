import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem
{
    public static void main(String args[])
    {
        ArrayList<String> students = new ArrayList<>();

        students.add("Nisha");
        students.add("Yoga");
        students.add("Saran");

        for(String student : students)
        {
            System.out.println(student);
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the student name to search");
        String searchname = s.nextLine();

        boolean found = false;
        for(String student : students)
        {
            if(student.equalsIgnoreCase(searchname))
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("Student found.");
        }
        else
        {
            System.out.println("Student not found.");
        }

        s.close();
    }
}