/* 
Problem Statement :
You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.
 

Example 1:

Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".
Example 2:

Input: s = "erase*****"
Output: ""
Explanation: The entire string is removed, so we return an empty string.
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters and stars *.
The operation above can be performed on s.
*/

import java.util.Stack;
public class Removing_Stars_From_a_String_2390 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        System.out.println(sl.removeStars("leet**cod*e"));

        Solution1 sl1 = new Solution1();

        System.out.println(sl1.removeStars("leet**cod*e"));
    }    
}

// using stack
class Solution {
    public String removeStars(String s) 
    {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++)    
        {   
            char c = s.charAt(i);
            if(c!='*')
            {
                st.push(c);
            }
            else
            {
                st.pop();
            }
        }

        StringBuilder iRet = new StringBuilder();

        for(int i = 0; i<st.size(); i++)
        {
            iRet.append(st.get(i));
        }
        return iRet.toString();
    }
}

// more optimized method
class Solution1 {
    public String removeStars(String s) {
        int len = s.length();
        char[] chars = new char[len];
        int index = len, count = 0;

        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    chars[--index] = c;
                }
            }
        }
        return String.valueOf(chars, index, len - index);
    }
}
