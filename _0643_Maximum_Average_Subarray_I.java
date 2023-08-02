/* 
Problem Statement :
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 

Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
*/

public class _0643_Maximum_Average_Subarray_I 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
    }    
}

class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        double maxAvg = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i<k; i++)
        {
            currSum += nums[i];
        }    

        maxAvg = checkMax(maxAvg,currSum);

        for(int i = k; i<nums.length; i++)
        {
            currSum += nums[i] - nums[i-k];

            maxAvg = checkMax(maxAvg, currSum);
        }

        return (maxAvg/k);
    }

    private double checkMax(double n1, double n2)
    {
        if(n1>n2)
        {
            return n1;
        }

        return n2;
    }
}