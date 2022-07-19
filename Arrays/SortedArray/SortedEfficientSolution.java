package SortedArray;
public class SortedEfficientSolution {
    public static boolean isSorted(int number[], int numbers){
        for(int i = 1; i<numbers; i++){
            if(number[i] < number[i - 1])
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int number[] = {5, 3, 7, 8, 10, 15}; 
        int numbers = 3;
        System.out.println(isSorted(number, numbers));
    }
}
