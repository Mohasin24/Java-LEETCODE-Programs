/* 
Problem statement :- 
Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.


Example 1:

Input : 
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5 
Explanation :
The output three elements have two or
more greater elements.
*/
import java.lang.*;
import java.util.*;

public class At_least_two_greater_elements {
    public static void main(String arg[]) {
        long arr[] = { -1,-5,-4,5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(findElements(arr, arr.length)));
    }

    public static long[] findElements(long a[], long n) {
        // Your code goes here

        long arr[] = new long[(int) (n - 2)];

        // selection sort
        // for(int i = 0; i<n; i++)
        // {
        // int small = i;

        // for(int j =i+1; j<n;j++)
        // {
        // if(a[j]<a[small])
        // {
        // small = j;
        // }
        // }

        // long temp = a[small];
        // a[small] = a[i];
        // a[i] = temp;
        // }

        // Bubble sort

        // for(int i = 0; i<n-1;i++)
        // {
        // for(int j = 1; j<n-i; j++)
        // {
        // if(a[j-1]>a[j])
        // {
        // long temp = a[j-1];
        // a[j-1] = a[j];
        // a[j] = temp;
        // }
        // }
        // }

        Arrays.sort(a);

        for (int i = 0; i < (n - 2); i++) {

            arr[i] = a[i];
        }
        return arr;
    }
}
