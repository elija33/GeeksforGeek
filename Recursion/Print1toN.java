public class Print1toN {
    public static void printOne(int number){
        if(number == 0)
            return;
            printOne(number-1);
        System.out.println(number);
    }
    public static void main(String[] args) {
        int number = 5;
        printOne(number);
    }
}
