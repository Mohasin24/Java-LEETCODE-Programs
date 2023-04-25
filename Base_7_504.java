/*
Problem Statment :
Given an integer num, return a string of its base 7 representation.

 

Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"
 

Constraints:

-107 <= num <= 107 
*/

public class Base_7_504
{
    public static void main(String[] args) 
    {
       Solution3 sl = new Solution3();
   
       System.out.println(sl.convertToBase7(-7));
     
    }
}

class Solution {
    public String convertToBase7(int num) 
    {
        int rem = 0;
        StringBuilder sb = new StringBuilder();
        boolean neg = false;

        if(num<0)
        {
            neg = true;
            num = Math.abs(num);
        }

        while(num>0)
        {
            rem = num%7;
            
            num /= 7;
            sb.append(rem);
        }
        
        sb.reverse();
        
        if(neg)
        {
            sb.insert(0, '-');
        }
        return sb.toString();
       
    }
}
class Solution2 {
    public String convertToBase7(int num) 
    {
        int rem = 0;
        StringBuilder sb = new StringBuilder();
        boolean neg = false;

        if(num==0)
        {   
            return sb.append(rem).toString();
        }

        if(num<0)
        {
            neg = true;
            num = -(num);
        }

        while(num>0)
        {
            rem = num%7;
            
            num /= 7;
            sb.append(rem);
        }

        int len = sb.length();

        // more optimised
        for(int i = 0; i<len/2; i++)
        {
            char c = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(len-1-i));
            sb.setCharAt((len-1-i),c);
        }

        // not optimised
        // for(int i = len-1; i>=0; i--)
        // {
        //     sb.append(sb.charAt(i));
        //     sb.delete(i,i+1);
        // }
        
        if(neg)
        {
            sb.insert(0, '-');
        }
        return sb.toString();
    }
}

class Solution3 {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        while(Math.abs(num) > 6) {
            sb.append(num % 7);
            num = num / 7;
        }
        if (num < 0) {
            sb.append(Math.abs(num)).append("-");
        } else {
            sb.append(num);
        }
        // for (int i = 0; i < sb.length() - 1; i++) {
        //     if (!Character.isDigit(sb.charAt(i))) {
        //         sb.replace(i, i + 1, "");
        //     }
        // }
        return sb.reverse().toString();
    }
}