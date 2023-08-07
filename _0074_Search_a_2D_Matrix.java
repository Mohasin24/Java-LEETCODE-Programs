/* 
Problem Statement :
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
*/

public class _0074_Search_a_2D_Matrix 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.searchMatrix(new int[][]
        {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        }, 3));     
    }    
}

// Time complexity: O(m * log n)
// Space complexity: O(1)

class Solution {
    // Function to search for an element in a 2D matrix
    public boolean searchMatrix(int[][] mat, int tgt) 
    {
        // Traverse each row of the matrix
        for (int i = 0; i < mat.length; i++) 
        {
            int n = mat[i].length; // Number of elements in the current row

            // Check if the target is at the beginning or end of the current row
            if (mat[i][0] == tgt || mat[i][n - 1] == tgt) 
            {
                return true; // Target found at the edges of the current row
            } 
            else if (mat[i][0] < tgt && mat[i][n - 1] > tgt) 
            {
                // If the target lies within the range of the current row, perform binary search on the row
                return search(mat[i], tgt, n);
            } 
            else 
            {
                // If the target is not within the range of the current row, continue to the next row
                continue;
            }
        }
        return false; // Target not found in the matrix
    }

    // Function to perform binary search on a sorted array
    private boolean search(int[] mat, int tgt, int n) 
    {
        int start = 0;
        int end = n - 1;

        // Binary search loop
        while (start <= end) 
        {
            int mid = start + (end - start) / 2;

            if (mat[mid] == tgt) 
            {
                return true; // Target found in the array
            } 
            else if (mat[mid] > tgt) 
            {
                end = mid - 1; // Target lies in the left half of the array
            } 
            else 
            {
                start = mid + 1; // Target lies in the right half of the array
            }
        }
        return false; // Target not found in the array
    }
}
