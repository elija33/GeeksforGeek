package MaximumSubarraySum;

public class MaximumSubarraySumEfficient {
    public static int maxSumm(int number[], int size){
        int total = number[0];
        int maxEnding = number[0];

        for(int i = 1; i < size; i++){
            maxEnding = Math.max(maxEnding + number[i], number[i]);

            total = Math.max(maxEnding, total);
        }

        return total;
    }
    public static void main(String[] args) {
        int number[] = {2, -3, 4, -5, 1, 6};
        int size = 6;
        System.out.println(maxSumm(number, size));
    }
}
