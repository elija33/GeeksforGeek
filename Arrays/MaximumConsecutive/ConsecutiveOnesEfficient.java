package MaximumConsecutive;

public class ConsecutiveOnesEfficient {
    public static int maxConsecutiveOne(int number[], int size){
        int result = 0;
        int total = 0;

        for(int i = 0; i < size; i++){
            if(number[i] == 0)
                total = 0;
            else{
                    total++;
                    result = Math.max(result, total);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int number[] = {0,1,1,0,1,1,1,0,1,1,1,1,1,1};
        int size = 14;
        System.out.println(maxConsecutiveOne(number, size));
    }
}
