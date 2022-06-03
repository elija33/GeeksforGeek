import java.util.Scanner;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        int fact = 0;
        Scanner num = new Scanner(System.in);
        int fat = num.nextInt();
        for(int i = 5; i<=fat; i=i*5){
            fact = fact + (fat / i);
        }

        System.out.println("The factorial Trailing Zeros is : " + fact);

    }
    
}
