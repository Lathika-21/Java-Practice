//Encapsulation Example//Encapsulation is one of the four fundamental OOP concepts. 
// It is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 
// In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. 
// Therefore, it is also known as data hiding.

public class EncapsulationDemo {
    class student{
        private int id;
        private String name;
        
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
    }
    public static void main(String []args){
        EncapsulationDemo ed = new EncapsulationDemo();
        student s1 = ed.new student();
        s1.setId(101);
        s1.setName("Lathika");
        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
    }
}
