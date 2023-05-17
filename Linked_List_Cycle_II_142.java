/* 
Problem Statement :
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
Example 2:


Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
Example 3:


Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?
*/

public class Linked_List_Cycle_II_142 
{
    public static void main(String[] args) 
    {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        Solution sl = new Solution();

        System.out.println(sl.detectCycle(a).val);

    }    
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {

   /* 
    1. First check if cycle is present or not.
    2. Then find the length of the cycle.
    3. After that create two pointers as first and second them traverse first pointer till length == 0.
    4. After that travers second pointer from head and first pointer further till these two pointer meet at a particular node.
    5. Return the any one of the pointer.
   */ 
    public ListNode detectCycle(ListNode head) 
    {
        ListNode temp = hasCycle(head);

        if(temp == null)
        {
            return null;
        }

        int length = cycleLength(temp);

        ListNode first = head;
        ListNode second = head;

        while(length>0)
        {
            first = first.next;
            length--;
        }

        while(first != second)
        {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    private ListNode hasCycle(ListNode head)
    {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                return slow;
            }
        }

        return null;
    }

    private int cycleLength(ListNode head)
    {
        ListNode temp = head;

        int length = 0;

        do
        {
            length++;
            temp = temp.next;
        }while(temp != head);

        return length;
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
