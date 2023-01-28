/* 
Problem Statement : 
You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.

Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
*/
import java.lang.*;

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array 
{
    public static void main(String arg[])
    {
        int A[] = {1,15,6,3};

        int iRet = differenceOfSum(A);
        System.out.println(iRet);
    }
    
    public static int differenceOfSum(int[] nums) 
    {
        int totalSum = 0;
        int digitSum = 0;

        for(int i = 0; i<nums.length; i++)    
        {   

            totalSum += nums[i];

            if(nums[i]>=10)
            {
                while(nums[i]>0)
                {
                    digitSum = digitSum + (nums[i]%10);

                    nums[i] = nums[i]/10;
                }
            }
            else 
            {
                digitSum = digitSum + nums[i];
            }
        }

        // if((totalSum-digitSum)<0)
        // {
            
        // }
        // else 

        // {
        //     return (totalSum-digitSum);
        // }

        return Math.abs(totalSum-digitSum);
    }
}
