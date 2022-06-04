// a*b = g(a,b) * lcm(a,b)
public class Lcm1 {
    
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        int a = 4, b = 6;

        System.out.println(lcm(a, b));
    }
}
