/* 
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104
*/

public class _0050_Pow 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.myPow(0.00001, 2147483647));    
    }    
}
class Solution {
    public double myPow(double x, int n) {
        // Base case: Any number raised to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // Handle negative exponents
        if (n < 0) {
            // Special case: Handle potential overflow when n is Integer.MIN_VALUE
            if (n == Integer.MIN_VALUE) {
                n = -(n + 1); // Convert to a positive value to avoid overflow
                x = 1 / x;    // Invert the base
                // Recursive calculation with adjusted n and x
                return x * x * myPow(x * x, n / 2);
            } else {
                // Convert negative exponent to positive and calculate the reciprocal
                return 1 / helper(x, -n);
            }
        } else {
            // Positive exponent, delegate to helper function
            return helper(x, n);
        }
    }

    private double helper(double x, int n) {
        // Base case: x raised to the power of 1 is x
        if (n == 1) {
            return x;
        }

        // Recursively compute the power of x^(n/2)
        double ans = helper(x, n / 2);

        if (n % 2 == 0) {
            // If n is even, return the square of x^(n/2)
            return ans * ans;
        } else {
            // If n is odd, return the square of x^(n/2) multiplied by x
            return ans * ans * x;
        }
    }
}
