/* 
Problem Statement :
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
*/

import java.util.List;

public class Remove_Linked_List_Elements_203 
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
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(6);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(4);
        ListNode a6 = new ListNode(5);
        ListNode a7 = new ListNode(6);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;

        Solution sl = new Solution();

        display(a1);

        ListNode temp = sl.removeElements(a1, 6);

        display(temp);
    }    
}

class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public ListNode removeElements(ListNode head, int val) 
    {
        if(head == null)
        {
            return null;
        }
        
        // create a temporary new head to look out next element
        // -1 -> 1 -> 6 -> 2 -> 3 -> 4 -> 5 -> 6

        ListNode temp = new ListNode(-1);
        temp.next = head;

        // create current pointer which will move further and search for target
        ListNode curr = temp;

        while(curr != null && curr.next != null)
        {
            if(curr.next.val == val)
            {
                ListNode dumy = curr.next.next;
                curr.next.next = null;
                curr.next = dumy;
            }
            else
            {
                curr = curr.next;
            }
            
        }    

        head = temp.next;

        // calling garbage collector 
        System.gc();
        
        return head;
    }
}
