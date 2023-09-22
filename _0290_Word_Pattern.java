/*
Problem Statement :
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */

import java.util.Map;
import java.util.HashMap;

public class _0290_Word_Pattern     
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.wordPattern("abba", "dog cat cat dog"));
    }
}

// Complexity
// Time complexity: O(max(pLen, sLen))
// Space complexity:O(min(pLen, sLen))

class Solution {
    public boolean wordPattern(String p, String s) {
        int j = 0; // Index for string s
        int i = 0; // Index for pattern p
        
        int sLen = s.length(); // Length of string s
        int pLen = p.length(); // Length of pattern p

        // Maps to store character-to-word and word-to-character mappings
        Map<Character, String> pToS = new HashMap<>();
        Map<String, Character> sToP = new HashMap<>();

        while (i < pLen && j < sLen) {
            int k = j; // Index to traverse string s

            // Find the end of the current word in string s
            while (k < sLen && s.charAt(k) != ' ') {
                k++;
            }

            char pChar = p.charAt(i); // Current character in pattern p
            String t = "";

            // Extract the current word from string s
            if (j < k) {
                t = s.substring(j, k);
            }

            // Check and update the mappings for character-to-word
            if (pToS.containsKey(pChar) && !pToS.get(pChar).equals(t)) {
                return false;
            } else {
                pToS.put(pChar, t);
            }

            // Check and update the mappings for word-to-character
            if (sToP.containsKey(t) && sToP.get(t) != pChar) {
                return false;
            } else {
                sToP.put(t, pChar);
            }

            j = k + 1; // Move to the next character in string s
            i++;       // Move to the next character in pattern p
        }  

        // Ensure we've processed the entire pattern p and string s
        return j >= sLen && i >= pLen;
    }
}
