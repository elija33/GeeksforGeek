package LongestEvenOddSubarray;


public class LongestEvenOddNaive {
    public static int maxEvenOdd(int number[], int size){
        int result = 1;
        for(int i = 0; i < size; i++){
            int total = 1;
            for(int j = i + 1; j < size; j++){
                if((number[j] % 2 == 0 && number[j -1] % 2 != 0)
                    ||(number[j] % 2 != 0 && number[j - 1] % 2 == 0))
                    total++;
                else
                    break;
            }

            result = Math.max(result, total);
        }

        return result;
    }
    public static void main(String[] args) {
        int number[] = {5,10,20,6,3,8};
        int size = 6;
        System.out.println(maxEvenOdd(number, size));
    }
}
