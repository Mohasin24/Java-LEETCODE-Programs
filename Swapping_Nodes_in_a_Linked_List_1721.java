/* 
Problem Statement :
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
*/

public class Swapping_Nodes_in_a_Linked_List_1721 
{
    public static void main(String[] args) 
    {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        // ListNode c = new ListNode(3);
        // ListNode d = new ListNode(4);
        // ListNode e = new ListNode(5);

        a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;

        // ListNode temp = a;

        

        SolutionOptmized sl = new SolutionOptmized();

        sl.swapNodes(a, 2);
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
class Solution {
    public ListNode swapNodes(ListNode head, int k) 
    {
        int n1 = 0;
        int n2 = 0;
        int size = 1;

        ListNode temp = head;

        while(temp.next != null)   
        {
            if(size == k)
            {
                n1 = temp.val;
            }

            size++;
            temp = temp.next;
        }

        if(temp != null && size == k)
        {
            n1 = temp.val;
        }        
        
        temp = head;

        for(int i = 1; i<= size; i++)
        {
            if(i == (size-k+1))
            {
                n2 = temp.val;
                temp.val = n1;
                break;
            }
            temp = temp.next;
        }

        temp = head;

        for(int i = 1; i<=size; i++)
        {
            if(i == k)
            {
                temp.val = n2;
                break;
            }

            temp = temp.next;
        }

        return head;
    }
    
    public void display(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

class SolutionOptmized {
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode temp = head;
        ListNode start = head;
        ListNode end = head;

        while(k > 1)
        {
            start = start.next;
            end = end.next;
            k--;
        }    

        while(end.next != null)
        {
            temp = temp.next;
            end = end.next;
        }

        int dumy = start.val;
        start.val = temp.val;
        temp.val = dumy;

        return head;
    }

    public void display(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
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