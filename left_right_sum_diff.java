/* 
Given a 0-indexed integer array nums, find a 0-indexed integer array answer 
where:
answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. 
If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 105
*/
import java.lang.*;
import java.util.Arrays;

public class left_right_sum_diff 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        int iRet[] = sl.leftRigthDifference(new int[] {10,4,8,3});

        System.out.println(Arrays.toString(iRet));
    }    
}

class Solution {
    public int[] leftRigthDifference(int[] nums) 
    {
        int len = nums.length;
        int a[] = new int[len];

        // for(int i = 0; i<nums.length; i++)
        // {
        //     int leftSum = 0, rightSum = 0;

        //     for(int j = i-1; j>=0; j--)
        //     {
        //         leftSum += nums[j];
        //     }

        //     for(int j = i+1; j<nums.length; j++)
        //     {
        //         rightSum += nums[j];
        //     }

        //     a[i]=Math.abs(leftSum-rightSum);
        // }

        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        
        for(int i = 1; i<len; i++)
        {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        for(int i = len-2; i>=0; i--)
        {
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }

        for(int i = 0; i<len; i++)
        {
            a[i] = Math.abs((leftSum[i]-rightSum[i]));
        }

        return a;
    }
}
