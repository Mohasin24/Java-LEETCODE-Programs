/* 
Problem Statement :- 
Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater 
than the given value. If such a subarray do not exist return 0 in that case.

Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of 
a[i] (from 1 to N).

Example 1:

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}
*/

import java.lang.*;
import java.util.*;

public class Smallest_subarray_with_sum_greater_than_x {
    public static void main(String[] args) 
    {
        int A[] = {1, 4, 45, 6, 0, 19};

        int iRet = smallestSubWithSum(A, A.length, 51);

        System.out.println(iRet);
    }

    public static int smallestSubWithSum(int a[], int n, int x) 
    {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;

            for (int j = i; j < n; j++) {
                sum += a[j];
                count++;
                if (sum > x) {

                    if (count < cnt || cnt == 0) {
                        cnt = count;
                    }

                    break;
                }
            }
        }

        return cnt;
    }
}
