package LeadersInAnArray;

public class NaiveLeaderNumberArray {
    
    public static void leaders(int numbers[], int size){
        for(int i = 0; i<size; i++){
            boolean flag = false;

            for(int j = i + 1; j<size; j++){
                if(numbers[i] <= numbers[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(numbers[i]+ " ");
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {4,6,7,2,4,5,0};
        int size = 7;
        leaders(numbers, size);
    }
}
