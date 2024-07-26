package Week2.Day4;

import java.util.Scanner;

public class Practices12 {
     static long replaceZeroWithFive(long n) {
        // Handle the special case where n is zero
        if (n == 0) {
            return 5;
        }

        long result = 0;
        long multiplier = 1;
        boolean isNegative = n < 0;

        // If the number is negative, make it positive for processing
        if (isNegative) {
            n = -n;
        }

        while (n > 0) {
            long digit = n % 10;  // Get the last digit
            if (digit == 0) {
                digit = 5;  // Replace 0 with 5
            }
            result += digit * multiplier;  // Build the new number
            multiplier *= 10;  // Increase the position multiplier
            n /= 10;  // Remove the last digit
        }

        // If the original number was negative, convert the result back to negative
        if (isNegative) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an integer n: ");
        long n = sc.nextLong();
        long result = replaceZeroWithFive(n);
        System.out.println( result);
        sc.close();
    }
    
}
