/* 
Problem Statement :
A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].

Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.

 

Example 1:


Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
Example 2:

Input: mat = [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
Output: [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]
 

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
1 <= mat[i][j] <= 100   
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class _01329_Sort_the_Matrix_Diagonally 
{
    public static void main(String[] args) 
    {
        int[][] arr = {
            {3,3,1,1},
            {2,2,1,2},
            {1,1,1,2}
        };
        
        Solution sl = new Solution();

        sl.diagonalSort(arr);

        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }    
}
class Solution {
    public int[][] diagonalSort(int[][] mat) 
    {
        // Get the number of rows and columns in the matrix
        int r = mat.length;
        int c = mat[0].length;

        // Sort diagonals starting from each row
        for(int i = 0; i < r; i++)
        {
            sortDiag(mat, i, 0);
        }
    
        // Sort diagonals starting from each column (excluding the first column)
        for(int i = 1; i < c; i++)
        {
            sortDiag(mat, 0, i);
        }

        return mat; // Return the sorted matrix
    }

    // Function to sort the diagonal elements
    private void sortDiag(int[][] mat, int i, int j)
    {
        int r = i;
        int c = j;

        List<Integer> list = new ArrayList<>();

        // Collect the elements along the diagonal
        while(r < mat.length && c < mat[i].length)
        {
            list.add(mat[r++][c++]);
        }

        // Sort the collected elements
        Collections.sort(list);

        r = i;
        c = j;

        // Put the sorted elements back along the diagonal
        for(int k = 0; k < list.size(); k++)
        {
            mat[r++][c++] = list.get(k);
        }
    }
}
