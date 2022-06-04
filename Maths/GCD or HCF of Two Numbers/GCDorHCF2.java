import java.util.Scanner;

public class GCDorHCF2 {

    public static void main(String[] args) {
        Scanner cans = new Scanner(System.in);
        System.out.println("Enter the two Numbers: ");
        int a = cans.nextInt();
        int b = cans.nextInt();

        if(b == 0)
            System.out.println(a);
        System.out.println(b, a % b);
    }
}
