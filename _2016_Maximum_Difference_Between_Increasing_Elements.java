/* 
Problem Statement :
Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

Return the maximum difference. If no such i and j exists, return -1.

 

Example 1:

Input: nums = [7,1,5,4]
Output: 4
Explanation:
The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
Example 2:

Input: nums = [9,4,3,2]
Output: -1
Explanation:
There is no i and j such that i < j and nums[i] < nums[j].
Example 3:

Input: nums = [1,5,2,10]
Output: 9
Explanation:
The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.
 

Constraints:

n == nums.length
2 <= n <= 1000
1 <= nums[i] <= 109
*/

// Complexity
// Time complexity: O(n)
// Space complexity: O(1)

public class _2016_Maximum_Difference_Between_Increasing_Elements 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.maximumDifference(new int[] {7,1,5,4}));
    }
        
}

class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;  // Initialize the maximum difference to -1.
        int i = 0;     // Initialize the left pointer to the first element of the array.

        for (int j = 1; j < nums.length; j++) {
            // Check if the element at the current right pointer (j) is greater than the element at the left pointer (i).
            if (nums[i] < nums[j]) {
                int diff = nums[j] - nums[i];  // Calculate the difference between the two elements.

                // Check if the current difference is greater than the current maximum.
                if (max < diff) {
                    max = diff;  // Update the maximum difference if the current difference is larger.
                }
            } else {
                i = j;  // If the element at i is greater or equal, update the left pointer (i) to the current right pointer (j).
            }
        }

        return max;  // Return the maximum difference found.
    }
}
