import java.util.HashMap;

public class EmployeeMap
{
    public static void main(String args[])
    {
        HashMap<Integer,String> employees = new HashMap<>();

        employees.put(1,"Aadhi");
        employees.put(2,"Omen");
        employees.put(3,"Adhiran");

        System.out.println(employees);
    }
}