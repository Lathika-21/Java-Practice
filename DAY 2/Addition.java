//Method Overloading Example//Method overloading is a feature in Java that allows a class to have more than one method with the same name, as long as their parameter lists are different. 
// This is also known as compile-time polymorphism. The correct method to call is determined at compile time based on the number and type of arguments passed to the method.
class Addition {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String []args){
        Addition ad = new Addition();
        System.out.println(ad.add(10, 20)); // Calls the first add method
        System.out.println(ad.add(10, 20, 30)); // Calls the second add method
    }
}
