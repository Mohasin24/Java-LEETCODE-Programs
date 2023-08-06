/* 
Problem Statement :
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
*/

import java.util.Arrays;

public class _0016_3Sum_closest 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
}

// Time complexity: O(n log n + n^2)~~O(n^2)
// Space complexity: O(1)

class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);

        int closestSum = 25000; // picked random value according to constraint
        int n = nums.length;
        for(int i = 0; i<n-2; i++)
        {
            int start = i+1;
            int end = n-1;

            while(start<end)
            {
                int sum = nums[i]+nums[start]+nums[end];

                if(Math.abs(target-sum)<Math.abs(target-closestSum))
                {
                    closestSum = sum;
                }

                if(sum<target)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }

        return closestSum;


    }
}