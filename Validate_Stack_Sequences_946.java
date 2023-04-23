import java.util.Stack;

/* 
Problem Statement :
Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.

 

Example 1:

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
Example 2:

Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.
 

Constraints:

1 <= pushed.length <= 1000
0 <= pushed[i] <= 1000
All the elements of pushed are unique.
popped.length == pushed.length
popped is a permutation of pushed.
*/

import java.util.Stack;
public class Validate_Stack_Sequences_946 
{
    public static void main(String[] args) 
    {
        int[] pushed = {2,1,0};
        int[] popped = {1,2,0};

        Solution sl = new Solution();

        System.out.println(sl.validateStackSequences(pushed, popped));
    }    
}

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        Stack<Integer> st = new Stack<>();

        int j = 0;
        boolean check = false;


        for(int i = 0; i<pushed.length;)
        {   
            if(!st.isEmpty() && popped[j] == st.peek())
            {
                st.pop();
                j++;
                check = true;
            }
            else 
            {
                st.push(pushed[i]);
                i++;
            }

            
        }

        for(int i = j; i<popped.length; i++)
        {
            if(!st.isEmpty() && popped[i] == st.peek())
            {
                st.pop();
                check = true;
            }
            else
            {
                check = false;
                break;
            }
        }

        return check;
    }
}
