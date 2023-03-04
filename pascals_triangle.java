/*

*/

import java.lang.*;
import java.util.*;

public class pascals_triangle
{
    public static void main(String[] args) 
    {
        
        Solution sl= new Solution();

        List<List<Integer>> iRet = sl.generate(5);
       
        System.out.println(iRet);
    }
}

class Solution
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();

        for(int i = 0; i<numRows; i++)
        {
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j<=i; j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(matrix.get(i-1).get(j-1)+matrix.get(i-1).get(j));
                }
            }

            matrix.add(row);
        }

        return matrix;
    }
}