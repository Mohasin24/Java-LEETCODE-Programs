/* 

*/
import java.lang.*;
import java.util.*;

public class diff_between_sum_of_diagonals 
{
    public static void main(String[] args) {
        
        int N = 4;

        int Grid[][] = {{-29, -9, -66, -90}, {-27, -41, -10, 65}, {-14, 10, -46, -33},
        {26, 51, 9, -7}};

        int iRet = diagonalSumDifference(N, Grid);

        System.out.println(iRet);

    }   
    
    public static int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        
        int leftDia = 0;
        int rightDia = 0;
        int diff = 0;
        
       for(int i = 0; i<N; i++)
       {
           leftDia += Grid[i][i];
           rightDia += Grid[i][N-i-1];
       }
       
       diff = leftDia - rightDia;

       if(diff<0)
       {
          diff = -(diff);
       }

    //    System.out.println(leftDia);
    //    System.out.println(rightDia);
       
       return diff;
    }
}
