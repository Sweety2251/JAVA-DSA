package string;

public class Palindrome {
    public static boolean isPalidrome(String str,int n) {
         for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        int n = str.length();

       System.out.println(isPalidrome(str, n));
    }
}
