
/* 
Problem Statement :-
Given an unsorted array Arr[] of N integers and a Key which is present in this array. 
You need to write a program to find the start index( index where the element is first found from left in the array ) 
and end index( index where the element is first found from right in the array ).If the key does not exist in the array 
then return -1 for both start and end index in this case.

Example 1:

Input:
N = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
Key = 5
Output:  4 5
Explanation:
5 appears first time at index 4 and
appears last time at index 5.
(0 based indexing)
*/
import java.lang.*;
import java.util.*;

public class find_index {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5 };
        int Key = 5;
        int N = 6;

        int crr[] = findIndex(arr, N, Key);

        System.out.println(Arrays.toString(crr));
    }

    public static int[] findIndex(int a[], int N, int key) {
        int brr[] = new int[2];

        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                brr[0] = i;
                break;
            } else {
                brr[0] = -1;
            }
        }

        for (int i = (N - 1); i >= 0; i--) {
            if (a[i] == key) {
                brr[1] = i;
                break;
            } else {
                brr[1] = -1;
            }
        }

        return brr;
    }
}