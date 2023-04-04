import java.util.Arrays;

/* 
Problem Statement :
Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.

 

Example 1:

Input: s = "abacaba"
Output: 4
Explanation:
Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
It can be shown that 4 is the minimum number of substrings needed.
Example 2:

Input: s = "ssssss"
Output: 6
Explanation:
The only valid partition is ("s","s","s","s","s","s").
 

Constraints:

1 <= s.length <= 105
s consists of only English lowercase letters.
*/

public class Optimal_Partition_of_String_2405 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.partitionString("ssssss"));
    }
}

// optimized
class Solution {
    public int partitionString(String s) {
        int n = s.length();
        int cnt = 1;

        boolean elem[] = new boolean[26];

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (elem[c - 'a']) {
                Arrays.fill(elem, false);
                elem[c - 'a'] = true;
                cnt++;
            } else {
                elem[c - 'a'] = true;
            }
        }

        return cnt;
    }
}

// brute force
class Solution1 {
    public int partitionString(String s) {
        int n = s.length();
        int cnt = 1;
        StringBuilder sub = new StringBuilder();

        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) + "";
        }

        for (int i = 0; i < s.length(); i++) {

            if (sub.indexOf(arr[i]) != -1) {
                sub = new StringBuilder();
                cnt++;
            }
            sub.append(s.charAt(i));
        }

        return cnt;
    }
}

// some sort of optimized
class Solution2 {
    public int partitionString(String s) {
        int cnt = 1;
        String sub = new String();

        for (int i = 0; i < s.length(); i++) {
            if (sub.indexOf(s.charAt(i)) != -1) {
                sub = new String();
                cnt++;
            }
            sub += s.charAt(i);
        }

        return cnt;
    }
}