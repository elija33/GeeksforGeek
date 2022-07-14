public class Searching{
    public static int search(int number[], int num, int numbers){   //number is the array, num is the size of the array.
                for(int i = 0; i < num; i++){                       //numbers is the element we are looking for 
                    if(number[i] == numbers)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
       int number[] = {20, 5, 7, 25, 11}, numbers = 5;
       System.out.println(search(number, number.length, numbers));
    }
}