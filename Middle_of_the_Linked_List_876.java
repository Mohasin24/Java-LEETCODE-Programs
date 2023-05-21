/* 
Problem Statement :
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
*/

public class Middle_of_the_Linked_List_876 
{
    public static void main(String[] args) 
    {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(44);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;  
        
        Solution1 sl1 = new Solution1();

        System.out.println(sl1.middleNode(a).val);

        Solution2 sl2 = new Solution2();

        System.out.println(sl2.middleNode(a).val);
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

 class ListNode 
 {
    int val;
    ListNode next;
    
    public ListNode(int val) 
    { 
        this.val = val; 
    }
}

class Solution1 {
    public ListNode middleNode(ListNode head) 
    {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)    
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}

class Solution2 {
    public ListNode middleNode(ListNode head) 
    {
        int listSize = 0;
        ListNode temp = head;

        while(temp != null)    
        {
            listSize++;
            temp = temp.next;
        }

        temp = head;

        for(int i = 0; i<listSize/2; i++)
        {
            temp = temp.next;
        }

        return temp;
    }
}
