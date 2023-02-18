/* 
Problem Statement :
There is an m x n matrix that is initialized to all 0's. There is also a 2D array 
indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform 
some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
 
Example 1:
Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

*/

import java.lang.*;
import java.util.*;

public class cells_with_odd_values_matrix 
{
    public static void main(String[] args) 
    {
        int indices[][] = {{1,1},{0,0}};
        int m = 2, n = 3;
        
        Solution sl = new Solution();

        System.out.println("Number of odd Values : " + sl.oddCells(m, n, indices));
    }    
}

class Solution {
    public int oddCells(int m, int n, int[][] ind) 
    {   
        int mat[][] = new int[m][n];

       int cnt = 0;

       for(int i = 0; i<ind.length; i++)
       {
           for(int j = 0; j<n; j++)
           {
               mat[ind[i][0]][j]++;
           }

           for(int j = 0; j<m; j++)
           {
               mat[j][ind[i][1]]++;
           }
       }
       

        for(int i = 0; i<m; i++)
        {   
            System.out.println(Arrays.toString(mat[i]));

            for(int j = 0; j<n; j++)
            {
                if(mat[i][j]%2!=0)
                {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
