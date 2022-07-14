package MoveZerosToEnd;

public class MoveZerosToEnd {
    // Tranve from left to right, when you find zero element at the left, we swap it to the right of non zeros element.
    public static int movezores(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == 0){
                for(int j = i+1; j<numbers.length; j++){
                    if(numbers[j] != 0){
                        swap(numbers[i], numbers[j]);
                    }
                }
            }
        }
        // loop the goes throught the hold array from index zeros to the end of the array.
            //- if we do not find any zeros we keep looping throught array and print out the array.
            // - if we find zero we swap it with non zeros element at the right.

    }
    public static void main(String[] args) {
        
    }
    
}
