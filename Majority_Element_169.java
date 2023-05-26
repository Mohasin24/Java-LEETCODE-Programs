/* 
Problem Statement : 
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
*/

import java.util.Arrays;

public class Majority_Element_169 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.majorityElement(new int[] {2,2,1,1,1,2,2}));
    }    
}

class Solution {
    public int majorityElement(int[] nums) 
    {
        int len = nums.length;

        if(len == 1)
        {
            return nums[0];
        }

        Arrays.sort(nums);
        int cnt = 0;
        

        for(int i = 1; i<len; i++)
        {
            if(nums[i-1] == nums[i])
            {
                cnt++;
            }
            else
            {
                cnt = 0;
            }

            if(cnt>=(len/2))
            {
                return nums[i-1];
            }
        }

        return 0;

       
    }
}