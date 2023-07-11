/*
Problem Statement :
Reverse Queue
 */

package src.queues_problem;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _02_Reverse_Queue
{
    public static void main(String[] args)
    {
        _02_Solution sl = new _02_Solution();

        Queue<Integer> qe = new LinkedList<>(List.of(1,2,3,4,5));
        System.out.println(qe);
        sl.reverseQueue(qe);
        System.out.println(qe);


    }
}

class _02_Solution
{
    public void reverseQueue(Queue<Integer> qe)
    {
        Stack<Integer> st = new Stack<>();

        while (!qe.isEmpty())
        {
            st.push(qe.remove());
        }

        while (!st.isEmpty())
        {
            qe.add(st.pop());
        }
    }

}
