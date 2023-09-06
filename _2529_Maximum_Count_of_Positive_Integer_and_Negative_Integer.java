/* 
Problem Statement :
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

 

Example 1:

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
Example 2:

Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
Example 3:

Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
 

Constraints:

1 <= nums.length <= 2000
-2000 <= nums[i] <= 2000
nums is sorted in a non-decreasing order.
 

Follow up: Can you solve the problem in O(log(n)) time complexity?
*/

public class _2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.maximumCount(new int[] {-3,-2,-1,0,0,1,2}));    
    }   
}

//Binary Search Solution
class Solution {
    public int maximumCount(int[] nums) 
    {
        // Calculate the count of positive numbers in the array
        int posCnt = nums.length - posBinary(nums);
         
        // Calculate the count of negative numbers in the array and add 1 to it
        int negCnt = negBinary(nums) + 1;

        // Return the maximum count between positive and negative counts
        return posCnt > negCnt ? posCnt : negCnt;  
    }        
    
    // Binary search to find the index where positive numbers start in the array
    private int posBinary(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {   
            int mid = start + (end - start) / 2;  // Calculate the middle index

            if(nums[mid] <= 0)
            {
                start = mid + 1;   // Move the start pointer to the right
            }
            else
            {
                end = mid - 1;     // Move the end pointer to the left
            }
        }
        return start;  // Return the index where positive numbers start
    }
   
    // Binary search to find the index where negative numbers end in the array
    private int negBinary(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;  // Calculate the middle index

            if(nums[mid] >= 0)
            {
                end = mid - 1;     // Move the end pointer to the left
            }
            else
            {
                start = mid + 1;   // Move the start pointer to the right
            }
        }
        return end;  // Return the index where negative numbers end
    }
}

//Brute force
class Solution2 {
    public int maximumCount(int[] nums) 
    {
        // Initialize counters for negative and positive numbers to zero
        int negCnt = 0; // Counter for negative numbers
        int posCnt = 0; // Counter for positive numbers

        // Loop through the input array to count negative and positive numbers
        for(int i = 0; i < nums.length; i++)    
        {
            if(nums[i] < 0) // Check if the current element is negative
            {
                negCnt++; // Increment the negative counter
            }
            if(nums[i] > 0) // Check if the current element is positive
            {
                posCnt++; // Increment the positive counter
            }
        }

        // Return the maximum count between negative and positive numbers
        return negCnt > posCnt ? negCnt : posCnt;
    }
}
