/* 
Problem Statement :

You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100


*/

import java.util.HashSet;

import java.util.*;

public class Sum_of_Unique_Elements_1748 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        // System.out.println(sl.sumOfUnique(new int[] {1,2,3,4,5}));

        Solution3 sl3 = new Solution3();

        sl3.sumOfUnique(new int[] {1,2,3,4,5});
    }    
}

class Solution 
{
    public int sumOfUnique(int[] nums) 
    {
        
        int[] buc = new int[101];
        int sum = 0;

        for(int i = 0; i<nums.length; i++)  
        {
            buc[nums[i]]++;
            
        }

        for(int i = 0; i<buc.length; i++)
        {
            if(buc[i] == 1)
            {
                sum += i;
            }
        }

        return sum;
    }
}

class Solution2 {
    public int sumOfUnique(int[] nums) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.replace(nums[i], hm.get(nums[i])+1);
            }
            else
            {  
                
                hm.put(nums[i],1);
            }
              
    
            
            
        }

        System.out.println(hm);
    
        for(Integer k : hm.keySet())
        {
            if(hm.get(k).intValue() == 1)
            {
                sum += k;
            }
        }
            
        return sum;
    }
}

class Solution3
{
    public int sumOfUnique(int[] nums)
    {
        int sum = 0;
        
        for(int i = 0; i<nums.length; i++)
        {
            int cnt = 0;

            for(int j = 0; j<nums.length; j++)
            {
                if(j!=i && nums[j]==nums[i])
                {
                    cnt++;
                    break; 
                }
            }

            if(cnt == 0)
            {
                sum += nums[i];
            }
        }

        return sum;
    }
}