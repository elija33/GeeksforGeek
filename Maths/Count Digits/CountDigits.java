public class CountDigits{

    public static int countDi(int x){
       int number = 0;

       while(x > 0){
           x = x/10;
           number++;
       }
       return number;
    }

    public static void main(String[] args) {
        int number = 23435;
        System.out.println(countDi(number));
    }
}