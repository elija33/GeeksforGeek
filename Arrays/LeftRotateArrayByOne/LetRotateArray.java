package LeftRotateArrayByOne;

public class LetRotateArray {
    public static void rota(int num[], int size) {
        int hold = num[0];
        for(int i = 1; i<size; i++){
            num[i -1] = num[i];
        }
        num[size - 1] = hold;
    }
    public static void main(String[] args) {
        int num[] = {2,3,4,5,6,7}; 
        int size = 6;
        System.out.println("Before Rotation");

        for(int i = 0; i < size; i++){
            System.out.println(num[i]+" ");
        }
        System.out.println();
        rota(num, size);
        System.out.println("After Rotation");

        for(int i = 0; i < size; i++){
            System.out.println(num[i] + " ");
        }
    }
    
}
