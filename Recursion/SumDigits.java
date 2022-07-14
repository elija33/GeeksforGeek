import java.util.Scanner;

public class SumDigits {
    public static int SumDigit(int number){
        if(number < 10)
            return number;
        return SumDigit(number / 10) + number % 10;
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        System.out.println(SumDigit(number));
    }
}
