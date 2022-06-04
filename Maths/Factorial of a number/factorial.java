import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner number = new Scanner(System.in);
        int fat = number.nextInt();
        for(int i = fat; i >= 1; i--){
            fact = fact*i;
        }
        System.out.println(fat + " " + "fatorial is:" + " " + fact);
        
    }
    
}
