import java.util.Scanner;
public class EmployeeRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String employees[]= {"Lathika","Saranya","Jai","Madhu","Maha"};

        System.out.println("Enter the employee list");

        for(int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }

        System.out.println("Enter the employee name to search");
        String searchname = sc.nextLine();

        boolean found = false;
        for(int i=0; i<employees.length; i++){
            if(employees[i].equalsIgnoreCase(searchname)){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Employee found.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}