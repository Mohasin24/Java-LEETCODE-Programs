/* 
Problem Statement :
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 

Constraints:

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
*/


public class Find_Smallest_Letter_Greater_Than_Target_744 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.nextGreatestLetter(new char[] {'c','f','j'}, 'c'));
    }    
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;

        while(s<=e)
        {
            int m = s + (e-s)/2;

            if(letters[m]>target)
            {
                e = m-1;
            }
            else
            {
                s = m+1;
            }
        }


        return letters[s%letters.length];
    }
}

class Solution2 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = letters.length;
        char c = '\0';
        int s = 0;
        int e = l-1;

        while(s<=e)
        {
            int m = s + (e-s)/2;

            if(letters[m]>target)
            {
                if(c=='\0')
                {
                    c = letters[m];
                }
                else if(letters[m]<c)
                {
                    c = letters[m];
                }
                e = m-1;
            }
            else
            {
                s = m+1;
            }
        }

        if(c=='\0')
        {
            return letters[0];
        }

        return c;
    }
}
