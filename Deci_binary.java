/*
Problem Statement :
A decimal number is called deci-binary if each of its digits is either 0 or 1 without 
any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.

Given a string n that represents a positive decimal integer, return the minimum number 
of positive deci-binary numbers needed so that they sum up to n.
 
Example 1:

Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32
Example 2:

Input: n = "82734"
Output: 8
Example 3:

Input: n = "27346209830709182346"
Output: 9
*/
import java.lang.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;


public class Deci_binary 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.minPartitions("239598965454233"));  
    }
}

class Solution {
    public int minPartitions(String n) 
    {
        int result = 0;

        for(int i = 0; i<n.length(); i++)
        {   

            // ascii code of 0 = 48 & 9 = 57

            // if((n.charAt(i)-'0')>result)
            // {
            //     result = n.charAt(i)-'0';
            //     System.out.println(n.charAt(i)-'0');
            // }

            //******** converting character to number **********

            // int num = Character.getNumericValue(n.charAt(i));

            // 48 - ascii  value of 0
            // int num  = (int)n.charAt(i)-48;    

            // int num  = Integer.parseInt(Character.toString(n.charAt(i)));    

            // if(num>result)
            // {
            //     result = num;
            // }
            
            
            
            
            
        } 

        // ******** another method : only finding number 9 to 0 max number 

        for(int i=9 ; i>=1 ; i--)
        {
           if(n.indexOf((char)(i+48)) != -1)
           {
             return i;
           } 
        }
            
               
        return result; 
    }
}


/* 

############# Logic Behind Solution  ################//#endregion

lets get a number : 2789

to convert this number into deci-binary number this number must contain only either 1 or 0

so to convert this to deci binary number we have to reduce it by only substracting 1 or 0 form
it until all the number become 0 and we have to keep count how many steps required

if number > 0 substract 1 and if number is = 0 substract 0

        2789
       -1111
       ------
        1678
       -1111
       ------
        0567
       -0111
       -----
        0456
       -0111
       -----
        0345
       -0111
       -----
        0234
       -0111
       -----
        0123
       -0111
       -----
        0012
       -0011
       -----
        0001
       -0001
       -----
        0000         

    Here, notice that from number 2789, in this number 9 is maximum number from each individual
    number and that much steps we have required for converting this number to deci-binary 
    number. Notice that only 9 become zero after all the number become zero's

    So, now we have to only find the greatest number from the given string and retuen it

*/