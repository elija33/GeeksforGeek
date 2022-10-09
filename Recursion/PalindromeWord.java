import java.util.Scanner;

public class PalindromeWord {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return ((str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1));
    }

    public static void main(String[] args) {
        String word = "GeeksforGeeks";
        System.out.println(isPalindrome(word, 0, word.length() - 1));

    }
}
