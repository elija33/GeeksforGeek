package IterativePower;

import java.util.Scanner;

public class IterativePower {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();
        int number2 = number.nextInt();
        int total = 1;
        while(number2 > 0){
            if(number2 % 2 != 0)
                total = total*number1;
            number1 = number1 * number1;
            number2 = number2/2;
        }
        System.out.println(total);
    }
}
