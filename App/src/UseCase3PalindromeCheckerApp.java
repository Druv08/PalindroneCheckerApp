/**
 * ============================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original string.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Compares original and reversed strings
 *
 * This introduces transformation-based validation.
 *
 * Author: Druv
 * Version: 1.0
 * ============================================================
 */

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker App");
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reversed = "";

        // Iterate from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome");
        } else {
            System.out.println("Result: The string is NOT a Palindrome");
        }

        sc.close();
    }
}