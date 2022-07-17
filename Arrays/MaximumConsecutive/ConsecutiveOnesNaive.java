package MaximumConsecutive;

public class ConsecutiveOnesNaive {
    public static int maxConsecutiveOne(int number[], int size){
        int result = 0;
        for(int i = 0; i < size; i++){
            int total = 0;

            for(int j = i; j < size; j++){
                if(number[j] == 1) total++;
                else break;
            }

            result = Math.max(result, total);
        }
        return result;
    }
    public static void main(String[] args) {
        int number[] = {0,1,1,0,1,1,1,0,1,1,1,1,1};
        int size = 13;
        System.out.println(maxConsecutiveOne(number, size));
    }
}
