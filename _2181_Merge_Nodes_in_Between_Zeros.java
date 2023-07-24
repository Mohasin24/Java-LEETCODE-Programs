/* 
Problem Statement :
You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

Return the head of the modified linked list.

 

Example 1:


Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 3 + 1 = 4.
- The sum of the nodes marked in red: 4 + 5 + 2 = 11.
Example 2:


Input: head = [0,1,0,3,0,2,2,0]
Output: [1,3,4]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 1 = 1.
- The sum of the nodes marked in red: 3 = 3.
- The sum of the nodes marked in yellow: 2 + 2 = 4.
 

Constraints:

The number of nodes in the list is in the range [3, 2 * 105].
0 <= Node.val <= 1000
There are no two consecutive nodes with Node.val == 0.
The beginning and end of the linked list have Node.val == 0.
*/

public class _2181_Merge_Nodes_in_Between_Zeros 
{
    public static void main(String[] args) 
    { 
        // [0,3,1,0,4,5,2,0]
        ListNode a = new ListNode(0);    
        ListNode b = new ListNode(3);    
        ListNode c = new ListNode(1);    
        ListNode d = new ListNode(0);    
        ListNode e = new ListNode(4);    
        ListNode f = new ListNode(5);    
        ListNode g = new ListNode(2);    
        ListNode h = new ListNode(0);    

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        display(a);

        Solution sl = new Solution();

        display(sl.mergeNodes(a));
    }    

    private static void display(ListNode head)
    {
        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode newHead = new ListNode(-1);
        ListNode t = newHead;
        ListNode temp = head.next;
        int sum = 0;

        while(temp!= null)
        {
            if(temp.val == 0)
            {
                ListNode curr = new ListNode(sum);
                t.next = curr;
                t = curr;
                sum = 0;
            }
            else
            {
                sum += temp.val;
            }

            temp = temp.next;
        }

        head = newHead.next;

        return head;
    }
}