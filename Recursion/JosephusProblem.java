import java.util.Scanner;

public class JosephusProblem {
    public static int JosephusProblems(int num, int nums){
        if(num == 1)
            return 0;
        else
            return (JosephusProblems(num-1, nums) + nums);
    }

    public static int moreJosephusProblems(int numb, int numbs){
        return moreJosephusProblems(numb, numbs) + 1;
    }
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter the number you want to find Josephus Problems:");
        int numbers = numb.nextInt();
        Scanner numbs;
        int numbergive = numbs.nextInt();
        System.out.println(moreJosephusProblems(numb, numbs));
    }
}
