public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseANumber(6));
        System.out.println(reverseANumber(36));
    }

    public static int reverseANumber(int num) {
        int reversenum = 0;
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        return reversenum;
    }
}
