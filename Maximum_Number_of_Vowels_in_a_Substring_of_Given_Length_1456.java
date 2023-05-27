/* 
Problem Statement :
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length_1456 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.maxVowels("leetcode", 3));
        // sl.maxVowels("abciiidef", 3);
    }
}

// Sliding Window

class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int vow = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vow++;
            }
        }

        max = vow;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                vow--;
            }

            if (isVowel(s.charAt(i))) {
                vow++;
            }

            max = vow > max ? max = vow : max;
        }

        return max;
    }

    private boolean isVowel(char c) {
        switch (c) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
        }

        return false;
    }
}

class Solution1 {
    public int maxVowels(String s, int k) {
        int max = 0;
        int vow = 0;

        HashSet<Character> al = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < k; i++) {
            if (al.contains(s.charAt(i))) {
                vow++;
            }
        }

        max = vow;

        for (int i = k; i < s.length(); i++) {
            char winOut = s.charAt(i - k);
            char winIn = s.charAt(i);

            if (al.contains(winOut)) {
                vow--;
            }

            if (al.contains(winIn)) {
                vow++;
            }

            max = vow > max ? max = vow : max;
        }

        return max;
    }
}
