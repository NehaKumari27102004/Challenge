package Challenge;

import java.util.Arrays; // Import Arrays utility for easy printing

class DiffElementAndDigitSum {

    // Removed the unused static fields 'numbers' and 'num1'

    public int calculateDifference(int[] nums) {
        int ElementsSum = 0;
        int DigitsSum = 0;

        for (int num : nums) {
            ElementsSum += num;
            

            int temp = num;
            // Corrected the while loop condition to run as long as temp is positive
            while (temp > 0) {
                // Corrected the assignment to accumulate the digits sum
                DigitsSum += temp % 10;
                temp /= 10;
            }
        }
        System.out.println("The sum of Element is : " + ElementsSum);
        System.out.println("The sum of Digits is : " + DigitsSum);
        return Math.abs(ElementsSum - DigitsSum);
    }

    public static void main(String[] args) {
        DiffElementAndDigitSum diff = new DiffElementAndDigitSum();
        int[] num1 = {3, 5, 7, 22, 4, 56};

        // Used Arrays.toString() to print the array contents properly
        System.out.println("Num1: " + Arrays.toString(num1));


        // Called the method and printed the result
        int difference = diff.calculateDifference(num1);
        System.out.println("Output (Difference): " + difference);
    }
}
