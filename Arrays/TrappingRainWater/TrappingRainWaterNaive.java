package TrappingRainWater;

public class TrappingRainWaterNaive {
    public static int getWater(int water[], int size){
        int result = 0;
        for(int i = 1; i<size -1; i++){
            int numbermax = water[i];

            for(int j = 0; j<i; j++)
                numbermax = Math.max(numbermax, water[j]);

                int numbermass = water[i];

            for(int j = i + 1; j < size; j++)
                numbermass = Math.max(numbermass, water[j]);

            result = result + (Math.min(numbermax, numbermass) - water[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int numbers[] = {3,0,1,2,5};
        int num = 5;
        System.out.println(getWater(numbers, num));
    }
}
