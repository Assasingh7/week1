package Week2.Day6;

import java.util.Scanner;

public class Practices18 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of cars
        int N = scanner.nextInt();
        
        // Iterate over each car number
        for (int i = 0; i < N; i++) {
            // Read the car number
            int carNumber = scanner.nextInt();
            
            // Check if the car is allowed to run
            if (isAllowedToRun(carNumber)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
    
    // Method to determine if the car is allowed to run
    public static boolean isAllowedToRun(int carNumber) {
        int evenSum = 0;
        int oddSum = 0;
        
        // Calculate sum of even and odd digits
        while (carNumber > 0) {
            int digit = carNumber % 10;
            
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            
            carNumber /= 10;
        }
        
        // Check the conditions
        return (evenSum % 4 == 0) || (oddSum % 3 == 0);
    }
}
