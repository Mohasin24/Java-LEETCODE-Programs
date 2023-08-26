/* 
Problem Statement :
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/

public class _0125_Valid_Palindrome 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.isPalindrome("0P"));
    }    
}

class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c >='a' && c <='z' || c>='0' && c<='9')
            {
                sb.append(c);
            }
        }    

        System.out.println(sb.toString());

        return helper(sb.toString(), 0, sb.length()-1);
    }

    private boolean helper(String s, int l, int r)
    {
        if(l>=r)
        {
            return true;
        }

        if(s.charAt(l)!=s.charAt(r))
        {
            return false;
        }

        return helper(s,l+1,r-1);
    }
}