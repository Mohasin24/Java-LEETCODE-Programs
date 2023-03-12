import java.util.Arrays;

/* 
Problem Statement :
You are given a positive integer num consisting of exactly four digits. 
Split num into two new integers new1 and new2 by using the digits found in num. 
Leading zeros are allowed in new1 and new2, and all the digits found in num must 
be used.

For example, given num = 2932, you have the following digits: two 2's, one 9 
and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9]
 and [2, 329].
Return the minimum possible sum of new1 and new2.

Example 1:

Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
Example 2:

Input: num = 4009
Output: 13
Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
 

Constraints:

1000 <= num <= 9999
*/

public class Sum_after_splitting_digits_2160 
{
    public static void main(String arg[])    
    {
        Solution sl = new Solution();
        System.out.println(sl.minimumSum(2687));
    }
}

class Solution {
    public int minimumSum(int num) 
    {   
        int n = 4;
        int a[] = new int[n];

        int k = 0;
        while(num>0 && k<n)
        {
            a[k] = num%10;
            num /= 10;
            k++;
        }   

        // Arrays.sort(a);

        for(int i = 0; i<n-1; i++)
        {
            for(int j = 1; j<n-i;j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

        return ((a[0]*10) + a[3]) + ((a[1]*10) + a[2]);
    }
}