/* 

*/

public class _0037_Sudoku_Solver
{
    public static void main(String[] args) 
    {
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
       
       sl.solveSudoku(board);    
    }
}

class Solution 
{
    private static boolean check = false;

    public void solveSudoku(char[][] board) 
    {
        check = false;
        helper(board,0,0);
    }

    private void helper(char[][] board, int row, int col)
    {
        if(row==9)
        {
            check = true;
            display(board);
            return;
        }
        else if(board[row][col] != '.')
        {
            if(col<8)
            {
                helper(board,row,col+1);
            }
            else
            {
                helper(board,row+1,0);
            }
        }
        else //board[row][col] == '.'
        {
            for(char ch = '1'; ch<='9'; ch++)
            {
                if(isValid(board,row,col,ch))
                { 
                    board[row][col] = ch;
                    if(col<8)
                    {
                        helper(board,row,col+1);
                    }
                    else
                    {
                        helper(board,row+1,0);
                    }
                    if(check) return;
                    board[row][col]='.';
                }
            }  
        }
    }
     private boolean isValid(char[][] board, int row, int col, char c)
    {
        // check row
        for(int j = 0; j<9; j++ )
        {
            if(board[row][j] == c)
            {
                return false;
            }
        }
        //check col
        for(int i = 0; i<9; i++)
        {
            if(board[i][col] == c)
            {
                return false;
            }
        }
        //check 3x3 matrix
        int sRow = row/3*3;
        int sCol = col/3*3;
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