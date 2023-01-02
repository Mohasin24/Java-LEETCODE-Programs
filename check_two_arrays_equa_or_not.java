/* 
Problem Statement :
Given two arrays A and B of equal size N, the task is to find if given arrays are equal 
or not. Two arrays are said to be equal if both of them contain same set of elements, 
arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for 
two array to be equal.

Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}
*/
import java.lang.*;
import java.util.*;

public class check_two_arrays_equa_or_not 
{
    public static void main(String[] args) 
    {
        int N = 5;
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,1};

        System.out.println(check(A, B, N));
    }   

    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i<N; i++)
        {
            if(A[i]!=B[i])
            {
                return false;
            }
        }
        
        return true;
    } 
}
