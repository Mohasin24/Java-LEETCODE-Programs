/* 
Problem Statement :
Given an integer array nums and an integer k, return the number of pairs (i, j) 
where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:

x if x >= 0.
-x if x < 0.
 
Example 1:

Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]

*/
import java.lang.*;
import java.util.*;

import javax.sound.midi.Soundbank;

public class Number_of_pairs_with_abs_diff 
{
    public static void main(String arg[])    
    {
        int nums[] = {1,2,2,1};
        int k = 1;

        Solution sl = new Solution();

        System.out.println(sl.countKDifference(nums, k));
    }
}

class Solution 
{
    public int countKDifference(int[] nums, int k) 
    {
        int cnt = 0;
        // for(int i = 0; i<nums.length; i++)
        // {
        // for(int j =i+1 ; j<nums.length; j++)
        // {
        // if(Math.abs(nums[i]-nums[j])==k)
        // {
        // cnt++;
        // }

        // }
        // }

        int arr[] = new int[101];

        for (int i = 0; i < nums.length; i++) 
        {
            arr[nums[i]]++;
        }

        for (int i = arr.length - 1; i > k; i--) 
        {
            cnt = cnt + arr[i - k] * arr[i];
        }

        return cnt;
    }
}
