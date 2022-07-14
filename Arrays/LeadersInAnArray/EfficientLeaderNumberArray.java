package LeadersInAnArray;

public class EfficientLeaderNumberArray {
    public static void leaders(int numbers[], int sizes){
        int total = numbers[sizes -1];
        System.out.println(total + " ");
        for(int i = sizes - 2; i >= 0; i--){
            if(total < numbers[i]){
                total = numbers[i];
                System.out.println(total + " ");
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {7, 10, 4, 10, 6, 5, 2};
        int sizes = 7;

        leaders(numbers, sizes);
        
    }
}
