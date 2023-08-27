/* 
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
 

Follow up: Could you find an O(n + m) solution?
*/

public class _01351_Count_Negative_Numbers_in_a_Sorted_Matrix 
{
    public static void main(String[] args) {
        
    }    
}

class Solution {
    public int countNegatives(int[][] grid) 
    {
        int row = grid.length;
        int col = grid[0].length; 
        int cnt = 0;

        for(int i = 0; i<row; i++)    
        {   
            int start = 0;
            int end = col-1;

            if(grid[i][col-1]<0)
            {
                while(start<=end)
                {
                    int mid = start + (end-start)/2;

                    if(grid[i][start]<0)
                    {
                        start++;
                        cnt++;
                    } 
                    else if(grid[i][end]<0)
                    {
                        end--;
                        cnt++;
                    }   
                    else if(grid[i][mid]<0)
                    {
                        cnt++;
                    }
                    else
                    {
                        start = mid+1;
                    }

                }
            }
        }

        return cnt;
    }
}