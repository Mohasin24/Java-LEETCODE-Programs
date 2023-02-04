/* 
Problem Statement :
Given two string arrays word1 and word2, return true if the two arrays represent 
the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order 
forms the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
*/

import java.lang.*;
import java.util.*;

class Test
{
    public static void main(String arg[])
    {
        String sArr1[] = {"abc", "d", "defg"};
        String sArr2[] = {"abcddefg"};

        Solution sObj = new Solution();

        System.out.println("Two string are : " + sObj.arrayStringsAreEqual(sArr1,sArr2));
        
    }
}

class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String s1="";
        String s2="";
        
        for(int i = 0; i<word1.length; i++)
        {
            s1 = s1 + word1[i];
        }
        
        for(int i = 0; i<word2.length; i++)
        {
            s2 = s2 + word2[i] ;
        }
        
        if(s1.equals(s2) )
        {
            return true;
        }
        
        return false;
    }
}