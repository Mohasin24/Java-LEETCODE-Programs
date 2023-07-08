/* 
Problem Statement :
A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 

Constraints:

1 <= s.length <= 1000
s[i] is either '(' or ')'.
*/

import java.util.Stack;

public class _0921_Minimum_Add_to_Make_Parentheses_Valid 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.minAddToMakeValid("((("));
    }    
}

class Solution {
    public int minAddToMakeValid(String s) 
    {
        if(s.length() == 0)
        {
            return 0;
        }

        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c == '(' || (!st.isEmpty() && st.peek() == ')'))
            {
                st.push(c);
            }
            else if(!st.isEmpty() && st.peek()=='(')
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }

        return st.size();
    }
}