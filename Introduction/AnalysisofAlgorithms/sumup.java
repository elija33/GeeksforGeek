import java.util.Scanner;
/*Given a n number, find the sum of first n natural 
Example: if n is 3 the then the result is 6

Input: n = 3
Output: 6   // which means 1 + 2 + 3

Input: n = 4
Output: 10 // which means 1 + 2 + 3 + 4 
*/

/**
 * sumup
 */
public class sumup {
    static int number;

    public static void numbers(int number) {
        System.out.println (number*(number + 1) / 2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        numbers(number);
    }

    int fun(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++)
        sum = sum + i;
        return sum;
    }
}