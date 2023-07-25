/* 
Problem Statement :
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
 

Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
*/

import java.util.Arrays;

public class _0875_Koko_Eating_Bananas 
{
    public static void main(String[] args) 
    {
        int[] piles = {30,11,23,4,20};

        Solution sl = new Solution();

        // sl.minEatingSpeed(piles, 5);
        System.out.println(sl.minEatingSpeed(piles, 6));
    }    
}

// self
class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int start = 1;
        int end = getMax(piles);
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            long maxHr = getTotalHours(piles,mid);

            if(maxHr <= h)
            {
                end = mid-1;
            }
            else
            {  
               start = mid+1;
            }
        }

        return start;
    }

    private long getTotalHours(int[] arr, int k)
    {
        long totalHr = 0;

         for (int n : arr) {
            totalHr += (n + k - 1) / k; // ceil(n/k)
        }

        return totalHr;
    }

    private int getMax(int[] arr)
    {
        int max = 0;
        for(int x : arr)
        {
            if(x>max)
            {
                max = x;
            }
        }

        return max;
        // return Arrays.stream(arr).max().getAsInt();    
    }
}

// chatgpt help
class Solution2 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int start = 1;
        int end = getMax(piles);
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(getTotalHours(piles,mid,h))
            {
                end = mid-1;
            }
            else
            {  
               start = mid+1;
            }
        }

        return start;
    }

    private boolean getTotalHours(int[] arr, int k, int h)
    {
        long totalHr = 0;

         for (int n : arr) {
            totalHr += (n + k - 1) / k; // ceil(n/k)
        }

        return totalHr<=h;
    }

    private int getMax(int[] arr)
    {
        int max = 0;
        for(int x : arr)
        {
            if(x>max)
            {
                max = x;
            }
        }

        return max;   
    }
}