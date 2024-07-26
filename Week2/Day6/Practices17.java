package Week2.Day6;

import java.util.Scanner;

public class Practices17 {
        public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Read the maximum capacity for Aayush and Harshit
            int M = sc.nextInt();
            int N = sc.nextInt();

            // Initialize counters for total smartphones purchased by Aayush and Harshit
            int aayushCount = 0;
            int harshitCount = 0;

            // Initialize the current round number
            int round = 1;

            // Loop until one of them can't purchase smartphones
            while (true) {
                if (round % 2 != 0) { // Aayush's turn (odd rounds)
                    // Calculate how many smartphones Aayush will buy this round
                    aayushCount += round;

                    // Check if Aayush can purchase
                    if (aayushCount > M) {
                        // Aayush can't purchase, Harshit wins
                        System.out.println("Harshit");
                        break;
                    }
                } else { // Harshit's turn (even rounds)
                    // Calculate how many smartphones Harshit will buy this round
                    harshitCount += round;

                    // Check if Harshit can purchase
                    if (harshitCount > N) {
                        // Harshit can't purchase, Aayush wins
                        System.out.println("Aayush");
                        break;
                    }
                }

                // Move to the next round
                round++;
            }
        }

        sc.close();

    }
    
}
