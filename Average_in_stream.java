/* 
Problem statement :
Given a stream of incoming numbers, find average or mean of the stream at every point.

Example 1:

Input:
n = 5
arr[] = {10, 20, 30, 40, 50}
Output: 10.00 15.00 20.00 25.00 30.00 
Explanation: 
10 / 1 = 10.00
(10 + 20) / 2 = 15.00
(10 + 20 + 30) / 3 = 20.00
And so on.
*/

import java.lang.*;
import java.util.*;

public class Average_in_stream 
{
    public static void main(String[] args) 
    {
        int Arr[] = {39, 72, 44, 66, 57, 70, 63, 91, 70, 77, 12, 80, 56, 10, 80, 72, 37, 88, 73, 84, 61, 41, 57, 26, 37, 7};

        float iRet[] = streamAvg(Arr, Arr.length);

        for(int i = 0; i<iRet.length; i++)
        {
            System.out.print(String.format("%.2f  ", iRet[i]));
        }
        
    }

    public static float[] streamAvg(int[] arr, int n) {
        // code here
        
        float avg[] = new float[n];
        int sum = 0;
        for(int i =0; i<n; i++)
        {
            sum = sum + arr[i];
            avg[i] = (float)sum/(i+1);
        }
        
        return avg;
    }
}
