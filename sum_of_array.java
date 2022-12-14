/*
Problem Statement :- Given an integer array Arr[] of size N. The task is to find sum of it.

Example 1:

Input:
N = 4
Arr[] = {1, 2, 3, 4}
Output: 10
Explanation: 1 + 2 + 3 + 4 = 10.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 7
Explanation: 1 + 3 + 3 = 7.
Your Task:
Complete the function sum() which takes array arr and single integer n, as input parameters and returns an integer denoting the answer. 
You don't to print answer or take inputs.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= Arr[i] <= 104
*/

import java.lang.*;
import java.util.*;

public class sum_of_array {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
        int iRet = 0, iSize = 0;
        System.out.print("Enter array size :  ");
        iSize = sc.nextInt();

        int Arr[] = new int[iSize];

        for(int i = 0; i<iSize; i++)
        {
            System.out.print("Enter array element at index " + i + " :-  ");
            Arr[i]=sc.nextInt();
        }

        iRet = arraySum(Arr, iSize);

        System.out.println("The sum of array "+Arrays.toString(Arr) + " is :-  "+iRet);
    }
    
    public static int arraySum(int arr[],int n)
    {
        int sum = 0;

        for(int i = 0; i<n; i++)
        {
            sum = sum+arr[i];
        }

        return sum;
    }
}
