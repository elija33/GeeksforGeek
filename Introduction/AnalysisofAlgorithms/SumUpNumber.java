package AnalysisofAlgorithms;

import java.util.Scanner;

public class SumUpNumber {
   
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        System.out.println(num*(num+1)/2); 
    }
}
