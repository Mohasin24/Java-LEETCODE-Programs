/* 
Problem Statement :
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
 

Constraints:

1 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each element in nums appears exactly three times except for one element which appears once.
*/

import java.util.*;

public class Single_Number_2_137 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.singleNumber(new int[] {30000,500,100,30000,100,30000,100}));
    }    
}

class Solution {
    public int singleNumber(int[] nums) 
    {
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i], 1);
            }
            
        }

        for(Integer x : hm.keySet())
        {
            if(hm.get(x) == 1)
            {
                return x;
            }
        }

        return 0;
    }
}


