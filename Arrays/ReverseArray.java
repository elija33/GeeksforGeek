public class ReverseArray {
    public static void reverse(int number[], int numbers){
        int lowNumber = 0;
        int highNumber = numbers - 1;
        while(lowNumber < highNumber){
            int tempNumber = number[lowNumber];
            number[lowNumber] = number[highNumber];
            number[highNumber] = tempNumber;
            lowNumber++;
            highNumber--;
        }
    }
    public static void main(String[] args) {
        int number[] = {23, 43,56,6,78,21};
        int numbers = 6;
        System.out.println("Before Reverse");
        for(int i = 0; i<numbers; i++){
            System.out.println(number[i]+ " ");
        }
        System.out.println();
        reverse(number, numbers);

        System.out.println("After Reverse");
        for(int i = 0; i<numbers; i++){
            System.out.println(number[i]+ " ");
        }
    }
}
