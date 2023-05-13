/* 
Problem Statement :
You are given an integer array digits, where each element is a digit. The array may contain duplicates.

You need to find all the unique integers that follow the given requirements:

The integer consists of the concatenation of three elements from digits in any arbitrary order.
The integer does not have leading zeros.
The integer is even.
For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.

Return a sorted array of the unique integers.

 

Example 1:

Input: digits = [2,1,3,0]
Output: [102,120,130,132,210,230,302,310,312,320]
Explanation: All the possible integers that follow the requirements are in the output array. 
Notice that there are no odd integers or integers with leading zeros.
Example 2:

Input: digits = [2,2,8,8,2]
Output: [222,228,282,288,822,828,882]
Explanation: The same digit can be used as many times as it appears in digits. 
In this example, the digit 8 is used twice each time in 288, 828, and 882. 
Example 3:

Input: digits = [3,7,5]
Output: []
Explanation: No even integers can be formed using the given digits.
 

Constraints:

3 <= digits.length <= 100
0 <= digits[i] <= 9
*/

import java.util.*;


public class Finding_3_Digit_Even_Numbers_2094 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.findEvenNumbers(new int[]{2,1,3,0})));
    }    
}



class Solution {
    public int[] findEvenNumbers(int[] digits) 
    {
      // keep count of each integer
      int[] map = new int[10];

        for(int x : digits)
        {
            map[x]++;
        }
        
        ArrayList<Integer> al = new ArrayList<>();

        // sorting array to get the max and min element
        Arrays.sort(digits);

        // upper limit to limit the iteration
        int upperLimit = getUpperLimit(digits[digits.length-1]);
        // lower limit to start loop iteration
        int lowerLimit = digits[0]==0 ? 100 : digits[0]*100; 

        // checking each integer in between lower limit and upper limit if it satisfies given conditions or not. If true then add it to the arrayList
        for(int i = lowerLimit; i<=upperLimit; i = i+2)
        {
            if(checkDigit(i, map))
            {
                al.add(i);
            }
        }

        int len = al.size();

        int[] iRet = new int[len];

        for(int i = 0; i<len; i++)
        {
            iRet[i] = al.get(i);
        }

        return iRet;
    }

    private int getUpperLimit(int n)
    {   
      // this function returns the 3 digit upper limit 
      // Example if n = 8 then the return value will be 888
        int temp = n;
        for(int i = 0; i<2; i++)
        {
            temp = n + (temp*10);
        }

        return temp;
    }

    private boolean checkDigit(int n, int[] map)
    {
      // This function basically check if the occurance of individual digit in a nummber is not greater than the occurance of that digit in the digits array
      // for example [2,1,3,0] in this array every digit is occurred at once only but if the number 111 the digit 1 occurred 3 times so 111 is not the desired digit so this function will return false 
        int[] currentMap = new int[10];

        while(n>0)
        {
            currentMap[n%10]++;    
            n = n/10;
        }

        for(int i = 0; i<10; i++)
        {
            if(currentMap[i] > map[i])
            {
                return false;
            }
        }

        return true;
    }
}