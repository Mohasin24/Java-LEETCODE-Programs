/* 
Problem Statement :
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

import java.util.Stack;
public class Valid_Parentheses_20 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.isValid("()[]{}"));
    }    
}

class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();

        for(Character c : s.toCharArray())    
        {
            if(st.isEmpty() && (c=='}' || c==']' || c== ')'))
            {
                return false;
            }

            switch(c)
            {
                case '{' :
                case '(' :
                case '[' :
                    st.push(c);
                    break; 
                case '}' :
                    if(!st.isEmpty() && st.pop()=='{')
                    {
                        continue;
                    }    
                    else
                    {
                        return false;
                    }
                    
                case ')' :
                    if(!st.isEmpty() && st.pop()=='(')
                    {
                        continue;
                    }    
                    else
                    {
                        return false;
                    }
                   
                case ']' :
                    if(!st.isEmpty() && st.pop()=='[')
                    {
                        continue;
                    }    
                    else
                    {
                        return false;
                    }
                          
            }
        }

        return st.isEmpty();
    }
}