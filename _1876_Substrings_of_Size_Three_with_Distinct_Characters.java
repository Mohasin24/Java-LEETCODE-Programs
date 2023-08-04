/*  Sliding Window
Problem Statement :
A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".
Example 2:

Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
 

Constraints:

1 <= s.length <= 100
s​​​​​​ consists of lowercase English letters.
*/

import java.util.HashSet;

public class _1876_Substrings_of_Size_Three_with_Distinct_Characters 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
       System.out.println( sl.countGoodSubstrings("aababcabc"));

    }    
}
class Solution {
    public int countGoodSubstrings(String s) 
    {
        int good = 0;
        for(int i = 0; i<=s.length()-3; i++)    
        {
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i+2)!=s.charAt(i))
            {
                good++;
            }
        }

        return good;
    }
}