/* 
Problem Statement :
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class _0217_Contains_Duplicate 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }    
}


// Set Approach
// TC = O(n)
// SC = O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}

// Brute Forec Approach
// TC = O((n log n) + n)
// SC = O(1)
class Solution1 {
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        
       for(int i = 1; i<nums.length; i++)
       {
           if(nums[i]==nums[i-1])
           {
               return true;
           }
       }     

       return false;
    }
}