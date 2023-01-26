
/* 
Problem Statement :
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/
import java.lang.*;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) 
    {
        int nums[] = {12,345,2,6,7896};
        int iRet = findNumbers(nums);
        System.out.println(iRet);
    }

    public static int findNumbers(int[] nums) 
    {   
        int iRet = 0;
        for(int i = 0; i<nums.length; i++)
        {   
            int n = nums[i];
            int Cnt = 0;
            while(n>0)
            {
                Cnt++;
                n /= 10;
            }

            if(Cnt%2==0)
            {
                iRet++;
            }
        }

        return iRet;    
    }
}
