/* 
Problem Statement :
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

 

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
Example 2:

Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
Example 3:

Input: nums = [-1,1,-1,1,-1]
Output: -1
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
 

Constraints:

1 <= nums.length <= 1000
-100 <= nums[i] <= 100
*/

public class Sign_of_the_Product_of_an_Array_1822 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
    }    
}

// optimised
class Solution {
    public int arraySign(int[] nums) 
    {
        int cnt = 0; 

        for(int i = 0; i<nums.length; i++)
        { 
            if(nums[i] == 0)
            {
                return 0;
            }
            
            if(nums[i]<0)
            {
                cnt++;
            }
            
        }

        return cnt%2==0? 1:-1;
    }
}

// Brute force
class Solution2 {
    public int arraySign(int[] nums) 
    {
        int pro = nums[0];

        if(pro == 0)
        {
            return 0;
        }    

        for(int i = 1; i<nums.length; i++)
        { 
            if(nums[i] == 0)
            {
                return 0;
            }
            else if(nums[i] > 0)
            {
                pro *= 1;
            }            
            else if(nums[i]<0)
            {
                pro *= -1;
            }
            
        }

        return pro>0? 1:-1;
    }
}

