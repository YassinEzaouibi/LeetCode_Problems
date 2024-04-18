package sin.yasso.palindrome_number;

import java.util.Scanner;

/**
 * This class contains methods to check if a number is a palindrome.
 *
 * @author YassinEzaouibi
 */
public class Palindrome {

    /**
     * This method checks if a number is a palindrome.
     * A palindrome number is a number that remains the same when its digits are reversed.
     *
     * @param x The number to check.
     * @return true if the number is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while (end >= start) {
            if (str.charAt(end) != str.charAt(start)) {
                return false;
            }
            end--;
            start++;
        }
        return true;
    }

    /**
     * The main method that runs the program.
     * It continuously asks the user for a number, checks if it's a palindrome, and prints the result.
     * The user can choose to continue or quit after each check.
     *
     * @param args Command line arguments. Not used in this program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Give me a number: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input number: " + sc.next());
                continue;
            }
            int input = sc.nextInt();
            System.out.println("Check if the number is palindrome or not: " + input);
            if (isPalindrome(input)) {
                System.out.println("The number is palindrome: " + input);
            } else {
                System.out.println("The number is not palindrome: " + input);
            }
            while (true) {
                System.out.println("To continue click 1, to quit click 2: ");
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input number: " + sc.next());
                    continue;
                }
                int decision = sc.nextInt();
                if (decision == 1 || decision == 2) {
                    if (decision == 2) {
                        return;
                    }
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1 to continue or 2 to quit.");
                }
            }
        }
    }
}