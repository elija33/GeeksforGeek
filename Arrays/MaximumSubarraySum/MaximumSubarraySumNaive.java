package MaximumSubarraySum;

public class MaximumSubarraySumNaive {
    public static int maxSumm(int num[], int size){
        int result = num[0];

        for(int i = 0; i < size; i++){
            int total = 0;

            for(int j = i; j < size; j++) {
                total = total + num[j];
                result = Math.max(result, total);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int num[] = {1,-2,3,-1,2};
        int size = 5;

        System.out.println(maxSumm(num, size));
    }
}

