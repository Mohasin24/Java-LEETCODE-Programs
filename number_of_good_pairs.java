/* 
Problem statement :
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/

import java.lang.*;

public class number_of_good_pairs 
{
    public static void main(String arg[])
    {
        int Arr[] = {1,2,3,1,3};

        int iRet = numIdenticalPairs(Arr) ;

        System.out.println("There are " + iRet +" good pairs.");
    }

    public static int numIdenticalPairs(int[] nums) 
    {
        int cnt = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
