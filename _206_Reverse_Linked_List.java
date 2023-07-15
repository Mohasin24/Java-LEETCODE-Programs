/* 
Problem Statement :
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:

Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
*/

import java.util.List;

public class _206_Reverse_Linked_List
{
    public static void display(ListNode head)
    {
        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) 
    {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;    
        // e.next = f;    

        // display(a);

        Solution sl = new Solution();

        display(sl.reverseList(a));
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
class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode curr = head;
        ListNode nxt = null;
        ListNode prev = null;

        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }
}
class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// reverse list recursively
class SolutionRec {
    public ListNode reverseList(ListNode head) 
    {
        if(head==null || head.next == null)    
        {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;

        head.next = null;

        return newHead;
    }
}