/* 
Problem Statement : 
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead 
have the result be placed in the first part of the array nums. More formally, if there are k 
elements after removing the duplicates, then the first k elements of nums should hold the final result. 
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place 
with O(1) extra memory.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
import java.lang.*;
import java.util.*;

public class Remove_Element 
{
    public static void main(String[] args) 
    {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(Arrays.toString(nums));

        Solution sl = new Solution();

        int iRet = sl.removeElement(nums, val);

        System.out.println(iRet);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) 
    {   
         
        int i = 0;

        for(int j = 0; j<nums.length; j++)
        {
            if(nums[j]!=val)
            {
                nums[i] = nums[j];
                i++;
                
            }
            
        }
        return i;
    }
}