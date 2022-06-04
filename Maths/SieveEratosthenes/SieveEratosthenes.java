package SieveEratosthenes;

import java.util.Scanner;

public class SieveEratosthenes {
    
    public static void main(String[] args) {
        Scanner eratos = new Scanner(System.in);
        int nubmer = eratos.nextInt();
        for(int i = 2; i<= nubmer; i++)
        if(isPrime(i))
        System.out.println(i);
    }
}
