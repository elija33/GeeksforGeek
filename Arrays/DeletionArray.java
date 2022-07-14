public class DeletionArray {
    public static int deleteElement(int number[], int size, int delete){
        int i = 0;
        for(i=0; i<size; i++){
            if(number[i] == delete)
                break;
        }

        if(i == size)
            return size;
        
        for(int j = i; j<size-1; j++){
            number[j] = number[j + 1];
        }

        return size - 1;
    }
    public static void main(String[] args) {
        int number[] = {3,5,4,6,8,12,90};
        int delete = 90, size = 7;

        System.out.println("Before We Delet");

        for(int i = 0; i<size; i++){
            System.out.println(number[i]+ "");
        }

        System.out.println();

        size = deleteElement(number, size, delete);
        System.out.println("After Deletion");

        for(int i = 0; i < size; i++){
            System.out.println(number[i] + " ");
        }

    }
}
