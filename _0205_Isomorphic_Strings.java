/* 
Problem Statement :
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
*/

import java.util.Map;
import java.util.HashMap;

public class _0205_Isomorphic_Strings 
{
    public static void main(String[] args) {
       Solution sl = new Solution();
       System.out.println(sl.isIsomorphic("egg","add")); 
    }    
}

// Complexity
// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Check if the lengths of strings s and t are not equal, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Maps to store character-to-character mappings for both s to t and t to s
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        // Iterate through the characters of both strings s and t
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i); // Current character in string s
            char tChar = t.charAt(i); // Current character in string t

            // Check if there's already a mapping from sChar to tChar and it doesn't match
            if (sToT.containsKey(sChar) && sToT.get(sChar) != tChar) {
                return false;
            } else {
                // Update the mapping from sChar to tChar
                sToT.put(sChar, tChar);
            }

            // Check if there's already a mapping from tChar to sChar and it doesn't match
            if (tToS.containsKey(tChar) && tToS.get(tChar) != sChar) {
                return false;
            } else {
                // Update the mapping from tChar to sChar
                tToS.put(tChar, sChar);
            }
        }

        // If no issues with mappings are found, the strings are isomorphic
        return true;
    }
}
