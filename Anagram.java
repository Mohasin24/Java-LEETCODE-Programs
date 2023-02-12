
/* 
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
*/
import java.lang.*;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String a = "allergy";
        String b = "allergi";

        boolean iRet = isAnagram(a, b);

        System.out.println(iRet);
    }

    public static boolean isAnagram(String a, String b) {
        // Your code here

        if(a.length()!=b.length())
        {
            return false;
        }
        else
        {
            char ch1[] = a.toCharArray();
            char ch2[] = b.toCharArray();
                
            Arrays.sort(ch1);
            Arrays.sort(ch2);
                
            for(int i = 0; i<a.length(); i++)
            {   
                if(ch1[i]!=ch2[i])
                {
                    return false;
                }
            }
            return true;   
        }
    }
}
