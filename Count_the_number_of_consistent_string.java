/* 
Problem Statement :
You are given a string allowed consisting of distinct characters and an array of strings words. 
A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words. 

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
*/
import java.lang.*;
import java.util.*;

public class Count_the_number_of_consistent_string 
{
    public static void main(String[] args) 
    {   
        Solution sl = new Solution();    

        String words [] = {"ad","bd","aaab","baa","badab", "ab", "aaaa", "bbbb"};
        String allowed = "ab";

        int iRet = sl.countConsistentStrings_optimised(allowed, words);

        System.out.println(iRet);
    }
}

class Solution 
{   
    // not much optimised runtime 17ms
    public int countConsistentStrings(String allowed, String[] words) 
    {
        
        int cnt = 0;

        for(String str : words)
        {   
            boolean check = true;

            for(char c: str.toCharArray())
            {
                if(allowed.indexOf(c)==-1)
                {
                    check = false;
                    break;
                }
            }
            if(check==true)
            {
                cnt++;
            }
        }
        return cnt; 
    }

    // optimised solution with runtime 6ms
    public int countConsistentStrings_optimised(String allowed, String[] words) 
    {   
        int count[] = new int[26];
        
        int cnt = 0;

        for(char c : allowed.toCharArray())
        {
            count[c-'a'] = 1;
        }

        for(String s : words)
        {   
            boolean check = true;
            for(char c : s.toCharArray())
            {
                if(count[c-'a']==0)
                {
                    check = false;
                    break;
                }
            }

            if(check==true)
            {
                cnt++;
            }
        }

        return cnt; 
    }
}
