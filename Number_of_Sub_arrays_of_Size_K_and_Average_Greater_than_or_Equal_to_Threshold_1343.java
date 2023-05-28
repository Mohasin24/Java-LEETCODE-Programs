/*
Problem Statement :
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
Example 2:

Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 

Constraints:

1 <= arr.length <= 105
1 <= arr[i] <= 104
1 <= k <= arr.length
0 <= threshold <= 104

*/

public class Number_of_Sub_arrays_of_Size_K_and_Average_Greater_than_or_Equal_to_Threshold_1343
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        int iRet = sl.numOfSubarrays(new int[] {2,2,2,2,5,5,5,8}, 3, 4);

        System.out.println(iRet);
    }
}

class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) 
    {
        //first find sum of first k size window
        //create a counter which will keep track of avearge sub-arrays take average of sum if avearge is greater or equal and increase the counter
        //in next loop start moving the window and keep sum substracting the prev element and adding the new element and keep checking for average 

        int sum = 0;
        int cnt = 0;
        int thVal = k*th;

        for(int i = 0; i<k; i++)
        {
            sum += arr[i];
        }

        if(sum >= thVal)
        {
            cnt++;
        }

        for(int i = k; i<arr.length; i++)
        {
            sum = sum - arr[i-k] + arr[i];

            if(sum >= thVal)
            {
                cnt++;
            }
        }

        return cnt;
    }
}