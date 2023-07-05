package com.stacks_problems;

import java.util.Stack;

public class _04_Display_Stack_Recursively
{
    public static void displayRecReverse(Stack<Integer> st)
    {
        if(st.size() == 0)
        {
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        displayRecReverse(st);
        st.push(top);

    }

    public static void displayRec(Stack<Integer> st)
    {
        if(st.size() == 0)
        {
            return;
        }
        int top = st.pop();
        displayRec(st);
        System.out.print(top + " ");
        st.push(top);

    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displayRecReverse(st);
        System.out.println();
        displayRec(st);
    }
}
