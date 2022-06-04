package ComputingPower;

import java.util.Scanner;

public class ComputingPower {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int numb1 = number.nextInt();
        int numb2 = number.nextInt();
        int sun = 1;
        for(int i = 0; i<numb2; i++)
            sun = sun * numb1;
            System.out.println(sun);
    }
}
