
/* 
Problem Statement :
Given two strings needle and haystack, return the index of the first occurrence 
of needle in haystack, or -1 if needle is not part of haystack.
 
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
*/
import java.lang.*;

public class find_index_of_first_occurance_string {
    public static void main(String[] args) {

    }
}

class Solution {
    public int strStr(String hst, String ndl) {
        int h = hst.length();
        int n = ndl.length();

        for (int i = 0; i <= h - n; i++) {
            int j = 0;

            while (j < n && (hst.charAt(i + j) == ndl.charAt(j))) {
                j++;
            }

            if (j == n) {
                return i;
            }
        }

        return -1;

    }
}

// half test cases passed
// class Solution {
// public int strStr(String hst, String ndl)
// {
// int i = 0, j=0,ind=-1;
// boolean check = false;
// int n = ndl.length();
// int h = hst.length();

// if(n>h)
// {
// return ind;
// }

// while(i<n && j<h)
// {
// while(j<h)
// {
// if(ndl.charAt(i)==hst.charAt(j))
// {
// check = true;
// ind = j-i;
// i++;
// j++;
// break;
// }
// else
// {
// if(check && (ndl.charAt(i)!=hst.charAt(j)))
// {
// check = false;
// i = 0;
// ind = -1;
// j--;
// break;
// }
// else
// {
// j++;
// }
// }
// }

// }

// return ind;

// }
// }