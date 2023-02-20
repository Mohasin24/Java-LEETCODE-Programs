
import java.lang.*;
import java.util.*;

public class try1
{
    public static void main(String[] args) 
    {
        

        Solution sl = new Solution();

        // sl.oddCells(2, 3, indices);
    }
}

class Solution {
    public int oddCells(int m, int n, int[][] ind) 
    {   
        int mat[][] = new int[m][n];
        int cnt = 0;
        int len = ind.length;
 
        for(int i = 0; i<len; i++)
        {
            for(int j = 0; j < n; j++)
            {
                mat[ind[i][0]][j]++;
            }

            for(int j = 0; j<m; j++)
           {
               mat[j][ind[i][1]]++;
           }

        //    for(int k = 0; k<mat.length; k++)
        //    {
        //         System.out.println(Arrays.toString(mat[k]));
        //    }

        //    System.out.println(i+1);
        }

        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(mat[i][j]%2!=0)
                {
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);

       return 0;
    }
}