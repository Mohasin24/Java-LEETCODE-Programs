package src.queues_problem;

/*
Problem Statement :
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.


Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False


Constraints:

1 <= x <= 9
At most 100 calls will be made to push, pop, top, and empty.
All the calls to pop and top are valid.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _03_Implement_Stack_Using_Queue
{
    public static void main(String[] args)
    {
        MyStack st = new MyStack();

        System.out.println(st.empty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);

        System.out.println(st.top());

        st.pop();
        st.pop();

        System.out.println(st);

        System.out.println(st.top());


    }
}

class MyStack {

    private Queue<Integer> qe;

    public MyStack()
    {
        this.qe = new LinkedList<>();
    }

    public void push(int x)
    {
        qe.offer(x);
    }

    public int pop()
    {
        for(int i = 0; i<qe.size()-1; i++)
        {
            qe.offer(qe.remove());
        }

        return qe.remove();
    }

    public int top()
    {
        for(int i = 0; i<qe.size()-1; i++)
        {
            qe.offer(qe.remove());
        }

        int val = qe.remove();
        qe.offer(val);

        return val;
    }

    public boolean empty()
    {
        if(qe.size() == 0)
        {
            return true;
        }

        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i<qe.size()-1; i++)
        {
            sb.append(qe.element() + ", ");
            qe.add(qe.remove());
        }

        sb.append(qe.element() + "]");
        qe.add(qe.remove());

        return sb.toString();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
