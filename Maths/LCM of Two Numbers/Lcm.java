import java.util.Scanner;

// Finding the Lcm.
// To find the lcm, we use a*b = g(a,b) * lcm(a,b) or a*b  = gcd*lcm.
// Let a = 50 and b = 60.
// 50 * 60 = 10*lcm.   which 10 is the gcd of 50 and 60.
// lcm = 50*60/10
//lcm = 300

public class Lcm {
    public static void main(String[] args) {
        Scanner lcm = new Scanner(System.in);
        int lcm1 = lcm.nextInt();
        int lcm2 = lcm.nextInt();
        System.out.println("Enter the two numbers:");
        int lcm3=0;
        for(int i = 1; i<=lcm1; i++){
            if(lcm2%i == 0 && lcm1%i == 0)
                lcm3=i;
        }

        int lcm4 = lcm1*lcm2/lcm3;
        System.out.println("The Lcm is:" + lcm4);
    }
    
}
