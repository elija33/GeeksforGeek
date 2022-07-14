package MaximumDifference;

public class NaiveMaximumDifference {
    public static int maxDiff(int number[], int size){
        int reslt = number[1] - number[0];
        for(int i = 0; i<size; i++){
            for(int j = i + 1; j < size; j++){
                reslt = Math.max(reslt, number[j] - number[i]);
            }
        }
        return reslt;
    }
    public static void main(String[] args) {
        int number[] = {2,3,10,6,4,8,1};
        int size = 7;
        System.out.println(maxDiff(number, size));
    }
}
