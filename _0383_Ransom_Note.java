/* 
Problem Statement :
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/

import java.util.HashMap;

public class _0383_Ransom_Note 
{
    public static void main(String[] args) 
    {
        Solution1 sl = new Solution1();
        
        boolean res = sl.canConstruct("aa", "aab");

        System.out.println(res);
    }    
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int[] alph = new int[26];

        for(char c : magazine.toCharArray())    
        {
            alph[c-'a']++;
        }

        for(char c : ransomNote.toCharArray())    
        {
            if(alph[c-'a']==0)
            {
                return false;
            }
            else
            {
                alph[c-'a']--;
            }
        }

        return true;
    }
}

class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(Character c : magazine.toCharArray())    
        {
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for(Character c : ransomNote.toCharArray())
        {
        
            if(!hm.containsKey(c) || hm.get(c)==0)
            {
                return false;
            }
            
            hm.put(c, hm.get(c)-1);
        }


        return true;
    }
}
