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
        int iRrr[][] = new int[a.length][a[0].length];

        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a[i].length;j++)
            {
                iRrr[j][i]=a[i][j];
            }
        }

        return iRrr;
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
