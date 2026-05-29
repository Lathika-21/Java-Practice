//Employee Constructor Program//Constructor is a special method that is used to initialize objects. 
// The constructor is called when an object of a class is created. It can be used to set initial values for object attributes. 
// A constructor has the same name as the class and does not have a return type.

public class Employee {
    int id;
    String name;

    Employee(int i, String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String []args){
        Employee e1 = new Employee(101, "Lathika");
        e1.display();
        
    }
}
