

class Student
{
    int rollNo;
    String name;
    String department;

    Student(int r, String n, String d)//Constructor to initialize the student object
    {
        rollNo = r;
        name = n;
        department = d;
    }

    void display()//Method to display student information
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String args[])
    {
        Student s1 = new Student(101, "Lathika", "CSE");//Creating a student object and initializing it using the constructor

        s1.display();
    }
}