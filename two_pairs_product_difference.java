/* 
Problem Statement :
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).

For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.

Return the maximum such product difference.

 

Example 1:

Input: nums = [5,6,2,7,4]
Output: 34
Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
Example 2:

Input: nums = [4,2,5,9,7,4,8]
Output: 64
Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
The product difference is (9 * 8) - (2 * 4) = 64.
 

Constraints:

4 <= nums.length <= 104
1 <= nums[i] <= 104
*/
import java.lang.*;

public class two_pairs_product_difference 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.maxProductDifference(new int[] {4,2,5,9,7,4,8}));
    }
}

class Solution {
    public int maxProductDifference(int[] nums) 
    {
        int max1 = 0;
        int max2 = 0;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int len = nums.length;

        for(int i = 0; i<len; i++)    
        {
            int n = nums[i]; 

            if (n > max1) {
                max2 = max1;
                max1 = n;

            } else if (n > max2) {
                max2 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        return ((max1*max2) - (min1*min2));
    }

}
