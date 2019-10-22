public class GuthrieSequence {
    public static void main(String[] args) {
        System.out.println(isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1})); // 1
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2, 1})); // 1
        System.out.println(isGuthrieSequence(new int[]{8, 17, 4, 1})); // 0
        System.out.println(isGuthrieSequence(new int[]{8, 4, 1})); // 0
        System.out.println(isGuthrieSequence(new int[]{8, 4, 2})); // 0
    }

    /*
    Start with a positive number n
    if n is even then divide by 2
    if n is odd then multiply by 3 and add 1
    continue this until n becomes 1
     */
    public static int isGuthrieSequence(int[] a) {
        if( a.length< 1) {
            return 0;
        } else {
            if( a[0] < 1) {
                return 0;
            } else {
                for(int i = 0; i< a.length - 1; i ++) {
                    if(a[i]%2==0 && a[i]/2!= a[i + 1]) {
                        return 0;
                    }else if(a[i]%2!=0 && (a[i]*3 + 1 != a[i+1])) {
                        return 0;
                    }
                }
                return a[a.length-1] == 1?1:0;
            }
        }
    }
}
