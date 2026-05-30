public class CountVowels {
    public static void main(String[] args) {
        String str = "Lathika";
        int count = 0;

        String lowerStr = str.toLowerCase(); // Convert the string to lowercase for easier comparison   
        for(int i=0; i<lowerStr.length(); i++){
            char ch = lowerStr.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels = " + count);
    }
}
