/* 
Problem Statement :
Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:

Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 3:

Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
 
Constraints:

1 <= num <= 109
num does not contain 0 as one of its digits.
*/

import java.lang.*;

public class Count_the_Digits_That_Divide_a_Number_2520 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        System.out.println(sl.countDigits(77));
    }    
}

class Solution {
    public int countDigits(int num) 
    {
        int temp = num;
        int cnt = 0;

        if(num<10)
        {
            return 1;
        }

        while(temp >0)
        {
            int val = temp%10;

            if (val > 0) {
                if (num % val == 0) {
                    cnt++;
                }
            }

            temp= temp/10;
        }    

        return cnt;
    }
}
