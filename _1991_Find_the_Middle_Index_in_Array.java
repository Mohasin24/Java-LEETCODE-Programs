/* 
Problem Statement :
Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

 

Example 1:

Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4
Example 2:

Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0
Example 3:

Input: nums = [2,5]
Output: -1
Explanation: There is no valid middleIndex.
 

Constraints:

1 <= nums.length <= 100
-1000 <= nums[i] <= 1000

*/

public class _1991_Find_the_Middle_Index_in_Array 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.findMiddleIndex(new int[] {2,3,-1,8,4}));
    }    
}

// Time complexity: O(n)
// Space complexity:O(n)

class Solution {
    public int findMiddleIndex(int[] nums) 
    {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int lSum = 0;
        int rSum = 0;

        for(int i = 0; i<n; i++)
        {
            lSum += nums[i];
            leftSum[i] = lSum;

            rSum += nums[n-i-1];
            rightSum[n-i-1] = rSum;
        }

        for(int i = 0; i<n; i++)
        {
            if(rightSum[i]==leftSum[i])
            {
                return i;
            }
        }

        return -1;
    }
}