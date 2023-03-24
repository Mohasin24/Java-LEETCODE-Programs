/* 
Problem Statement :
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

 

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
 

Constraints:

1 <= num.length <= 104
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 104
*/
import java.lang.*;
import java.util.*;

public class Add_to_Array_Form_of_Integer_989 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        sl.addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9}, 1);
    }    
}

class Solution {
    public List<Integer> addToArrayForm(int[] a, int k)   
    {
        List<Integer> res = new ArrayList<>();

        int i = a.length-1;
        
        while(i>=0 || k>0)
        {
            if(i>=0)
            {
                k= (a[i]+k);  // k= a[9] + 1 = 9+1 = 10
                i--;          // i = 8
            }
            res.add(k%10);     // res.add(10%10) = res.add(0)
            k = k/10;             // k = k/10 = 10/10 = 1 
        } 
        
        Collections.reverse(res);

        return res;    
    }
}

class Solution2 {
    public List<Integer> addToArrayForm(int[] a, int k) 
    {
        List<Integer> res = new ArrayList<>();

        for(int i = a.length-1; i>=0; i--)
        {
            res.add((a[i]+k)%10);
            k = (a[i]+k)/10;
        }

        while(k>0)
        {
            res.add(k%10);
            k = k/10;
        }
        
        Collections.reverse(res);

        return res;    
    }
}  
