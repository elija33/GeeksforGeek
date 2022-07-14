public class EfficientFindLargetIndexElement {
    public static int largElementIndex(int number[]){
        int sum = 0;
        for(int i = 1; i<number.length; i++)
            if(number[i] > number[sum])
                sum = i;
        return sum;
    }
    public static void main(String[] args) {
        int[] number = {5,3,30,10};
        System.out.println(largElementIndex(number));
    }
}
