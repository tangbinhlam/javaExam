public class BinarySearch {
    public static void main(String[] args) {
        int[] numbersArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};
        System.out.println(binarySearchAlgorithm(numbersArray, 8)); //prints "true"
       /* System.out.println(binarySearchAlgorithm(numbersArray, 5)); //prints "true"*/
    }

    public static boolean binarySearchAlgorithm(int[] array, int target) {
        int lowerLimit = 0;
        int upperLimit = array.length - 1;
        while (upperLimit >= lowerLimit) {
            int middleNumber = (lowerLimit + upperLimit) / 2;
            System.out.println(array[middleNumber]);
            if (array[middleNumber] == target) {
                return true;
            }
            if (array[middleNumber] < target) {
                lowerLimit = middleNumber + 1;
            }
            if (array[middleNumber] > target) {
                upperLimit = middleNumber - 1;
            }
        }
        return false;
    }
}
