import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        if (num == 0)
            System.out.println();
        int total = num / 2;
        System.out.println(total % 2);
    }
}
