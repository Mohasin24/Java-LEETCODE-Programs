/* 
Problem Statement :
Given the head of a linked list head, in which each node contains an integer value.

Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.

Return the linked list after insertion.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

 

Example 1:


Input: head = [18,6,10,3]
Output: [18,6,6,2,10,1,3]
Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
- We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
- We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
- We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
There are no more adjacent nodes, so we return the linked list.
Example 2:


Input: head = [7]
Output: [7]
Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes.
There are no pairs of adjacent nodes, so we return the initial linked list.
 

Constraints:

The number of nodes in the list is in the range [1, 5000].
1 <= Node.val <= 1000
*/

public class _2807_Insert_Greatest_Common_Divisors_in_Linked_List 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        ListNode a = new ListNode(18);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(3);

        a.next=b;
        b.next=c;
        c.next=d;

        display(a);
        ListNode temp = sl.insertGreatestCommonDivisors(a);
        display(temp);
        
    }    

    private static void display(ListNode head)
    {
        ListNode temp = head;

        while(temp!=null)
        {
            System.out.print(temp.val + "->");
            temp=temp.next;
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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        // If the list is empty or contains only one element, no change needed
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode t1 = head;      // Pointer to the current node
        ListNode t2 = head.next; // Pointer to the next node

        while (t2 != null)   
        {
            int n = getCGD(t1.val, t2.val); // Calculate the GCD of t1's value and t2's value
            ListNode temp = new ListNode(n); // Create a new node with GCD as its value
            t1.next = temp;  // Point t1 to the new GCD node
            temp.next = t2;  // Point the new GCD node to t2, connecting it in the linked list
    
            t1 = t2;         // Move t1 to t2
            t2 = t2.next;    // Move t2 to the next node
        }

        return head;
    }

    // Function to calculate the greatest common divisor (GCD) of two integers
    private int getCGD(int x, int y)
    {   
        if (y == 0)
        {
            return x; // If y is 0, return x as the GCD
        }
        
        // Long division method to calculate the GCD
        while (x % y != 0)
        {
            int rem = x % y; // Calculate the remainder of x divided by y
            x = y;           // Update x with the value of y
            y = rem;         // Update y with the remainder
        }

        return y; // Return the GCD (which is now in y)
    }
}

