import java.util.Scanner; // Import the Scanner Class
public class PalindromeNumber {

    public static void main(String[] args) {
        int rever = 0;
        int remain;
        Scanner num = new Scanner(System.in);
            int number = num.nextInt();
            int temp = number;
            while( temp != 0){
                remain = temp % 10;
                rever = rever * 10 + remain;
                temp = temp / 10;
            }
            if(rever == number){
                System.out.println("PalindromeNumber");
            }
            else{
                System.out.println("This not not a PalindromeNumber, try again pls");
            }
        }
}

