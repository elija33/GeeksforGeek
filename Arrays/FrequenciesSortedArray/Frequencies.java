package FrequenciesSortedArray;

public class Frequencies {
    public static void printFreq(int numberfreq[], int size){
        int freq = 1;
        int keep = 1;
        while(keep < size){
            while(keep < size && numberfreq[keep] == numberfreq[keep - 1]){
                freq++;
                keep++;
            }
            System.out.println(numberfreq[keep - 1] + " " + freq);
            keep++;
            freq = 1;
        }
    }
    public static void main(String[] args) {
        int numberfreq[] = {10,10,20,30,30,30};
        int size = 6;
        printFreq(numberfreq, size);
        
    }
}
