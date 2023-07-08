/* 
Problem Statement :
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 

Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100
*/

import java.util.Arrays;
import java.util.Stack;

public class _0739_Daily_Temperatures 
{
    public static void main(String[] args) {
        Solution2 sl = new Solution2();

        System.out.println(Arrays.toString(sl.dailyTemperatures(new int[] {30,60,90})));
    }    
}

// class Solution {
//     public int[] dailyTemperatures(int[] temp) 
//     {
//         Stack<int[]> st = new Stack<>();

//         int len = temp.length;

//         int[] res = new int[len];

//         for(int i = len-1; i>=0; i--)
//         {
//             int days = 0;

//             while(!st.isEmpty())
//             {
//                 if(st.peek()[0]>temp[i])
//                 {
//                     days++;
//                     break;
//                 }
//                 else
//                 {
//                     days += st.pop()[1];
//                 }
//             }

//             if(st.isEmpty())
//             {
//                 days = 0;
//             }

//             st.push(new int[] {temp[i],days});
//             res[i] = days;
//         }

//         return res;
//     }
// }

class Solution2
{
    private Stack<Integer> st = new Stack<>();

    public int[] dailyTemperatures(int[] temp) 
    {
        int len = temp.length;

        int[] res = new int[len];

        for(int i = 0; i<len; i++)
        {
            res[i] = 0;

            while(!st.isEmpty() && (temp[i] > temp[st.peek()]))
            {
                res[st.peek()] = i-st.peek();
                st.pop();
            }

            st.push(i);
        }

        return res;
    }
}