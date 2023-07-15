/* 
Problem Statement :

*/

public class _0234_Palindrome_Linked_List 
{
    public static void main(String[] args) 
    {
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

        Solution sl = new Solution();

        System.out.println(sl.isPalindrome(a));
        // sl.isPalindrome(a);

        sl.display(a);
    }    
}


class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;

        // find the middle of the linked list
        while(fast.next != null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        
        ListNode p1 = head;

        // reverse linked from the middle
        ListNode p2 = reverse(slow.next);

        // connect the first half of the linked list with reversed second half of the linked list
        slow.next = p2;

        // compare first half of the linked list with second half of the linked list
        while(p2 != null)
        {
            if(p1.val != p2.val)
            {
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;    
    }

    private ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = head;

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
        ListNode temp = head;

        while(temp!=null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

class ListNode
{
    public ListNode next;
    public int val;

    public ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}