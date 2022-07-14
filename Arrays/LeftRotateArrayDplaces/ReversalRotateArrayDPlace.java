package LeftRotateArrayDplaces;

public class ReversalRotateArrayDPlace {

    public static void rotate(int number[], int size, int num){
        reverse(number, 0, size - 1);
        reverse(number, size, num - 1);
        reverse(number, 0, num - 1);
    }

    public static void reverse(int number[], int low, int high){
        while(low < high){
            int temp = number[low];
            number[low] = number[high];
            number[high] = temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6};
        int num = 5;
        int size = 2;
        System.out.println("Before Rotation");

        for(int i = 0; i < num; i++){
            System.out.println(number[i]+" ");
        }

        System.out.println();

        rotate(number, size, num);

        System.out.println("After Rotation");

        for(int i = 0; i< num; i++){
            System.out.println(number[i]+ " ");
        }
    }
}
