/* 
Problem Statement :
You are given a string s and an integer array indices of the same length. 
The string s will be shuffled such that the character at the ith position 
moves to indices[i] in the shuffled string.

Return the shuffled string.

Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*/
import java.lang.*;
import java.util.*;

public class Shuffle_string 
{   
    public static void main(String[] args) 
    {   
        String s = "hasinmo";
        int indices[] = {2,3,4,5,6,0,1};

        Solution obj = new Solution();

        System.out.println(obj.restoreString(s, indices));    
    }
    
}

class Solution 
{   
    public String restoreString(String s, int[] indices) 
    {
        StringBuilder sb = new StringBuilder("");
        sb.setLength(indices.length);

        for(int i = 0; i<indices.length; i++)
        {
            char c = s.charAt(i);

            sb.setCharAt(indices[i], c);
        }

        return (sb.toString());
    }    
}
