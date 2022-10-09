
public class FibRecurse {

    public static int fact(int number) {
        if (number == 0) {
            return 1;
        }
        return number * fact(number - 1);
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println(fact(number));
    }
}