/* 
Problem Statement :- 
Given an array A[]  of n elements. Your task is to complete the Function num which 
returns an integer denoting the total number of times digit k appears in the whole array.

For Example:

Input:
A[] = {11,12,13,14,15}, k=1
Output:
6 
Explanation: Here digit 1 appears in the whole array 6 times.
*/

import java.lang.*;
import java.util.*;

public class find_number_of_numbers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int A[] = { 10, 12, 13, 14, 15 };
        System.out.print("Enter the number to find :- ");
        int k = sc.nextInt();

        int iRet = num(A, A.length, k);

        System.out.println(iRet);
    }

    public static int num(int a[], int n, int k) {
        // Your code here
        int iCnt = 0;

        for (int i = 0; i < n; i++) {
            int remainder = 0;
            while (a[i] > 0) {
                remainder = a[i] % 10;

                if (remainder == k) {
                    iCnt++;
                }

                a[i] = a[i] / 10;
            }
        }

        if (iCnt == 0) {
            return -1;
        }

        return iCnt;
    }
}
