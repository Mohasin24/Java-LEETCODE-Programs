/*
Problem Statement :
Display all the elements of the stack

 */

package com.stacks_problems;

import java.util.Stack;

public class _03_Display_Stack
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        _03_Solution sl =new _03_Solution();

        System.out.println(sl.toString(st));

    }
}

class _03_Solution
{
    public String toString(Stack<Integer> st)
    {
        System.out.println("Inside the _03_Solution toString");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int[] temp = new int[st.size()];

        for(int i = st.size()-1; i>=0; i--)
        {
            temp[i] = st.pop();
        }

        for(int i = 0; i<temp.length; i++)
        {
            st.push(temp[i]);
            sb.append(temp[i] + ",");
        }

        sb.append("]");

        return sb.toString();
    }
}