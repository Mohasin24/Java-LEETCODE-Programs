/* 
Problem Statement :
Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.

The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.

The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

Return an array of the k parts.

 

Example 1:


Input: head = [1,2,3], k = 5
Output: [[1],[2],[3],[],[]]
Explanation:
The first element output[0] has output[0].val = 1, output[0].next = null.
The last element output[4] is null, but its string representation as a ListNode is [].
Example 2:


Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
Output: [[1,2,3,4],[5,6,7],[8,9,10]]
Explanation:
The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.
 

Constraints:

The number of nodes in the list is in the range [0, 1000].
0 <= Node.val <= 1000
1 <= k <= 50
*/

public class _0725_Split_Linked_List_in_Parts 
{
    public static void main(String[] args) 
    {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        // ListNode d = new ListNode(4);
        // ListNode e = new ListNode(5);
        // ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        // c.next = d;
        // d.next = e;    
        
        Solution sl = new Solution();

        ListNode[] arr = sl.splitListToParts(a, 5);

        print(arr);
        
    }    


    private static void print(ListNode[] arr)
    {
        System.out.print("[");

        for(ListNode x : arr)
        {   
            
            if(x!=null)
            {
                System.out.print("[");
                ListNode temp = x;
                while(temp!=null)
                {
                    System.out.print(temp.val);
                    temp = temp.next;
                }

                System.out.print("],");
            }
            else
            {
                System.out.print("[]"+",");
            }
        }
        System.out.println("]");
    }
}

// Complexity
// Time complexity: O(2n)
// Space complexity: O(k)

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k]; // Array to store the parts
        ListNode current = head; // Pointer to traverse the linked list

        int n = length(head); // Calculate the total number of nodes in the linked list

        int partSize = n / k; // Calculate the base size of each part
        int extraSize = n % k; // Calculate the number of parts with an extra node

        for (int i = 0; i < k; i++) {
            result[i] = current; // Store the current head of the part

            int size = partSize; // Set the size of the current part

            if (i < extraSize) {
                size += 1; // If there's an extra node, increase the size of this part
            }

            // Traverse to the end of the current part
            for (int j = 0; j < size - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }

            if (current != null) {
                ListNode temp = current.next; // Save the next node in the linked list
                current.next = null; // Disconnect the current part from the rest of the list
                current = temp; // Move the current pointer to the next part's head
            }
        }

        return result;
    }

    // Helper function to calculate the length of the linked list
    private int length(ListNode head) {
        ListNode temp = head;

        int n = 0;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        return n;
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}