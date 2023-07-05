/* 
Problem Statement :
Given the head of a linked list, rotate the list to the right by k places.

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:

Input: head = [0,1,2], k = 4
Output: [2,0,1]
 
Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
*/

public class Rotate_List_61 
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

        Solution sl = new Solution();

        display(sl.rotateRight(a, 2));



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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null || head.next == null || k == 0)    
        {
            return head;
        }

        int len = getLen(head);

        k = k%len; // get the rotation

        if(k==0)
        {
            return head;
        }

        ListNode tail = head;
        ListNode temp = head;

        for(int i = 0; i<k; i++)
        {
            tail = tail.next;    // move the tail first k step ahead
        }

        while(tail.next != null)
        {
            tail = tail.next;
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;
        tail.next = head;

        return newHead;


    }

    private int getLen(ListNode head)
    {
        int len = 0;

        while(head != null)
        {
            len++;
            head = head.next;
        }

        return len;
    }
}

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) 
//     {
//         if (head == null || head.next == null || k == 0) 
//         {
//             return head;
//         }
        
//         int len = getLen(head);
//         k = k % len; // Reduce k to the equivalent number of rotations within the list
        
//         if (k == 0) {
//             return head;
//         }
        
//         ListNode fast = head;
//         ListNode slow = head;
        
//         // Move the fast pointer k steps ahead
//         for (int i = 0; i < k; i++) {
//             fast = fast.next;
//         }
        
//         // Move both pointers until the fast pointer reaches the end of the list
//         while (fast.next != null) {
//             fast = fast.next;
//             slow = slow.next;
//         }
        
//         // Rotate the list
//         ListNode newHead = slow.next;
//         slow.next = null;
//         fast.next = head;
        
//         return newHead;
//     }

//     private int getLen(ListNode head) {
//         ListNode temp = head;
//         int len = 0;

//         while (temp != null) {
//             temp = temp.next;
//             len++;
//         }

//         return len;
//     }
// }

class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}