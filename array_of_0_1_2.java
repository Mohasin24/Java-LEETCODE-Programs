/* 
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
*/
import java.lang.*;
import java.util.*;

public class array_of_0_1_2 {
    public static void main(String[] args) 
    {

        int arr[]= {0, 2, 1, 2, 0, 1, 0, 2, 2, 2, 1 };

        sort012(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    
    }

    public static void sort012(int a[], int n)
    {
        // array method
        // Arrays.sort(a);
        
        // bubble sort
        for(int i =0; i<(n-1); i++)
        {
            for(int j = 1; j<n; j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // selection sort
        // for(int i =0; i<n;i++)
        // {   
        //     int small = i;
        //     for(int j = i+1; j<n; j++)
        //     {
        //         if(a[small]>a[j])
        //         {
        //             small = j;
        //         }
        //     }
            
        //     int temp = a[i];
        //     a[i] = a[small];
        //     a[small] = temp;
        // }
    }
}
