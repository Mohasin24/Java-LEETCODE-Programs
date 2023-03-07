/* 
Problem Statement :
Given an array arr of positive integers sorted in a strictly increasing order, 
and an integer k.

Return the kth positive integer that is missing from this array. 

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. 
The 5th missing positive integer is 9.

Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing 
positive integer is 6. 

Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length

*/

import java.lang.*;

public class kth_missing_positive_number 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        System.out.println(sl.findKthPositive(new int[] {2,3,4,7,11},5));
    }    
}

class Solution 
{
    public int findKthPositive(int[] a, int k) 
    {   
      
       for(int x : a) 
       {
           if(x<=k)
           {
               k++;
           }
           else{
               break;
           }
       }
        return k;
    }
}   

class Solution1 
{
    public int findKthPositive(int[] a, int k) 
    {   
      
        int cnt = 1;
        int len = a.length;

        for(int i = 0; i<len; i++)
        {
           while(a[i]!=cnt && k>0)
           {
               cnt++;
               k--;
           }

           if(k==0)
           {
               return cnt-1;
           }
           cnt++;
        }

        while(k>0)
        {
            cnt++;
            k--;
        }

        return cnt-1;
    }
}
