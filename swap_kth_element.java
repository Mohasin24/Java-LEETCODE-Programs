/* 
Problem Statement :- 
Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.

Example 1:

Input:
N = 8, K = 3
Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
Output: 1 2 6 4 5 3 7 8
Explanation: Kth element from beginning is
3 and from end is 6.
*/
import java.lang.*;
import java.util.*;

public class swap_kth_element 
{
    public static void main(String arg[])    
    {
        int Arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int K = 3;
        swapKth(Arr, Arr.length, K);
        System.out.println(Arrays.toString(Arr));
    }

    public static void swapKth(int arr[], int n, int k) {
        int temp = arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
    }
}

