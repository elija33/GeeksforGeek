package RemoveDeplicatesSortedArray;

public class RemoveDuplicatesEfficient {
    public static int RemoveDeplicatesSortedArray(int number[], int size){
        int result = 1;
        for(int i = 1; i<size; i++){
            if(number[result - 1] != number[i])
            {
                number[result] = number[i];
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int number[] = {10,10,20,20,50,50,70,70,90}, size = 9;

        System.out.println("Befor Removing the element in the array");

        for(int i = 0; i<size; i++){
            System.out.println(number[i]+" ");
        }

        System.out.println();

        size = RemoveDeplicatesSortedArray(number, size);
         System.out.println("After Romoving the element in the array");

         for(int i = 0; i<size; i++){
            System.out.println(number[i]+" ");
         }
        
    } 
}
