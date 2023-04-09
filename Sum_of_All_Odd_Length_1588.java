/* 
Problem Statement :
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
Example 3:

Input: arr = [10,11,12]
Output: 66
 

Constraints:

1 <= arr.length <= 100
1 <= arr[i] <= 1000
 

Follow up:

Could you solve this problem in O(n) time complexity?
*/

public class Sum_of_All_Odd_Length_1588 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.sumOddLengthSubarrays(new int[] {1,4,2,5,3}));
    }
}

class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int sum = 0;
        int n = arr.length;
        
        for(int i = 0; i<n; i++)
        {
            for(int j = i; j<n; j++)
            {
                if((j-i+1)%2==1)
                {
                    for(int k = i; k<=j; k++)
                    {
                        sum += arr[k];
                    }
                }
            }
        }
        
        return sum;
    }
}

// medium optimized
class Solution2 {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int sum = 0, localSum = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++)    
        {
            for(int j = i; j<n; j++)
            {
                localSum += arr[j];

                if((j-i+1)%2==1)
                {
                    sum += localSum;
                }
            }

            localSum = 0;
        }

        return sum;
    }
}

// most optimized solution with O(1) space complexiety and O(n) time complexiety
class Solution3 {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++)    
        {
          ans += ((i+1)*(n-i) + 1 )/2 * arr[i];
        }

        return ans;
    }
}

/* 
Explanation :
The code loops through each element in the input array and calculates the number 
of subarrays of odd length that include that element using the formula 
(left*right+1)/2, where left is the number of elements to the left of the 
current element (including the current element), and right is the number 
of elements to the right of the current element (including the current element). 
This formula counts the number of subarrays that include the current element by 
multiplying the number of elements to the left and right of it and adding 
1 (to account for the subarray that includes only the current element), and 
then dividing by 2 to get the number of subarrays of odd length.

The code then multiplies the number of subarrays that include the current 
element by the value of the element, and adds that to the running total ans. 
Finally, it returns the total sum of all subarrays of odd length.
*/