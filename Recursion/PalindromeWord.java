import java.util.Scanner;

public class PalindromeWord {
    public static boolean isPalindrome(String str, int start, int end){
        if(start >= end)
            return true;
        return((str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end -1));
    }
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter the what you want");
        Boolean words = word.nextBoolean();
        System.out.println(isPalindrome(words, 0, words.length() -1));

        
    }
}
