public class Odd_Even_Linked_List_328 
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
        e.next = f;

        Solution sl = new Solution();

        display(sl.oddEvenList(a));
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
    public ListNode oddEvenList(ListNode head) 
    {
        if (head == null || head.next == null) {
            return head;
        } 

        ListNode odd = head;
        ListNode ot = head;
        ListNode even = head.next;
        ListNode et = head.next;

        while(et != null && et.next != null)
        {
            ot.next = et.next;
            ot = et.next;
            et.next = ot.next;
            et = ot.next;
        }

        ot.next = even;

        return odd;
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