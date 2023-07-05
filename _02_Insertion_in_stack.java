package com.stacks_problems;

import java.util.Stack;

/*
Problem Statement :
Insert the element in a stack at the particular index

Stack = [1,2,3,4,5]
Input : (index, elem) : (2, 101)
Output : [1,2,101,3,4,5]
*/
public class _02_Insertion_in_stack
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        _02_Solution sl = new _02_Solution();

        System.out.println(sl.insertElem(st,2,101));
    }
}

class _02_Solution
{
    public Stack<Integer> insertElem(Stack<Integer> st, int index, int elem)
    {
        Stack<Integer> temp = new Stack<>();

        while (st.size() > index)
        {
            temp.push(st.pop());
        }

        st.push(elem);

        while (temp.size()>0)
        {
            st.push(temp.pop());
        }

        return st;
    }
}
