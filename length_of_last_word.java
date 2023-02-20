/* 
Problem Statement :
Given a string s consisting of words and spaces, return the length of 
the last word in the string.

A word is a maximal 
substring
consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/

import java.lang.*;

public class length_of_last_word 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.lengthOfLastWord("Hello World     "));
    }    
}

class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int cnt = 0;
        StringBuilder str = new StringBuilder(s.trim());

        for(int i = (str.length()-1); i>=0; i--)
        {
            if(str.charAt(i)==' ')
            {
                break; 
            }
            else 
            {
                cnt++;
            }
        }
        return cnt;
    }
}   
