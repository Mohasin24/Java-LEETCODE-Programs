/*               
Problme Statment :                       
Given two binary strings a and b, return their sum as a binary string.
                         
                                             
                               
Example 1:                               
                             
Input: a = "11", b = "1"
Output: "100"               
Example 2:        

Input: a = "1010", b = "1011"                                                     
Output: "10101"
 
             
Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/
                 
public class Add_Binary_67 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        System.out.println(sl.addBinary("1010", "1011"));
    }    
}

class Solution 
{
    public String addBinary(String a, String b) 
    {
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while(l1 >= 0 || l2 >= 0)
        {
            if(l1 >= 0)
            {
                carry += a.charAt(l1) - '0';
                l1--;
            }

            if(l2 >= 0)
            {
                carry += b.charAt(l2) - '0';
                l2--;
            }

            sb.append(carry%2);
            carry /= 2;
        }
        
        if(carry > 0)
        {
            sb.append(carry);
        }

        // int n = sb.length();

        // for(int i = 0; i<n/2; i++)
        // {
        //     char temp = sb.charAt(i);
        //     sb.setCharAt(i, sb.charAt(n-i-1));
        //     sb.setCharAt(n-i-1, temp);
        // }

        for(int i = sb.length()-1; i>=0; i--)
        {
            sb.append(sb.charAt(i));
            sb.delete(i, i+1);
        }

        // sb.reverse();
        
        return sb.toString();
    }
}
