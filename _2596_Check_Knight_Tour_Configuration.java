/*
Problem Statement :
There is a knight on an n x n chessboard. In a valid configuration, the knight starts at the top-left cell of the board and visits every cell on the board exactly once.

You are given an n x n integer matrix grid consisting of distinct integers from the range [0, n * n - 1] where grid[row][col] indicates that the cell (row, col) is the grid[row][col]th cell that the knight visited. The moves are 0-indexed.

Return true if grid represents a valid configuration of the knight's movements or false otherwise.

Note that a valid knight move consists of moving two squares vertically and one square horizontally, or two squares horizontally and one square vertically. The figure below illustrates all the possible eight moves of a knight from some cell.


 

Example 1:


Input: grid = [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
Output: true
Explanation: The above diagram represents the grid. It can be shown that it is a valid configuration.
Example 2:


Input: grid = [[0,3,6],[5,8,1],[2,7,4]]
Output: false
Explanation: The above diagram represents the grid. The 8th move of the knight is not valid considering its position after the 7th move.
 

Constraints:

n == grid.length == grid[i].length
3 <= n <= 7
0 <= grid[row][col] < n * n
All integers in grid are unique.
*/

public class _2596_Check_Knight_Tour_Configuration 
{
    public static void main(String[] args) 
    {   
        int[][]grid = {
             {0,11,16,5,20}
            ,{17,4,19,10,15}
            ,{12,1,8,21,6}
            ,{3,18,23,14,9}
            ,{24,13,2,7,22}};
 
        Solution sl = new Solution();
        System.out.println(sl.checkValidGrid(grid));
    }    
}

class Solution {
    public boolean checkValidGrid(int[][] grid) 
    {
        if(grid[0][0]!=0)
        {
            return false;
        }
        return helper(grid,0,0,0);
    }

    private boolean helper(int[][] grid, int row, int col,int num)
    {
        int n = grid.length;
        if(grid[row][col] == n * n - 1)
        {
            return true;
        }

        int i = 0;
        int j = 0;

        //up left
        i = row-2;
        j = col-1;

        if(i>=0 && j>=0 && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        //up right
        i = row-2;
        j = col+1;

        if(i>=0 && j<n && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        //right up
        i = row-1;
        j = col+2;

        if(i>=0 && j<n && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        //right down
        i = row+1;
        j = col+2;

        if(i<n && j<n && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        //left up
        i = row-1;
        j = col-2;

        if(i>=0 && j>=0 && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        //left down
        i = row+1;
        j = col-2;

        if(i<n && j>=0 && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        //down left
        i = row+2;
        j = col-1;

        if(i<n && j>=0 && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        //down right
        i = row+2;
        j = col+1;

        if(i<n && j<n && grid[i][j]==num+1)
        {
            return helper(grid,i,j,num+1);
        }

        return false;
    }
}