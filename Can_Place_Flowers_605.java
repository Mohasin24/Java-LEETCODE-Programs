/* 
Problem Statement :
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length
*/

import java.lang.*;
import java.util.*;

public class Can_Place_Flowers_605 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.canPlaceFlowers(new int[] {1,0,0,0,0,1}, 2));
    }
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = 0, next = 0;
        for(int i=0;i<flowerbed.length;i++)
        {
            if(n == 0)
            {
                break; 
            }

            if(flowerbed[i]==0)
            {

                if(i==flowerbed.length-1)
                {
                    next = 0;
                }
                else
                {
                    next = flowerbed[i+1];
                }

                if(i==0)
                {
                    prev = 0;
                }
                else 
                {
                    prev = flowerbed[i-1];
                }
                

                if(next==0 && prev==0)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }
        }

        if(n==0)
        {
            return true;
        }
        return false;
           
    }
}

class Solution2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     int count = 1;
     int result = 0;
 
     for(int i=0; i<flowerbed.length; i++) 
     {
         if(flowerbed[i] == 0) {
             count++;
         }
         else 
         {
             result += (count-1)/2;
             count = 0;
         }
     }
    
     result += count/2;    
 
     return (result>=n);
 }
 }