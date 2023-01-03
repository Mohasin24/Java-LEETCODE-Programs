/* 
Problem Statement : 
You are given an array of n strings strs, all of the same length.
The strings can be arranged such that there is one on each line, making a grid. 
For example, strs = ["abc", "bce", "cae"] can be arranged as:

abc
bce
cae
You want to delete the columns that are not sorted lexicographically. 
In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are 
sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

Return the number of columns that you will delete.

Example 1:

Input: strs = ["cba","daf","ghi"]
Output: 1
Explanation: The grid looks as follows:
  cba
  daf
  ghi
Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
*/
import java.lang.*;
import java.time.chrono.MinguoChronology;
import java.util.*;
public class delete_coloumn_string 
{
    public static void main(String[] args) 
    {
        String strs[] = {"abc", "bce", "cae"};

        int iRet = minDeletionSize(strs);

        System.out.println(iRet);
    }   
    
    public static int minDeletionSize(String[] strs) {
        // Initialize the delete count to 0
        int deleteCount = 0;
     
        // Iterate through each column of the grid
        for (int i = 0; i < strs.length; i++) {
            // Iterate through each element in the column
            for (int j = 1; j < strs[i].length(); j++) {
                // If the current element is lexicographically smaller than the previous element,
                // increment the delete if for e.g. 'c' comes before 'a' i.e. 'c>a' 
                //delete count and break out of the loop
                if (strs[j-1].charAt(i)>strs[j].charAt(i)) 
                {   
                    // System.out.println(strs[j-1].charAt(i));
                    // System.out.println(strs[j].charAt(i));
                    deleteCount++;
                    break;
                }
            }
        }
        // Return the delete count
        return deleteCount;
    }
}
