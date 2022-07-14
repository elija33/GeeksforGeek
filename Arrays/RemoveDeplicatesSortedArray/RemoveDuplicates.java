package RemoveDeplicatesSortedArray;

public class RemoveDuplicates {
    //Take array, and size for the array as argrment 
    public static int remover(int number[], int sizes){

        // Creter temporary array 
        int temp[] = new int[sizes];

        //copy the first element to the temporany array because the first element will always be party of the array.
        temp[0] = number[0];

        //decide the size of result as 1, because we copy one element to be temporary.
        int res = 1;

        //loop throught the array starting for the second element, we copy the firt element to the temporary array.
        //check every element, if the element is same as the last copied element to te temporary.
        //if it is the same as the last copied element, 
        //increment the result and copy the element to the next location and the temporary array
        for(int i = 1; i<sizes; i++){
            if(temp[res-1] != number[i]){
                temp[res] = number[i];
                res++;
            }
        }
        for(int i = 0; i< res; i++){
            number[i] = temp[i];
        }   
        return res;
    }
    //Mover all the distinct element to eh beginning of the array
    //Return the size for the modified array "the number of distinct element in the array"
    // Gos throught the array
    
    public static void main(String[] args) {
        int number[] = {10,10,20,30,30,40,50,50,60};
        int sizes = 9;
        System.out.println("Beofore Removing element in the array");

        for(int i = 0; i<sizes; i++){
            System.out.println(number[i] + " ");
        }
        System.out.println();

        sizes = remover(number, sizes);

        System.out.println("After removing duplication the element in the array");

        for(int i = 0; i< sizes; i++){
            System.out.println(number[i]);
        }
    }
}
