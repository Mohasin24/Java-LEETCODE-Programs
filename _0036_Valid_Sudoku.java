/*
Problem Statement :
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 

Example 1:


Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 

Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.
 */

public class _0036_Valid_Sudoku 
{
    public static void main(String[] args) {
        char[][] board = {
             {'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'} };

        Solution sl = new Solution();
        
        System.out.println(sl.isValidSudoku(board));
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(board[i][j]!='.' && !isValid(board,i,j))
                {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int row, int col)
    {
        char c = board[row][col];
        // check row
        for(int j = col+1; j<9; j++ )
        {
            if(board[row][j] == c)
            {
                return false;
            }
        }
        //check col
        for(int i = row+1; i<9; i++)
        {
            if(board[i][col] == c)
            {
                return false;
            }
        }

        //check 3x3 matrix
        int sRow = row/3*3;
        int sCol = col/3*3;

        // temporary change the character of the board
        board[row][col] = '.';

        for(int i = sRow; i<sRow+3; i++)
        {
            for(int j = sCol; j<sCol+3; j++)
            {
                if(board[i][j] == c)
                {
                    return false;
                }
            }
        }

        // put the original character back
        board[row][col] = c;

        return true;
    }

    private void display(char[][] board)
    {
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}