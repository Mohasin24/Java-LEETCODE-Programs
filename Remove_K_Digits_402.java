/* 
Problem Statement :
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

 

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 

Constraints:

1 <= k <= num.length <= 105
num consists of only digits.
num does not have any leading zeros except for the zero itself.
*/

import java.util.Stack;

public class Remove_K_Digits_402 
{
    public static void main(String arg[])    
    {
        Solution sl = new Solution();

        System.out.println(sl.removeKdigits("1234567890", 9));
    }
}

class Solution
{
    public String removeKdigits(String num, int k) 
    {
        StringBuilder sb = new StringBuilder();
        
        Stack<Character> st = new Stack<>();

        int len = num.length();

        if(k==len)
        {
            return "0";
        }

        for(int i = 0; i<len; i++)
        {
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i))
            {
                st.pop();
                k--;
            }
            
            st.push(num.charAt(i));
        }

        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
    
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }

        sb.reverse();

        while(sb.length()>1 && sb.charAt(0)=='0' )
        {
            sb.delete(0,1);
        }

        return sb.toString();
    }
}
