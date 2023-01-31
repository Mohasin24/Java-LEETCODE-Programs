/* 
Problem Statement :
We are given a list nums of integers representing a list compressed with run-length 
encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] 
(with i >= 0).  For each such pair, there are freq elements with value val 
concatenated in a sublist. Concatenate all the sublists from left to right 
to generate the decompressed list.

Return the decompressed list.

Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

Example 2:

Input: nums = [1,1,2,3]
Output: [1,3,3]
*/
import java.lang.*;
import java.util.*;

public class Decompress_Run_Length_Encoded_List 
{
    public static void main(String arg[])
    {   
        int Arr[] = {1,1,2,3,6,5};

        Solution s1 = new Solution();

        int iRet[] = s1.decompressRLElist(Arr);

        System.out.println(Arrays.toString(iRet));
    }
}

class Solution 
{   
    public int[] decompressRLElist(int[] nums) 
    {
        int size = 0;
        int freq = 0;
        int val = 0;
        int cnt = 0;
        

        for(int i = 0; i<nums.length/2; i++)   
        {
            size = size + nums[2*i];
        }

        int ret[] = new int[size];

        for(int i = 0; i<nums.length/2; i++)   
        {
            freq = nums[2*i];
            val = nums[2*i+1];

            for(int j = 0; j<freq; j++)
            {
                ret[cnt] = val;
                cnt++;
            }
        }

        return ret;
    }
}
