/* 
Problem Statement :
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33
 

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
*/

import java.lang.*;
import java.util.*;

public class pascals_triangle2
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        List<Integer> iRet = sl.getRow(3);
        System.out.println(iRet);
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();

        for(int i = 0; i<=rowIndex; i++)    
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

        List<Integer> l = new ArrayList<>();
        for(int i = 0; i<=rowIndex; i++)
        {
            l.add(matrix.get(rowIndex).get(i));
        }

        return l;

    }
}