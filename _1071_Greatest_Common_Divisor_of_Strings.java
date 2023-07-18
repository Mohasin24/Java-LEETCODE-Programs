/*
Problem Statement :
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
*/

public class _1071_Greatest_Common_Divisor_of_Strings 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        SolutionRec sl2 = new SolutionRec();

        System.out.println(sl.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(sl2.gcdOfStrings("ABCABC", "ABC"));
    }    
}

// recursive solution
// class SolutionRec {
//     public String gcdOfStrings(String str1, String str2) 
//     {
//         if(str1.length() < str2.length())    
//         {
//             return gcdOfStrings(str2,str1);
//         }
//         else if(!str1.startsWith(str2))
//         {
//             return "";
//         }
//         else if(str2.isEmpty())
//         {
//             return str1;
//         }
//         else
//         {
//             return gcdOfStrings(str1.substring(str2.length()),str2);
//         }
//     }
// }

class SolutionRec {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        
        if (!str1.startsWith(str2)) {
            return "";
        }
        
        if (str2.isEmpty()) {
            return str1;
        }
        
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }
}


class Solution {
    public String gcdOfStrings(String str1, String str2) 
    {
        if(!(str1+str2).equals((str2+str1)))
        {
            return "";
        }
        int len = gcd(str1.length(), str2.length());

        return str2.substring(0,len);
    }

    // gcd(x,y) = gcd(y,x%y)
    private int gcd(int x, int y)
    {
        while(x%y!=0)
        {
            int rem = x%y;
            x = y;
            y = rem;
        }

        return y;
    }
}