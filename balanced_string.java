/* 
Problem Statement :
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
*/

/*
Hints :
1. Loop from left to right maintaining a balance variable when it gets an L 
increase it by one otherwise decrease it by one.
2. Whenever the balance variable reaches zero then we increase the answer by one.
*/

import java.lang.*;

public class balanced_string 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.balancedStringSplit("RLRRLLRLRL"));
    }    
}

class Solution {
    public int balancedStringSplit(String s) 
    {
        int balance = 0, ans = 0;

        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)=='L')
            {
                balance++;
            }
            else
            {
                balance--;
            } 

            if(balance==0)
            {
                ans++;
            }
        }

         return ans;   
    }
}

// class Solution {
//     public int balancedStringSplit(String s) 
//     {
//         int balance = 0, ans = 0;

//         for(int i = 0; i<s.length(); i++)
//         {
//             balance = balance + ((s.charAt(i)=='L') ? +1: -1); 

//             if(balance==0)
//             {
//                 ans++;
//             }
//         }

//          return ans;   
//     }
// }
