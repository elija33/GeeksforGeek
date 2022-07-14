import java.util.Scanner;

public class RopeCutting {
    public static int maxCuts(int number, int numberA, int numberB, int numberC){
        if(number == 0)
            return 0;
        if(number <= -1)
            return -1;

        int total = Math.max(maxCuts(number-numberA, numberA, numberB, numberC), 
                    Math.max(maxCuts(number-numberB, numberA, numberB, numberC), 
                    maxCuts(number-numberC, numberA, numberB, numberC)));
        if(total == -1)
            return -1;
        return total + 1;
    }
    public static void main(String[] args) {
        int number = 5, numberA = 2, numberB = 1, numberC=5;
        System.out.println(maxCuts(number, numberA, numberB, numberC));
    }
}
