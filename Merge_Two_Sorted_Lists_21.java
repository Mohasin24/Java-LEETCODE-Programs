/* 
Problem Statement :
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
*/

public class Merge_Two_Sorted_Lists_21 
{
    public static void main(String[] args) 
    {
        LL list1 = new LL();
        list1.add(1);   
        list1.add(2);   
        list1.add(4);   

        list1.display();

        LL list2 = new LL();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(9);

        list2.display();

        LL ans = LL.merge(list1, list2);

        ans.display();

    }    
}

class LL
{
    private class Node 
    {
        public int val;
        public Node next;
        public Node(int val) { this.val = val; }
    }

    
    private Node head;
    private Node tail;

    public void add(int val)
    {
        Node temp = new Node(val);

        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next = temp;
            tail = temp;
        }
    }

    public void display()
    {
        Node temp = this.head;

        while(temp != null)
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public static LL merge(LL l1, LL l2)
    {
        LL ans = new LL();

        Node h1 = l1.head;
        Node h2 = l2.head;

        while(h1 != null && h2 != null)
        {
            if(h1.val == h2.val || h1.val < h2.val)
            {
                ans.add(h1.val);
                h1 = h1.next;
            }
            else if(h1.val > h2.val)
            {
                ans.add(h2.val);
                h2 = h2.next;
            }
        }

        if(h1 == null)
        {
            while(h2 != null)
            {
                ans.add(h2.val);
                h2 = h2.next;
            }
        }
        else
        {
            while(h1 != null)
            {
                ans.add(h1.val);
                h1 = h1.next;
            }
        }

        return ans;
    }
}

//############## LEETCODE Implementation ##############
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
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
//     {
//         ListNode list = new ListNode(-1);
//         ListNode head = list;
//         ListNode tail = list;
//         ListNode h1 = list1;
//         ListNode h2 = list2;

//         while(h1 != null && h2 != null)
//         {
//             if(h1.val == h2.val || h1.val < h2.val)
//             {
//                 ListNode temp = new ListNode(h1.val);
//                 tail.next = temp;
//                 tail = temp;
//                 h1 = h1.next;
//             }
//             else if(h1.val > h2.val)
//             {
//                 ListNode temp = new ListNode(h2.val);
//                 tail.next = temp;
//                 tail = temp;
//                 h2 = h2.next;
//             }
//         }

//         if(h1 == null)
//         {
//             while(h2 != null)
//             {
//                 ListNode temp = new ListNode(h2.val);
//                 tail.next = temp;
//                 tail = temp;
//                 h2 = h2.next;
//             }
//         }
//         else
//         {
//             while(h1 != null)
//             {
//                 ListNode temp = new ListNode(h1.val);
//                 tail.next = temp;
//                 tail = temp;
//                 h1 = h1.next;
//             }
//         }

//         return head.next;
//     }   
// }

