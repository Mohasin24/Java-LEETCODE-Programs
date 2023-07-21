/* 
Problem Statement :
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
substring
.

 

Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0
 

Constraints:

0 <= s.length <= 3 * 104
s[i] is '(', or ')'.
*/

import java.util.Stack;

public class _032_Longest_Valid_Parentheses 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.longestValidParentheses(  "(((()))())"));
    }    
}


class Solution {
    public int longestValidParentheses(String s) 
    {
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int max = 0;

        for(int i = 0; i<s.length(); i++)    
        {
            if(s.charAt(i) == '(')
            {
                st.push(i);
            }
            else
            {
                st.pop();

                if(st.isEmpty())
                {
                    st.push(i);
                }
                else
                {
                    int num = i - st.peek();
                    max = Math.max(max,num);
                }
            }
        }

        return max;
    }
}
