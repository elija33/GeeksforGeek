import java.util.Scanner;

/**
 * BruteForceSearch
 */
public class BruteForceSearch {

    public static void main(String[] args) {
        int[] search = {2,4,5,6,4,8};
        for(int i = 0; i<search.length; i++){
            if(search[i] == 8){
                System.out.println("Found! Found at index " + i);
            }
        }
    }
}