import java.util.Scanner;

public class JosephusProblem {
    public static int JosephusProblems(int num, int nums) {
        if (num == 1)
            return 0;
        else
            return (JosephusProblems(num - 1, nums) + nums);
    }

    public static int moreJosephusProblems(int numb, int numbs) {
        return JosephusProblems(numb, numbs) + 1;
    }

    public static void main(String[] args) {
        System.out.println(moreJosephusProblems(5, 3));
    }
}
