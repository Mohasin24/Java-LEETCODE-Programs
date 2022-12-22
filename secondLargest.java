/* 
Problem statement  :
Given an array Arr of size N, print second largest distinct element from an array.

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34. 
*/
import java.lang.*;
import java.util.*;

public class secondLargest 
{
    public static void main(String[] args) 
    {   
        int Arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(Arr.length);
        int iRet = print2largest(Arr, Arr.length);
        System.out.println(iRet);
    }   
    
    public static int print2largest(int arr[], int n) {
       
        // Arrays.sort(arr);  arrays method

        sortArr(arr);

        System.out.println(Arrays.toString(arr));
        int secondLarge = 0;
        for(int i = (n-1); i>=0; i--)
        {   
            if(arr[i]<arr[n-1])
            {
                secondLarge = arr[i];
                break;
            }
            else
            {
                secondLarge = -1;
            }
        }
        
        return secondLarge;
        
    }

    // bubble sort
    // public static void sortArr(int arr[])
    // {
    //     for(int i = 0; i<(arr.length-1);i++)
    //     {
    //         for(int j = 1; j<(arr.length-i);j++)
    //         {
    //             if(arr[j-1]>arr[j])
    //             {
    //                 int temp = arr[j-1];
    //                 arr[j-1] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }

    //selection sort
    public static void sortArr(int arr[])
    {
        for(int i = 0; i<(arr.length);i++)
        {   
            int smaller = i;
            for(int j = i+1; j<(arr.length);j++)
            {
                if(arr[smaller]>arr[j])
                {
                    smaller = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smaller];
            arr[smaller] = temp;
        }
    }
}
