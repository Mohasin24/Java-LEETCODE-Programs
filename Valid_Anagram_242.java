/* 
Problem Statement :
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class Valid_Anagram_242 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.isAnagram("anagram", "nagaram"));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alph = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alph[s.charAt(i) - 'a']++;
            alph[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alph.length; i++) {
            if (alph[i] > 0) {
                return false;
            }
        }

        return true;
    }
}
