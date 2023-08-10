/* 
Problem Statement :
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

Accepted
1.8M
Submissions
2.8M

*/

import java.util.Arrays;

public class _0038_Product_of_Array_Except_Self 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.productExceptSelf(new int[]{1,2,3,4})));
    }    
}

class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int[] leftProd = new int[n];
        int[] rightProd = new int[n];

        leftProd[0] = 1;
        rightProd[n-1] = 1;

        for(int i = 1; i<n; i++)
        {
            leftProd[i] = leftProd[i-1]*nums[i-1];

            rightProd[n-i-1] = rightProd[n-i]*nums[n-i];
        }

        for(int i = 0; i<n; i++)
        {
            nums[i] = rightProd[i]*leftProd[i];
        }

        return nums;
    }
}

