/* 
Problem Statement :
You are given the head of a linked list containing unique integer values and an integer array nums that is a subset of the linked list values.

Return the number of connected components in nums where two values are connected if they appear consecutively in the linked list.

 

Example 1:


Input: head = [0,1,2,3], nums = [0,1,3]
Output: 2
Explanation: 0 and 1 are connected, so [0, 1] and [3] are the two connected components.
Example 2:


Input: head = [0,1,2,3,4], nums = [0,3,1,4]
Output: 2
Explanation: 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.
 

Constraints:

The number of nodes in the linked list is n.
1 <= n <= 104
0 <= Node.val < n
All the values Node.val are unique.
1 <= nums.length <= n
0 <= nums[i] < n
All the values of nums are unique.
*/

public class _0817_Linked_List_Components 
{
    public static void main(String[] args) {
        
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
    public int numComponents(ListNode head, int[] nums) {
        // Create a HashSet to store values from the nums array
        Set<Integer> set = new HashSet<>();
        // Variable to keep track if we're currently in a component
        boolean check = false;
        // Counter for the number of connected components
        int cnt = 0;

  

import java.util.HashSet;
import java.util.Set;

            set.add(x);
        }

        // Start iterating through the linked list from the head
        ListNode temp = head;
        while (temp != null) {
            // If the current node's value is in the HashSet, it's part of a component
            if (set.contains(temp.val)) {
                // If we weren't in a component before, mark that we're in a new component
                if (!check) {
                    check = true;
                    // Increment the connected components count
                    cnt++;
                }
            } else {
                // If the current node's value is not in the HashSet, mark that we're not in a component
                check = false;
            }
            // Move to the next node
            temp = temp.next;
        }

        // Return the total count of connected components
        return cnt;
    }
}
