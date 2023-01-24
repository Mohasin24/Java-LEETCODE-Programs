/* 
Problem Statement :
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements 
on the secondary diagonal that are not part of the primary diagonal.

Example 1:

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

*/
import java.lang.*;
import java.util.*;

public class Matrix_Diagonal_Sum 
{
    public static void main(String arg[])    
    {
        int iArr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int iRet = diagonalSum(iArr);

        System.out.println("Sum of diagonal of matrix is : " + iRet);
    }

    public static int diagonalSum(int[][] mat) 
    {   
        int iSum1 = 0;

        for(int i = 0; i<mat.length; i++)    
        {
            if(i== (mat[i].length-i-1) )
            {
                iSum1 = iSum1 + mat[i][i];
            }
            else
            {
                iSum1 = iSum1 + mat[i][i] + mat[i][mat[i].length-i-1];
            }
        }

        return iSum1;
    }
}
