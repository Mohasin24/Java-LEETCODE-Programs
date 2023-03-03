/* 
Problem Statement :
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

 

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 

Constraints:

1 <= chars.length <= 2000
chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
*/
import java.lang.*;
import java.util.*;

public class string_compression 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        char[] c = {'a','a','b','b','c','c','c'};
        System.out.println(sl.compress(c));
        System.out.println(Arrays.toString(c));
    }   

}

// best optimized solved
class Solution {
    public int compress(char[] c) {
      
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        int i,j;
        for (i = 1; i < c.length; i++) {
            if (c[i - 1] == c[i]) {
                cnt++;
            } else {
                sb = sb.append(c[i - 1]);

                if (cnt > 1) {
                    sb = sb.append(String.valueOf(cnt));
                }
                cnt = 1;
            }
        }

        sb = sb.append(c[i - 1]);

        if (cnt > 1) {
            sb = sb.append(String.valueOf(cnt));
        }
        

        for (j = 0; j < sb.length(); j++) {
            c[j] = sb.charAt(j);
        }

        return j;
    }
}

class Solution2 {
    public int compress(char[] c) {
        int n = c.length;
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        int i,j;
        for (i = 1; i < n; i++) {
            if (c[i - 1] == c[i]) {
                cnt++;
            } else {
                sb = sb.append(c[i - 1]);

                if (cnt > 1) {
                    sb = sb.append(String.valueOf(cnt));
                }
                cnt = 1;
            }
        }

        sb = sb.append(c[i - 1]);

        if (cnt > 1) {
            sb = sb.append(String.valueOf(cnt));
        }
        

        for (j = 0; j < sb.length(); j++) {
            c[j] = sb.charAt(j);
        }

        return j;
    }
}

class Solution3 
{
    public int compress(char[] c)  
    {
        int n = c.length;
        int cnt = 1;                   
        StringBuilder sb = new StringBuilder();
        int i;
        for(i = 1; i<n; i++)
        {
            if(c[i-1]==c[i])
            {
                cnt++;
            }
            else
            {
                sb = sb.append(c[i-1]);

                if(cnt>1)
                {
                    sb = sb.append(String.valueOf(cnt));
                }
                cnt = 1;
            }
        }

    
           sb = sb.append(c[i-1]);

                if(cnt>1)
                {
                    sb = sb.append(String.valueOf(cnt));
                }
                cnt = 1;
            

  

        for(int j = 0; j<sb.length(); j++)
        {
            c[j] = sb.charAt(j);
        }

        return sb.length();
    }
    
}

class Solution4
{
    public int compress(char[] c)  //'0 a','1 a','2 b','3 b','4 c','5 c','6 c'
    {
        int n = c.length;
        int cnt = 1;            //cnt = 3       i = 7           s=a2b2c3        
        String s = "";
        int i;
        for(i = 1; i<n; i++)
        {
            if(c[i-1]==c[i])
            {
                cnt++;
            }
            else
            {
                s = s+c[i-1];

                if(cnt>1)
                {
                    s = s+ String.valueOf(cnt);
                }
                cnt = 1;
            }
        }

    
        s = s + c[i - 1];

        if (cnt > 1) {
            s = s + String.valueOf(cnt);
        }

  

        for(int j = 0; j<s.length(); j++)
        {
            c[j] = s.charAt(j);
        }

        return s.length();
    }
    
}


// best optimized refered
class Solution5 {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) {
            return 1;
        }
        
        int i = 0, j = 0;
        while (i < n) {
            int count = 1;
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            
            chars[j++] = chars[i++];
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int k = 0; k < countStr.length(); k++) {
                    chars[j++] = countStr.charAt(k);
                }
            }
        }
        
        return j;
    }
}