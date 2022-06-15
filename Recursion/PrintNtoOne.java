import java.util.Scanner;

public class PrintNtoOne {
    public static void printNto1(int number){
        if(number == 0)
            return;
        System.out.println(number + "");
        printNto1(number - 1);
    }
    public static void main(String[] args) {
        int number = 4;
        printNto1(number);
    }
}
