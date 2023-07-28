/* 
Problem Statement :
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
*/

import java.util.ArrayList;
import java.util.List;

public class _0046_Permutations 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.permute(new int[]{1,2,3}));
    }    
}

class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }

    private void helper(int[] nums,int idx,List<List<Integer>> ans)
    {
        if(idx == nums.length-1)
        {
            ArrayList<Integer> list = new ArrayList<>();

            for(int x : nums)
            {
                list.add(x);
            }

            ans.add(list);
            return;
        }

        for(int i = idx; i<nums.length; i++)
        {
           swap(i,idx,nums);
           helper(nums,idx+1,ans);
           swap(i,idx,nums);
        }

    }

    private void swap(int i, int j, int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}