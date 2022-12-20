/* 
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*/

import java.lang.*;
import java.util.*;

public class missing_number 
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        int N = 10;
        int arr[] = {6,1,2,8,3,4,7,10,5};

        iRet = MissingNumber(arr, N);

        System.out.println("The missing number in the above array is : "+iRet);
    }

    public static int MissingNumber(int array[], int n) 
    {   
        // here sum of first N numbers is calculated and it is substarcted sum of all 
        // the array elements
        int sumOfN = n*(n+1)/2;  
        
        for(int i =0; i<(n-1); i++)
        {
            sumOfN = sumOfN - array[i];
        }
        
        return sumOfN;
    }
}
