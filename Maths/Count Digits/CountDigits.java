import java.util.Scanner;

public class CountDigits{

    public static int countDi(int x){
       int number = 0;

       while(x > 0){
           x = x/10;
           number++;
       }
       return number;
    }

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int number = numbers.nextInt();
        System.out.println(countDi(number));
    }
}