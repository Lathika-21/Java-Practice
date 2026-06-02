import java.util.ArrayList;

public class StudentList
{
    public static void main(String args[])
    {
        ArrayList<String> students = new ArrayList<>();

        students.add("Nisha");
        students.add("Yoga");
        students.add("Saran");

        for(String s : students)
        {
            System.out.println(s);
        }
    }
}