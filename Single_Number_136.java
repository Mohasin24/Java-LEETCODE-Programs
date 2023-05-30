/* 
Problem Statement :
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/
import java.util.HashMap;
public class Single_Number_136 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.singleNumber(new int[] {4,1,2,1,2}));
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