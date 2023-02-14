/* 
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/
import java.lang.*;
import java.util.*;

public class Defanging_an_IP_Address 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        String iRet = sl.defangIPaddr("1.1.1.1");
        System.out.println(iRet);
    }    
}

class Solution {
    public String defangIPaddr(String address) 
    {   
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<address.length(); i++)
        { 
            if(address.charAt(i)=='.')
            {
                sb.append("[.]");
            }
            else
            {
                sb.append(address.charAt(i));
            }
        }   
        
        return sb.toString();


        // most optimised method
        // return address.replace(".", "[.]");
    }
}
