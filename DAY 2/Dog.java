///Inheritance Example//Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). 
// This promotes code reusability and establishes a natural hierarchical relationship between classes.

class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks");
    }
    public static void main(String []args){
        Dog d1 = new Dog();
        d1.sound();
        d1.bark();
    }
}
