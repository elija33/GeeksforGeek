package LeftRotateArrayDplaces;

public class Naiverotatearraydplace{
    public static void rotatenavier(int number[], int size){
        int temp = number[0];
        for(int i = 1; i < size; i++){
            number[i -1] = number[i];
        }
        number[size - 1] = temp;
    }

    public static void leftRotate(int number[], int num, int size){
        for(int i = 0; i < num; i++){
            rotatenavier(number, size);
        }
    } 
    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 }, size = 5, num = 2;

        System.out.println("Before Rotation");

        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println();

        leftRotate(number, num, size);

        System.out.println("After Rotation");

        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
    }
}


