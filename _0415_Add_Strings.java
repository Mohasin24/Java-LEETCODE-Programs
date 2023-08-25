/* 
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"
 

Constraints:

1 <= num1.length, num2.length <= 104
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
*/

public class _0415_Add_Strings 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.addStrings("11", "777"));    
    }    
}

class Solution {
    public String addStrings(String num1, String num2) 
    {
        StringBuilder sb = new StringBuilder(); // To build the result string

        int i = num1.length() - 1; // Index for traversing num1 from right to left
        int j = num2.length() - 1; // Index for traversing num2 from right to left
        int carry = 0; // Initialize carry to 0

        // Loop through both strings until one of them is exhausted
        while (i >= 0 || j >= 0)    
        {
            int sum = carry; // Initialize sum with the current carry value

            // Add digit from num1 if there's a digit left
            if (i >= 0)
            {
                sum += num1.charAt(i) - '0'; // Convert char to integer value
                i--; // Move to the next digit in num1
            }

            // Add digit from num2 if there's a digit left
            if (j >= 0)
            {
                sum += num2.charAt(j) - '0'; // Convert char to integer value
                j--; // Move to the next digit in num2
            }

            // Append the least significant digit of the sum to the result
            sb.append(sum % 10);

            // Update carry for the next calculation
            carry = sum / 10;
        }

        // If there's still a carry left, append it to the result
        if (carry > 0)
        {
            sb.append(carry);
        }

        // Reverse the result to get the correct order of digits
        return sb.reverse().toString();
    }
}

