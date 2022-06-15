import java.util.Scanner;

public class WorkingTwo {
    public static void fun1(int numb){
        if(numb == 0)
        return;
        System.out.println("a+a");
        fun1(numb - 1);
    }
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        int num = numb.nextInt();
        fun1(2);  
    }
   
}
