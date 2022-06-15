public class FibNumber {
    public static int fib(int number){
        if(number <= 1)
            return number;
        return fib(number - 1) + fib(number - 2);
    }
    
}
