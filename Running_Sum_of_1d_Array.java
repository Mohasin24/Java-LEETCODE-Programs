/* 
Problem statement :- 
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums. 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
import java.lang.*;
import java.util.*;

import javax.sound.midi.Soundbank;

public class Running_Sum_of_1d_Array 
{
    public static void main(String arg[])
    {
        int Arr[] = {1,2,3,4,5};

        int iRet[] = runningSum(Arr);
        System.out.println(Arrays.toString(iRet));

        // System.out.println(Arrays.toString(runningSum(Arr)));
    }

    public static int[] runningSum(int[] nums) {
        int iSum = 0;
        int arr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            iSum = iSum + nums[i];
            arr[i] = iSum;
        }

        return arr;
    }
}
