/* 
Problem Statement :
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
 
*/

public class _0334_Increasing_Triplet_Subsequence 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.increasingTriplet(new int[] {1,2,3,4,5}));
    }    
}

// Complexity
// Time complexity:O(n)
// Space complexity:O(1)

class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
        int max1 = Integer.MAX_VALUE;  // Initialize the first maximum value
        int max2 = Integer.MAX_VALUE;  // Initialize the second maximum value

        for (int x : nums)
        {
            if (x <= max1)
            {
                max1 = x;  // Update the first maximum if x is smaller or equal
            }
            else if (x <= max2)
            {
                max2 = x;  // Update the second maximum if x is smaller or equal
            }
            else
            {
                return true;  // If we find a number greater than max2, then we have an increasing triplet
            }
        }

        return false;  // No increasing triplet found in the array
    }
}
