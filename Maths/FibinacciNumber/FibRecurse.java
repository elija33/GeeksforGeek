import java.util.Scanner;

public class FibRecurse{
     public static void main(String[] args) {
         Scanner fib = new Scanner(System.in);
         int fiber = fib.nextInt();
         if(fiber <= 1){
             System.out.println(fiber);
         }
         else{
             int number = FibRecurse(fiber - 1) + FibRecurse(fiber - 2);
         }
         System.out.println(number);

     }
}