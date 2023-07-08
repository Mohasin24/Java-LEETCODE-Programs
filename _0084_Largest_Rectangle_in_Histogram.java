/* 
Problem Statement :
Given an array of integers heights representing the histogram's bar height 
where the width of each bar is 1, return the area of the largest rectangle 
in the histogram.

Example 1:

Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:

Input: heights = [2,4]
Output: 4
 
Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104
*/

import java.util.Arrays;
import java.util.Stack;

public class _0084_Largest_Rectangle_in_Histogram 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
  
        System.out.println(sl.largestRectangleArea(new int[] {2,4}));
    }    
}

class Solution
{
    private Stack<Integer> st = new Stack<>();

    public int largestRectangleArea(int[] heights) 
    {
        int area = 0;

        int[] nse = nextSmallerElement(heights);
        int[] pse = previousSmallerElement(heights);

        for(int i = 0; i<heights.length; i++)
        {
            int localArea = heights[i] * (nse[i]-pse[i]-1);
            if(localArea>area)
            {
                area = localArea;
            }
        }

        return area;
    }

    // find index of next smaller element of current element if there is no next smaller element then mark it as array length
    private int[] nextSmallerElement(int[] arr)
    {
        st.removeAllElements();

        int len = arr.length;

        int[] nse = new int[len];

        for(int i = len-1; i>=0; i--)
        {
            nse[i] = len;

            while(!st.isEmpty())
            {
                if(arr[st.peek()]<arr[i])
                {
                    nse[i] = st.peek();
                    break;
                }
                else
                {
                    st.pop();
                }
            }
            st.push(i);
        }

        return nse;
    }

    // find index of previous smaller element of current element if there is no previous smaller element then mark it as -1
    private int[] previousSmallerElement(int[] arr)
    {
        st.removeAllElements();

        int len = arr.length;

        int[] pse = new int[len];

        for(int i = 0; i<len; i++)
        {
            pse[i] = -1;

            while(!st.isEmpty())
            {
                if(arr[st.peek()]<arr[i])
                {
                    pse[i] = st.peek();
                    break;
                }
                else
                {
                    st.pop();
                }
            }

            st.push(i);
        }

        return pse;
    }
}
