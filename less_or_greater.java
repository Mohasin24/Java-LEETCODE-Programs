
/* 
Problem Statement :- 
Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X 
and elements more than or equal to X. 

Example 1:

Input:
N = 7, X = 0
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 0 7
Explanation: There are no elements less or
equal to 0 and 7 elements greater or equal
to 0.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getMoreAndLess() 
which takes the array of integers arr, n and x as parameters and returns an array of size 2. 
pair denoting the answer. The first value is number of elements less than or equal to x and the second 
value is number of elements more than or equal to x.


*/

import java.lang.*;
import java.util.*;

public class less_or_greater {

    public static void main(String[] args) {
        int arr[] = { 3, 3, 3 };
        System.out.println(Arrays.toString(getMoreAndLess(arr, 3, 3)));
    }

    public static int[] getMoreAndLess(int[] arr, int n, int x) {

        int lessEqual = 0;
        int greaterEqual = 0;
        for (int i = 0; i < n; i++) {
            // if(arr[i]<x || arr[i] > x)
            // {
            if (arr[i] < x) {
                lessEqual++;
            } else if (arr[i] > x) {
                greaterEqual++;
            }
            // }
            else if (arr[i] == x) {
                greaterEqual++;
                lessEqual++;
            }
        }

        int brr[] = { lessEqual, greaterEqual };

        // System.out.println("Less = " + lessEqual + "Greater = " + greaterEqual);
        // System.out.println(Arrays.toString(brr));

        return brr;
    }

}
