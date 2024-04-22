package sin.yasso.roman_to_integer;


import java.lang.reflect.Array;
import java.util.Arrays;

public class RomanToInteger {

    // Imagine the number is II = 2
    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) { //  i = 0
            char currentRomanChar = s.charAt(i);  // char = I
            int currentNumber = getNumberFromRomanChar(currentRomanChar); // int = 1

            if (i < s.length() - 1) { // i = 0 we can go to the current if content
                char nextRomanChar = s.charAt(i + 1); // char = I (the second I not the first)
                int nextNumber = getNumberFromRomanChar(nextRomanChar); // int = 1

                if (currentNumber < nextNumber) {
                    total -= currentNumber;
                } else {
                    total += currentNumber;
                }
            } else {
                total += currentNumber;
            }
        }
        return total;
    }

    private static int getNumberFromRomanChar(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));

        int[] nums = {1,1,3,2,1,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
