/* 
Problem statement :
For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.

Example 1:

Input:
5
1 2 3 4 5
Output:
15 3.00 
Explanation:
Sum of the array is 15, hence 
average is 15/5=3.00. 
*/

import java.lang.*;
import java.util.*;

public class calculate_avg_two_decimal 
{   
    public static void main(String[] args) 
    {
        int Arr[] = {854, 88, 96, 48, 555, 695, 789, 266, 2, 33, 45, 66};

        String iRet = average(Arr,Arr.length);

        System.out.println(iRet);
    }
    public static String average(int A[], int N)
    {   
        int sum=0;
        for(int i = 0; i<N; i++)
        {
            sum =sum + A[i];
        }
        
        float average = (float)sum/N;
        String avg = String.format("%.2f",average);
        return avg;
    }    
}
