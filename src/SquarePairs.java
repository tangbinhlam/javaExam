public class SquarePairs {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
    }

    public static int countSquarePairs(int[] a) {
        if (a.length < 2) return 0;
        int count = 0;
        for(int i = 0; i < a.length - 1; i ++ ) {
            for ( int j = i + 1; j < a.length; j++) {
                if(isSquareParis(a[i], a[j])) {
                    count ++;
                }
                if(isSquareParis(a[j], a[i])) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static boolean isSquareParis(int x, int y) {
        return (x > 0 && y > 0 && y > x && PerfectSquare.isPerfectSquare(x + y) == 1);
    }
}
