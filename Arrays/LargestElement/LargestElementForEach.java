package LargestElement;
public class LargestElementForEach {
   public static void main(String[] args) {
        double[] numArray = { 23, -34, 50, 33, 55, 437, 57, -665 };
        double largest = numArray[0];

        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }
        System.out.format("Largest element = %.2f", largest);
    }
}
