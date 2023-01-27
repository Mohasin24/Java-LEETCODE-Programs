/* 
 In transpose of matrix convert col to row
*/
import java.lang.*;
import java.util.*;

import javax.swing.Icon;

public class transpose_matrix 
{
    public static void main(String arg[])    
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        displayMatrix(arr);
        
    }

    public static int[][] transMatrix(int a[][])
    {   
        // as number of rows and column may be different so swap it for creating new array
        int A[][] = new int[a[0].length][a.length];

        for(int i = 0; i<A.length; i++)    
        {
            for(int j = 0; j<A[i].length; j++)
            {
                A[i][j]=a[j][i];
            }
        }

        return A;
    }

    public static void displayMatrix(int a[][])
    {   
        int iRet[][] = transMatrix(a);

        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<iRet[i].length; j++)
            {
                System.out.print(iRet[i][j]+" ");
            }
            System.out.println();
        }
    }
}    
