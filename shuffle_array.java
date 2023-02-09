/* 
Problem Statement :
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

import java.lang.*;
import java.util.*;

public class shuffle_array 
{
    public static void main(String arg[])
    {
        Solution sObj = new Solution();

        int arr[] = {2,5,1,3,4,7};
        int n = 3;

        System.out.println("Before shuffling array : " + Arrays.toString(arr));
        int iRet[] = sObj.shuffle(arr, n);

        System.out.println("After shuffling array : " + Arrays.toString(iRet));
    }
}

class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int ans[] = new int[(n*2)];
       
        for(int i = 0; i<n; i++)
        {   
           ans[2*i] = nums[i];

           ans[(2*i)+1] = nums[n+i];
        }

        return ans;
        
    }
}
