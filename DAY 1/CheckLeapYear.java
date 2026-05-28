

public class CheckLeapYear {
    public static void main(String []args){
        int year=2020;
        
        if(year%4==0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
