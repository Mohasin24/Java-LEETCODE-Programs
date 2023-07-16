/* 
In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list.

 

Example 1:


Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 
Example 2:


Input: head = [4,2,2,3]
Output: 7
Explanation:
The nodes with twins present in this linked list are:
- Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
- Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
Thus, the maximum twin sum of the linked list is max(7, 4) = 7. 
Example 3:


Input: head = [1,100000]
Output: 100001
Explanation:
There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.
 

Constraints:

The number of nodes in the list is an even integer in the range [2, 105].
1 <= Node.val <= 105
*/

public class _2130_Maximum_Twin_Sum_of_a_Linked_List 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        ListNode a = new ListNode(1);    
        ListNode b = new ListNode(2);    
        ListNode c = new ListNode(3);    
        ListNode d = new ListNode(4);    
        ListNode e = new ListNode(4);    
        ListNode f = new ListNode(3);    
        ListNode g = new ListNode(2);    
        ListNode h = new ListNode(1);    

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println(sl.pairSum(a));
        sl.display(a);
    }    
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public int pairSum(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p1 = head;
        ListNode p2 = getReverse(slow.next);
        slow.next = p2;

        int max = 0;

        while(p2 != null)
        {
            int sum = p1.val + p2.val;
            if(sum>max)
            {
                max = sum;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return max;
    }

    private ListNode getReverse(ListNode head)
    {
        ListNode nxt = head;
        ListNode curr = head;
        ListNode prev = null;

        while(nxt != null)
        {
            nxt = nxt.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;

    }

    public void display(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
}

class ListNode
{
    public int val;
    public ListNode next;

    public ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}