public class PracticeTwo {
    public static void fun(int number){
        if(number == 0) // number = 3 this fun 3            fun 3
            return;            //                               fun 2
        fun(number - 1);  // 3 -1 = 2                               fun1
        System.out.println(number); // print 2.
        fun(number - 1);  // 2 -1 = 1
    }
    public static void main(String[] args) {
        fun(3);
    }
}
