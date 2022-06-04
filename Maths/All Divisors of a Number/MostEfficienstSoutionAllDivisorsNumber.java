import java.util.Scanner;

public class MostEfficienstSoutionAllDivisorsNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int i;
        for(i = 1; i*i < num; i++)         // Print all division from 1 inclusive to squareroot of n(exclusive)
            if(num % i == 0)
                System.out.println(i);
        for( ; i>=1; i--)               // Print all division from squar root n (exclusive)
            if(num % i == 0)
                System.out.println(num/i);
    }
    
}
