import java.util.Scanner;

public class NaturalNumber {
    public static int getSum(int number){
        if(number == 0)
            return 0;
        return number + getSum(number -1);
    }
    public static void main(String[] args) {
       Scanner number = new Scanner(System.in);
       int nub = number.nextInt();
       System.out.println(getSum(nub)); 

    }
    
}