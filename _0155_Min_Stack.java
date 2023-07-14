/* 
Problem Statement :
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.
*/

import java.util.Stack;

class _0155_Min_Stack
{
    public static void main(String[] args) 
    {
        MinStack ms = new MinStack();

        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }
}

class MinStack 
{
    private Stack<Long> st;
    private long min;

    public MinStack() 
    {
        st = new Stack<>();
        min = 0;
    }
    
    public void push(int val) 
    {
        long k = (long) val;
        if(st.isEmpty())    
        {
            st.push(k);
            min = k;
        }
        else if(k<min)
        {
            st.push(k+k-min);
            min = k; 
        }
        else
        {
            st.push(k);
        }
    }
    
    public void pop() 
    {
        if(st.isEmpty())    
        {
            return;
        }
        else if(st.peek() < min)
        {
            min = min+min-st.pop();
        }
        else
        {
            st.pop();
        }
    }
    
    public int top() 
    {
        if(st.isEmpty())    
        {
            return -1;
        }
        else if(st.peek() < min)
        {
            return (int)min;
        }
        else
        {
            long k = st.peek();
            return (int)k;
        }
    }
    
    public int getMin() 
    {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack2
{
    private Stack<Integer> st;
    private Stack<Integer> temp;
    private int min = 0;    

    public MinStack2()
    {
        st = new Stack<Integer>();
        temp  = new Stack<Integer>();
    }
    
    public void push(int val) 
    {
        if(st.isEmpty() || temp.isEmpty())      
        {
            min = val;
        }
        else if(val <= min)
        {
            min = val;
        }

        st.push(val);
        temp.push(min);
    }
    
    public void pop() 
    {
        st.pop();
        temp.pop();
        if(!temp.isEmpty())
        {
            min = temp.peek();
        }
        
    }
    
    public int top() 
    {
        if(st.isEmpty())
        {
            return -1;
        }

        return st.peek();    
    }
    
    public int getMin() 
    {
        if(temp.isEmpty())
        {
            return -1;
        }    

        return temp.peek();
    }
}
