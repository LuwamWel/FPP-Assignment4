public class RecursionClass {
    public static void main(String[] args) {
        System.out.print("Reversed: ");
        getReversed(248);
        System.out.println();

        int num3 = 1234;
        System.out.println("Number of digits: "+ getNumOfDigits(num3));

        int[] myArray = {1,2,3};
        System.out.println("Sum of digits: " + computeSum(myArray, 3));
    }

    /**
     * Method to display the digits of a given integer value n in reverse order
     * @param n
     */
    public static void getReversed(int n){
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            System.out.print(n % 10 + " ");
            getReversed(n / 10);
        }
    }

    /**
     * Method to count the number of digits in an integer value n. Assume that n is
     * non-negative and represented in base ten.
     * @param n
     * @return
     */
    public static int getNumOfDigits(int n){
        if (n < 10) {
            return 1;
        } else {
            return 1 + getNumOfDigits(n / 10);
        }
    }

    /**
     * Method to compute the sum of all elements of the array arr of size n
     * @param arr
     * @param n array size
     * @return sum
     */
    public static int computeSum(int[] arr, int n){
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + computeSum(arr, n - 1);
        }
    }
}
