package LargestElement;
public class LargestElement {
    public static int largElement(int number[]){
        int numbers = number.length;
        for(int i = 0; i<numbers; i++){
            boolean check = true;
            for(int j = 0; j<numbers; j++){
                if(number[j] > number[i]){
                    check = false;
                    break;
                }
            }
            if(check == true)
                return i;
        } 
        return -1;
    }
    public static void main(String[] args) {
        int[] number = {5,3,6,20};
        System.out.println(largElement(number));
    }
}
