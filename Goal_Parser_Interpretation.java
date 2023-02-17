/*
Problem Statement :
You own a Goal Parser that can interpret a string command. The command consists
of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will 
interpret "G" as the string "G", "()" as the string "o", and "(al)" as the 
string "al". The interpreted strings are then concatenated in the original 
order.
Given the string command, return the Goal Parser's interpretation of command.

Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

*/

import java.lang.*;

public class Goal_Parser_Interpretation 
{
    public static void main(String[] args) 
    {
        String str = "G()(al)";
        
        Solution sl = new Solution();

        String iRet = sl.interpret(str);

        System.out.println(iRet);
    }
}

class Solution {
    public String interpret(String command) 
    {   
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<command.length(); i++)
        {
            if(command.charAt(i)=='G')
            {
                sb.append("G");
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                sb.append("o");
                i++;
            }
            else
            {
                sb.append("al");
                i = i+3;
            }
        }  

        return sb.toString();  
    }
}
