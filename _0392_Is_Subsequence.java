/* 
Problem Statement :
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 
*/

public class _0392_Is_Subsequence 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.isSubsequence("abc", "ahbgdc"));
    }    
}

// Time complexity: O(m+n)
// where m = s.length() & n = t.length()
// Space complexity: O(1)

class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        // Initialize pointers for string s (sp) and string t (tp)
        int sp = 0; // Pointer for string s
        int tp = 0; // Pointer for string t

        // Iterate through both strings while there are characters left to check
        while (sp < s.length() && tp < t.length())    
        {
            // Compare characters at the current positions of sp and tp
            if (s.charAt(sp) == t.charAt(tp))
            {
                sp++; // Move the pointer for string s if characters match
            }
            tp++; // Move the pointer for string t in every iteration
        }

        // Check if the entire string s has been matched as a subsequence
        return sp == s.length();
    }
}
