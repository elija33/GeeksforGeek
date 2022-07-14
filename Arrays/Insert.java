public class Insert {
    public static int insert(int arrnumber[], int size, int number, int postion, int cap){
        if(size == cap)
            return size;
        int local = postion - 1;

        for(int i = size-1; i>=local; i--){
            arrnumber[i + 1] = arrnumber[i];
        }

        arrnumber[local] = number;
        return size + 1;
    }
    public static void main(String[] args) {
        int arrnumber[] = new int[5];
        int cap = 5, size = 3;

        System.out.println("Before Insertion");

        for(int i = 0; i < size; i++){
            System.out.println(arrnumber[i]+" ");
        }
        System.out.println();

        int number = 8; 
        int postion = 1;
        size = insert(arrnumber, size, number, postion, cap);
        System.out.println("After Insertion");

        for(int i = 0; i<size; i++){
            System.out.println(arrnumber[i]+" ");
        }
    }
}
