/* 
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

 

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
*/

import java.lang.*;

public class truncate
{
    public static void main(String[] args) 
    {
        String s = "Hello how are you Contestant";
        int n=4;

        Solution obj = new Solution();

        String iRet = obj.truncateSentence(s, n);
        System.out.println(iRet);
    }

    
}

class Solution
{
    public String truncateSentence(String s, int k) 
    {   

        StringBuilder sb = new StringBuilder();
        String srt = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {   // decrement k
                k--;
            }
            
            if(k==0)
            {
                break;
            }

            // sb.append(s.charAt(i));
            srt = srt + s.charAt(i);
        }

        
        // return sb.toString();

        return srt;


        // String srt = "";
        // int cnt = 0;
        // for(int i = 0; i<k; i++)
        // {   
        //     // if(cnt==s.length())
        //     // {
        //     //     break;
        //     // }
        //     for(int j = cnt; j<s.length(); j++)
        //     {
        //         if(s.charAt(j)==' ')
        //         {   
        //             srt = srt + "_"; 
        //             cnt++;
        //             break;
        //         }
        //         else
        //         {
        //             // System.out.println(s.charAt(j));
        //             srt = srt + s.charAt(j);
        //             cnt++;
        //         }
        //     }
        // }

        // if(srt.endsWith(" "))
        // {
        //     return srt.substring(0, srt.length()-1);
        // }
        // return srt;


       
    }
}