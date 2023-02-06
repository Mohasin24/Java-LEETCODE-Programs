/* 
Problem statement :
Given an integer array nums sorted in non-decreasing order, remove the duplicates 
in-place such that each unique element appears only once. The relative order of the 
elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must 
instead have the result be placed in the first part of the array nums. More formally, 
if there are k elements after removing the duplicates, then the first k elements of 
nums should hold the final result. It does not matter what you leave beyond the first 
k elements.

Return k after placing the final result in the first k slots of nums.
*/

import java.lang.*;
import java.util.Arrays;

public class remove_duplicate_from_sorted_array
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,2};

        Solution s1 = new Solution();

        int iRet = s1.removeDuplicates(arr);

        System.out.println(iRet);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) 
    {   
        int newIndex = 1;
        
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i-1]<nums[i])
            {
                nums[newIndex] = nums[i];
                newIndex++; 
            }
        }

        for(int i = 0; i<nums.length; i++)
        {
            if(i>newIndex-1)
            {
                nums[i] = 0;
            }
        }
        
        return newIndex;
    }
}

