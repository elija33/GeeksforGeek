package MaximumDifference;

public class EfficientMaximumDifference {
    public static int maxDiff(int number[], int size){
        int reslt = number[1] - number[0], minVal = number[0];

        for(int i = 1; i < size; i++){
            reslt = Math.max(reslt, number[i] - minVal);
            minVal = Math.min(minVal, number[i]);
        }

        return reslt;
    }
    public static void main(String[] args) {
        int number[] = {2,3,10,6,4,8,1};
        int size = 7;
        System.out.println(maxDiff(number, size));
    }
    
}
