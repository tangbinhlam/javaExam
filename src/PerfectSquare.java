public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }

    public static int isPerfectSquare(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            int square;
            int number = 1;
            do {
                square = number * number;
                number++;
            } while (square <= n);
            return square;
        }
    }
}
