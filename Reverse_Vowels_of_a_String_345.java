/* 
Problem Statement :
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

public class Reverse_Vowels_of_a_String_345 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.reverseVowels("LeetcOde"));
    }    
}

class Solution {
    public String reverseVowels(String s) 
    {
        StringBuilder vowel = new StringBuilder();

        for(char x : s.toCharArray())
        {
           if(x == 'a' || x == 'A' || x == 'e' || x == 'E' || x == 'i' || x == 'I' || x == 'o' || x == 'O' || x == 'u' || x == 'U')
           {
               vowel.append(x);
           } 
        }

        for(int i = vowel.length()-1; i>=0; i--)
        {
           vowel.append(vowel.charAt(i));
           vowel.delete(i,i+1);
        }

        StringBuilder sb = new StringBuilder();

        int i = 0;

        for(char x : s.toCharArray())
        {
            if(x == 'a' || x == 'A' || x == 'e' || x == 'E' || x == 'i' || x == 'I' || x == 'o' || x == 'O' || x == 'u' || x == 'U')
            {
                sb.append(vowel.charAt(i++));
            }
            else
            {
                sb.append(x);
            }
        }

        return sb.toString();
    }
}












