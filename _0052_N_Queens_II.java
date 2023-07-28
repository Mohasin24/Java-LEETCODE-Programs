/* 
Problem Statement :
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

 

Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 9
*/

import java.util.ArrayList;
import java.util.List;

public class _0052_N_Queens_II 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.totalNQueens(7));    
    }    
}

class Solution {
    public int totalNQueens(int n) 
    {    List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i = 0; i<n;i++)
        {
            for (int j = 0; j<n; j++)
            {
               board[i][j]='.';
            }
        }

        nQueens(board,0,ans);

        return ans.size();
    }

    private static void nQueens(char[][] board, int row, List<List<String>> ans)
    {
        if(row == board.length)
        {
            List<String> list = new ArrayList<>();

            for(int i = 0; i<board.length; i++)
            {
                String s = "";

                for(int j = 0; j<board.length; j++)
                {
                    s += board[i][j];
                }

                list.add(s);
            }

            ans.add(list);
            return;
        }

        for(int j = 0; j< board.length; j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j] = 'Q';
                nQueens(board,row+1,ans);
                board[row][j] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col)
    {
        int i = row;
        int j = col;
        int n = board.length;

        //up
        while(i>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
        }

        i = row;
        j = col;

        // down
        while (i<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
        }

        i = row;
        j = col;

        //left
        while (j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            j--;
        }

        i = row;
        j = col;

        //right
        while (j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            j++;
        }

        i = row;
        j = col;

        //left up diagonal
        while (i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }

        i = row;
        j = col;

        //right up diagonal
        while (i>=0 && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }

        i = row;
        j = col;

        // left down diagonal
        while (i<n && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j--;
        }

        i = row;
        j = col;

        //right down diagonal
        while (i<n && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}

