import java.util.Scanner;

public class GCDorHCF {
    
    public static void main(String[] args) {
        Scanner hcf = new Scanner(System.in);
        System.out.println("Enter your two numbers");
        int hcfs1 = hcf.nextInt();
        int hcfs2 = hcf.nextInt();

        int num = 0;
        for(int i = 1; i<= hcfs1; i++){
            if(hcfs1%i == 0 && hcfs2%i == 0)
            num = i;
        }
        System.out.println(num);
    }
}
