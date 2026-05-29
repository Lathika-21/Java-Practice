//Abstract Class Example//An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. 
// It can contain abstract methods (methods without a body) that must be implemented by subclasses, as well as concrete methods (methods with a body) that can be inherited by subclasses.

abstract class Vehicle{
    abstract void start();
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts with kick");
    }
    public static void main(String []args){
        Bike b = new Bike();
        b.start();
    }
}
