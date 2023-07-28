/* 
Problem Statement :
An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

 

Example 1:


Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true.
Example 2:


Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
Output: false
Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
Hence, we return false.
 

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 100
1 <= matrix[i][j] <= n
*/

public class _2133_Check_if_Every_Row_and_Column_Contains_All_Numbers 
{
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,2,3},{3,1,2},{2,3,1}};
        Solution sl = new Solution();
        System.out.println(sl.checkValid(matrix));    
    }    
}

class Solution {
    public boolean checkValid(int[][] matrix) 
    {
        int n = matrix.length;

        for(int i = 0; i<n; i++)    
        {   
            if(!checkCol(matrix,i) || !checkRow(matrix,i)) 
                return false;
        }

        return true;
    }

    private boolean checkRow(int[][] matrix,int row)
    {
        int n = matrix.length;
        int[] bucket = new int[n+1];

        for(int j = 0;j<n; j++)
        {
            bucket[matrix[row][j]]++;
        }

       return checkBuck(bucket);
    }

    private boolean checkCol(int[][] matrix,int col)
    {
        int n = matrix.length;
        int[] bucket = new int[n+1];

        for(int j = 0;j<n; j++)
        {
            bucket[matrix[j][col]]++;
        }

        return checkBuck(bucket);
    }

    private boolean checkBuck(int[] bucket)
    {
        for(int i = 1; i<bucket.length; i++)
        {
            if(bucket[i]!=1) return false;
        }

        return true;
    }
}
