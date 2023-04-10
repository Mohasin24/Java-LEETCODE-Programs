/* 
Problem Statement :
Given two n x n binary matrices mat and target, return true if it is possible to 
make mat equal to target by rotating mat in 90-degree increments, or false 
otherwise.
 ___ ___         ___ ___  
| 0 | 1 |       | 1 | 0 |
|___|___|  ---> |___|___|
| 1 | 0 |       | 0 | 1 |
|___|___|       |___|___|


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
            
*/

import java.lang.*;
import java.util.Arrays;

// note that number of rows and coloumns are equals
public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation_1886 
{
    public static void main(String arg[])    
    {
        // int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};

        Solution sl = new Solution();

        System.out.println(sl.findRotation(mat, target));
    }
}

class Solution
{
    public boolean findRotation(int[][] mat, int[][] target) 
    {   
        // after 4th rotation all the elements comes to there initial positions
        for(int i = 0; i<4; i++)
        {
            transpose(mat);
            reverse(mat);
            // if(Arrays.deepEquals(mat,target)) 
            //      return true;
            if(isEqual(mat,target)) 
                return true;
        }
        return false;
    }

    // take tarnspose of the matrix
    private void transpose(int[][] mat)
    {
        int n = mat.length;
        // this logic works only if row==col
        for(int i = 0; i<n; i++)
        {
            for(int j = i; j<n; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    // reverse the rows of matrix
    private void reverse(int[][] mat)
    {
        int n = mat.length;
        
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n/2; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    }
    
    // check if matrix are equals or not
    private boolean isEqual(int[][] mat, int[][] target)
    {
        int n = mat.length;

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }

        return true;
    }
}