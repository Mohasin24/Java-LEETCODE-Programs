/* 
Problem Statement :
You're given strings jewels representing the types of stones that are jewels, 
and stones representing the stones you have. Each character in stones is a 
type of stone you have. You want to know how many of the stones you have 
are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone 
from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

*/

import java.lang.*;

public class Jewel_stone_771 
{
    public static void main(String[] args) 
    {
        String jewel = "aA";
        String stones = "aAAbbbb";
        
        Solution sl = new Solution();

        System.out.println(sl.numJewelsInStones(jewel, stones));
    }    
}

class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count = 0;

        // for(int i = 0; i<stones.length(); i++)
        // {
        //     if(jewels.indexOf(stones.charAt(i)) != -1)
        //     {
        //         count++;
        //     }
        // } 

        // using for-each loop
        for(char c : stones.toCharArray())
        {
            if(jewels.indexOf(c) != -1)
            {
                count++;
            }
        }  
        return count; 
    }
}