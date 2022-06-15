public class Woking {
    public static void fun1(){
        System.out.println("I am here");
    }
    public static void fun2(){
        System.out.println("Hey");
        fun1();
        System.out.println("After fun1");
    }
    public static void main(String[] args) {
        System.out.println("Before fun2");
        fun2();
        System.out.println("After fun2");
    }
    
}
