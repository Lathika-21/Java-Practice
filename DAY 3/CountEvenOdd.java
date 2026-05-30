

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;

        for(int n : num){
            if(n % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even digits = " + evenCount);
        System.out.println("Number of odd digits = " + oddCount);
    }
}
