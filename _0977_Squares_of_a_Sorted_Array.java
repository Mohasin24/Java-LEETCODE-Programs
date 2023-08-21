/*
Problem Statement :
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
*/

import java.util.Arrays;

public class _0977_Squares_of_a_Sorted_Array 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
    
        System.out.println(Arrays.toString(sl.sortedSquares(new int[]{-4,-1,0,3,10})));    
    }    
}

class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;

        // Initialize two pointers: one at the beginning and one at the end of the array
        int i = 0;
        int j = n - 1;

        // Initialize an index for filling the 'ans' array from the end
        int idx = n - 1;

        // Create an array to store squared values in non-decreasing order
        int[] ans = new int[n];

        // Traverse through the array using the two pointers
        while (i <= j) {
            // Calculate the square of the value at the left pointer
            int leftSqr = Math.abs(nums[i] * nums[i]);
            // Calculate the square of the value at the right pointer
            int rightSqr = Math.abs(nums[j] * nums[j]);

            // Compare squared values and choose the larger one to put in 'ans'
            if (leftSqr >= rightSqr) {
                ans[idx] = leftSqr;
                // Move the left pointer to the right
                i++;
            } else {
                ans[idx] = rightSqr;
                // Move the right pointer to the left
                j--;
            }
            
            // Move the index for the 'ans' array to the left
            idx--;
        }

        // Return the array containing squared values in non-decreasing order
        return ans;
    }
}
