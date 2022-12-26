/* 
Problem Statement : 
Given two square Matrices A[][] and B[][]. Your task is to complete the function multiply 
which stores the multiplied matrices in a new matrix C[][].

Example 1:

Input: 
N = 2
A[][] = {{7, 8}, {2 , 9}}
B[][] = {{14, 5}, {5, 18}}

Output: 
C[][] = {{138, 179}, {73, 172}}
*/

import java.lang.*;
import java.util.*;

public class matrices_multiplication 
{
    public static void main(String arg[])
    {
        int N = 2;
        int A[][] = {{7, 8}, {2 , 9}};
        int B[][] = {{14, 5}, {5, 18}};

        int C[][] = new int[N][N];

        multiply(A, B, C, N);

        displayArray(C, N);
        
    }

    public static void multiply(int A[][], int B[][], int C[][], int N)
    {
        int sum = 0;
           
        for(int i = 0; i<N; i++)
        {    
            for(int j = 0; j<N; j++)
            {    
                sum = 0;
                   
                for(int k = 0; k<N; k++)
                {
                    sum += (A[i][k]*B[k][j]);
                }
                C[i][j]=sum;
            }
        }
    }

    public static void displayArray(int Arr[][], int N)
    {
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j<N; j++)
            {
              System.out.print(Arr[i][j]+" ");
              
            }
            System.out.println();
        }
    }
}


/* 
consider two matrices as 2 x 2 
 ##For matrix multiplication multiply :
1] 1st row with first col
2] 1st row with second col
3] 2nd row with first col
4] 2nd row second col
*/