import java.util.Scanner;

public class AllDivisorsNumber {
       public static void main(String[] args) {
           Scanner numb  = new Scanner(System.in);
           int divis = numb.nextInt();
           System.out.println("Enter the number, you want to find his divisors: ");
           int numbers = divis; 
           for(int i = 1; i<=numbers; i++){
               if(numbers % i == 0)
                System.out.println(i);
           }
    }
}
