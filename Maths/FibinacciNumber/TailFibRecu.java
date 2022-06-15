import java.util.Scanner;

public class TailFibRecu {
    public static int fact(int number, int numbers){
        if(number == 0 || number == 1)
            return numbers;
        return fact(number-1, numbers*number);
    }
    public static void main(String[] args) {
        System.out.println(fact(3, 1));
    }
}
