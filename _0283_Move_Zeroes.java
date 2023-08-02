/* 
Problem Statement :
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 
*/

import java.util.Arrays;

public class _0283_Move_Zeroes 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[] {0,1,0,3,12};
        Solution sl = new Solution();
        sl.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }    
}

class Solution {
    public void moveZeroes(int[] nums) 
    {
        int i = 0;
        int j = 0;

        while(j<nums.length)
        {
            if(nums[j] == 0)
            {
                j++;
            }
            else
            {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        while(i<nums.length)
        {
            nums[i] = 0;
            i++; 
        }
    }
}