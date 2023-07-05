/*
Problem Statement :
Copy elements of stack in another stack in same order

Input : [1,2,3,4,5]
Output : [1,2,3,4,5]
 */

package com.stacks_problems;

import java.util.Stack;
public class _01_copy_stack
{
    public static void main(String[] args)
    {
        _01_Solution sl = new _01_Solution();

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(sl.copyStack(st));
    }
}

class _01_Solution
{
    public Stack<Integer> copyStack(Stack<Integer> st)
    {
        Stack<Integer> copyReverse = new Stack<>();
        Stack<Integer> copyOrdered = new Stack<>();

        while (st.size()>0)
        {
            copyReverse.push(st.pop());
        }

//        System.out.println(copyReverse);

        while (copyReverse.size() > 0)
        {
            copyOrdered.push(copyReverse.pop());
        }

        return  copyOrdered;
    }
}
