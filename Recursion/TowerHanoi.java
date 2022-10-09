public class TowerHanoi {

    public static void ToH(int number, char A, char B, char C) {
        if (number == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }

        ToH(number - 1, A, B, C);
        System.err.println("Move " + number + " from " + A + " to " + C);
        ToH(number - 1, A, B, C);
    }

    public static void main(String[] args) {
        int number = 2;
        ToH(number, 'A', 'B', 'C');
    }
}
