/* 
Problem Statement :
A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

 

Example 1:

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
Example 2:

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
Example 3:

Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
 

Constraints:

1 <= s.length <= 105
s[i] is either '(' or ')'.
s is a valid parentheses string.
*/

import java.util.Stack;
import java.util.ArrayDeque;

public class Remove_Outermost_Parentheses_1021 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        System.out.println("Solution : " + sl.removeOuterParentheses("(()())(())"));

        SolutionStack slStack = new SolutionStack();

        System.out.println("SolutionStack : " + slStack.removeOuterParentheses("(()())(())"));

        SolutionArrayDeque slDeque = new SolutionArrayDeque();

        System.out.println("SolutionArrayDeque : "+ slDeque.removeOuterParentheses("(()())(())"));
    }    
}

class Solution {
    public String removeOuterParentheses(String s) 
    {
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(c=='(' && cnt++ > 0)
            {
                sb.append(c);
            }
            else if(c==')' && cnt-- > 1)
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

class SolutionStack {
    public String removeOuterParentheses(String s) 
    {
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

         for(int i=0;i<s.length();i++)
         {
             char ch = s.charAt(i);             
             if(ch == '('){                         
                 if(!st.isEmpty()){            
                     sb.append(ch);
                 }
                 st.push(ch);                  
             }else{
                 st.pop();
                 if(!st.isEmpty()){
                     sb.append(ch);
                 }
             }
         }
        return sb.toString();
    }
}

class SolutionArrayDeque {
    public String removeOuterParentheses(String s)
    {
        ArrayDeque<Character> ad = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++)    
        {
            char c = s.charAt(i);

            if(c == '(')
            {
                if(!ad.isEmpty())
                {
                    sb.append(c);
                }
                ad.offerLast(c);
            }
            else
            {
                ad.pollLast();

                if(!ad.isEmpty())
                {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}