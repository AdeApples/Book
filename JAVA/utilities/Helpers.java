/**
 * Java Utility Helper Methods
 * Common helper methods for everyday coding
 */
public class Helpers {
    
    // ========== EVEN/ODD METHODS ==========
    
    /**
     * Check if a number is even
     * @param number The number to check
     * @return true if even, false if odd
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Check if a number is odd
     * @param number The number to check
     * @return true if odd, false if even
     */
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    
    
    // ========== STRING METHODS ==========
    
    /**
     * Reverse a string
     * @param text The string to reverse
     * @return The reversed string
     */
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    
    /**
     * Count the number of vowels in a string
     * @param text The string to check
     * @return The number of vowels
     */
    public static int countVowels(String text) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char letter : text.toCharArray()) {
            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }
        return count;
    }
    
    
    // ========== MATH METHODS ==========
    
    /**
     * Calculate the factorial of a number
     * @param n The number (must be non-negative)
     * @return The factorial of n
     */
    public static long factorial(int n) {
        if (n < 0) {
            return -1;  // Error indicator
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Find the maximum number in an array
     * @param numbers Array of numbers
     * @return The largest number in the array
     */
    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    /**
     * Find the minimum number in an array
     * @param numbers Array of numbers
     * @return The smallest number in the array
     */
    public static int findMin(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    
    // ========== EXAMPLES ==========
    // Uncomment main method to test:
    
    /*
    public static void main(String[] args) {
        System.out.println(isEven(4));  // true
        System.out.println(isOdd(7));  // true
        System.out.println(reverseString("hello"));  // "olleh"
        System.out.println(countVowels("hello world"));  // 3
        System.out.println(factorial(5));  // 120
        int[] numbers = {3, 7, 2, 9, 1};
        System.out.println(findMax(numbers));  // 9
        System.out.println(findMin(numbers));  // 1
    }
    */
}
