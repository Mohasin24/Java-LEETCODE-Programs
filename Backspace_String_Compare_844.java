/* 
Problem Statement :
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 

Follow up: Can you solve it in O(n) time and O(1) space?
*/

import java.util.Stack;

public class Backspace_String_Compare_844 
{   
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.backspaceCompare("ab#c", "ad#c"));
    }
}

class Solution {

    public boolean backspaceCompare(String s, String t) 
    {
        return removeBackSpace(s).equals(removeBackSpace(t)) ;
    }

    private String removeBackSpace(String str)
    {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)!='#')
            {
                st.push(str.charAt(i));
            }
            else if(!st.isEmpty())
            {
                st.pop();
            }
        }

        return st.toString();
    }
}