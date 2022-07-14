import java.util.Scanner;

public class TailFibRecu {
    public static int fact(int number, int numbers){
        if(number == 0 || number == 1)
            return numbers;
        return fact(number-1, numbers*number);
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int numbers = num.nextInt();
        System.out.println(fact(number, numbers));
    }
}
