package LeftRotateArrayDplaces;

public class EfficienRotateArrayDPlace {
    public static void lRotate(int number[], int num, int size){
        int temp[] = new int[num];
        for(int i = 0; i < num; i++){
            temp[i] = number[i];
        }
        for(int i = num; i < size; i++){
            number[i - num] = number[i];
        }
        for(int i = 0; i < num; i++){
            number[size - num + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,3,5,6};
        int num = 3, size = 7;
        System.out.println("Before Rotaion");

        for(int i = 0; i < size; i++){
            System.out.println(number[i]+ " ");
        }

        System.out.println();

        lRotate(number, num, size);

        System.out.println("After Rotation");
        for(int i = 0; i<size; i++){
            System.out.println(number[i]+"");
        }

    }
    
}
