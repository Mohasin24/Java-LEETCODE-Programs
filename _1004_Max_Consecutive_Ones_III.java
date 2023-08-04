/* 
Problem Statement :
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
*/

public class _1004_Max_Consecutive_Ones_III 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }    
}

//optimised solution
class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int leftWin = 0;
        int rightWin = 0;

        while(rightWin<nums.length)
        {
            if(nums[rightWin]==0)
            {
                k--;
            }

            if(k<0)
            {
                if(nums[leftWin]==0)
                {   
                    k++;
                }

                leftWin++;
            }

            rightWin++;
        }

        return nums.length-leftWin;
    }
}

// brute forec
class Solution1 {
    public int longestOnes(int[] nums, int k) 
    {
        // 0 cnt
        // 1 cnt
        // winsize
        // max
        // if 0 cnt == k do update max with win 
        
        int max = 0;
        int zeroCnt = 0;
        int winSize = 0;

        for(int i = 0; i<nums.length-k; i++)
        {
            zeroCnt = 0;
            winSize = 0;

            for(int j = i; j<nums.length; j++)
            {
                

                if(nums[j] == 0)
                {
                    zeroCnt++;
                }

                if(zeroCnt>k)
                {
                    System.out.println(winSize);
                    max = Math.max(max,winSize);
                    break;
                }

               winSize++;
                
            }
        }    

        max = Math.max(max,winSize);

        return max;
    }
}