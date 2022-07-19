package SortedArray;
public class SortedNaiveSolution {
    public static boolean isSorted(int number[], int numbers){
        for(int i = 0; i<numbers; i++){
            for(int j = i+1; j<numbers; j++){
                if(number[j] < number[i])
                    return false;
            }
        }
          
        return true;
    }
    public static void main(String[] args) {
        int number[] = { 7, 2, 30, 10 }, numbers = 4;
        System.out.println(isSorted(number, numbers));
    }
}
