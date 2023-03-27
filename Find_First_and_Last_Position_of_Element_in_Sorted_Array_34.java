import java.util.Arrays;

/* 
Problem Statement :
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.searchRange(new int[] {5,7,7,8,8,10}, 10)));    
    }    
}

class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int firstPos = searchIndex(nums, target, true);
        int lastPos = searchIndex(nums, target, false);

       return new int[] {firstPos,lastPos}; 
    }

    // using binary search
    private int searchIndex(int[] nums, int tgt, boolean findFirstIndex)
    {
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while(s<=e)
        {
            int m  = s + (e-s)/2;

            if(nums[m]>tgt)
            {
                e = m - 1;
            }
            else if (nums[m]<tgt)
            {
                s = m + 1;
            }
            else
            {
                ans = m;

                // for finding first index search in left 
                if(findFirstIndex)
                {
                    e = m - 1;
                }
                else  // for finding last index search in right 
                {
                    s = m + 1;
                }
            }
        }

        return ans;
    }
}

class Solution1 {
    public int[] searchRange(int[] nums, int target) 
    {
        // using brute force method
        int s = -1;
        int e = -1;
        int l = nums.length;

        for(int i = 0; i<l; i++)
        {
            if(nums[i]==target && s==-1)
            {
                s = i;
            }
            
            if(nums[l-1-i]==target && e==-1)
            {
                e = (l-1-i);
            }

            if(s!=-1 && e!=-1)
            {
                break;
            }
        }
        
        return new int[] {s,e};
    }
}
