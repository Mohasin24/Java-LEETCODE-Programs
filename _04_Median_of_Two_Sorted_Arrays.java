/* 
Problem Statement :
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/

import java.util.Arrays;

public class _04_Median_of_Two_Sorted_Arrays 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.findMedianSortedArrays(new int[]{1,3}, new int[] {2}));
    }    
}

class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) 
    {
        int i = 0;
        int j = 0;

        int[] temp = new int[num1.length + num2.length];

        for(i = 0; i<num1.length; i++)
        {
            temp[j] = num1[i];
            j++;
        }

        i = 0;

        while(j<temp.length && i<num2.length)
        {
            temp[j] = num2[i];
            j++;
            i++;
        }

        Arrays.sort(temp);

        int start = 0;
        int end = temp.length-1;
        int mid = end - (start+end)/2;

        if(temp.length%2==0)
        {    
            return (double)(temp[mid]+temp[mid-1])/2;
        }
        else
        {
           return (double)temp[mid];
        }
    }
}