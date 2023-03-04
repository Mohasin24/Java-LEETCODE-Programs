/*
Problem Statement :
Given an integer numRows, return the first numRows of Pascal's triangle.

        1 
       1 1                 
      1 2 1                
     1 3 3 1               
    1 4 6 4 1
    
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
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
                    // accessing previous row elements
                    row.add(matrix.get(i-1).get(j-1)+matrix.get(i-1).get(j));
                }
            }
        
            matrix.add(row);
        }

        return matrix;
    }
}
