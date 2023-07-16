/* 
Problme Statement :
A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.

 

Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
 

Constraints:

0 <= n <= 1000
-104 <= Node.val <= 104
Node.random is null or is pointing to some node in the linked list.
*/

public class _0138_Copy_List_with_Random_Pointer 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        Node a0 = new Node(7);
        Node a1 = new Node(13);
        Node a2 = new Node(11);
        Node a3 = new Node(10);
        Node a4 = new Node(1);

        a0.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        a0.random = null;
        a1.random = a0;
        a2.random = a4;
        a3.random = a2;
        a4.random = a0;

        sl.display(sl.copyRandomList(a0));

    }
}


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) 
    {
        if(head == null)
        {
            return head;
        }

        Node curr = head;

        // create a copy of each node and insert it between the original nodes.
        // Original : 7->13->11->10->1->null
        // new : 7->7->13->13->11->11->10->10->1->1->null
        while(curr != null)
        {
            Node temp = new Node(curr.val);
            temp.next = curr.next;
            curr.next = temp;
            curr = curr.next.next;
        }  
    
        // put temporary pointer back on the head
        curr = head;

        // assign the random pointer to new nodes
        while(curr != null)
        {
            if(curr.random != null)
            {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // separate the original list and new list 
        curr = head;
        Node copyHead = head.next;
        Node copyCurr = copyHead;

        while(curr != null)
        {
            curr.next = copyCurr.next;
            curr = curr.next;

            if(copyCurr.next != null)
            {
                copyCurr.next = curr.next;
            }
            
            copyCurr = copyCurr.next;
        }

        return copyHead;
    }


    public void display(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            
            temp = temp.next;
        }

        System.out.println();
    }

    public void displayRan(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            if(temp.random == null)
            {
                System.out.print("-1 ");
            }
            else
            {
            System.out.print(temp.random.val + " ");
            }
            
            temp = temp.next;
        }

        System.out.println();
    }
}

class Solution1 {
    public Node copyRandomList(Node head) 
    {
        // Step 1 = create a normal deep copy

        Node t1 = head;

        Node copyHead = new Node(-1);
        Node t2 = copyHead;

        while(t1 != null)
        {
            Node curr = new Node(t1.val);
            t2.next = curr;
            t2 = t2.next;
            t1 = t1.next;
        }

        copyHead = copyHead.next;
        t2 = copyHead;
        t1 = head; 

        //step 2 = Make alternate connection

        Node h3 = new Node(-1);
        Node t = h3;

        while(t1 != null)
        {
            t.next = t1;
            t = t.next;
            t1 = t1.next;

            t.next = t2;
            t = t.next;
            t2 = t2.next;
        }

        t = h3;
        t1 = head;
        t2 = copyHead;


        // step 3 = assign random pointer 

        while(t1 != null && t2.next != null)
        {
            if(t1.random == null)
            {
                t2.random = null;
            }
            else
            {
                t2.random = t1.random.next;
            }
            
            t1 = t2.next;
            if(t1 != null)
            {
                t2 = t1.next;
            }
            
        }

        t1 = head;
        t2 = copyHead;

        // display(t2);

        // step 4 = separate the connection

        while(t1 != null)
        {
            t1.next = t2.next;
            t1 = t1.next;

            if(t1 == null)
            {
                break;
            }
            
            t2.next = t1.next;
            if(t2.next == null)
            {
                break;
            }
            t2 = t2.next;

        }

        // t1 = t1.next;
        t1 = head;
        t2 = copyHead;

        

        // display(head);
        // displayRan(head);
        // display(copyHead);
        displayRan(copyHead);


        return copyHead;
    }

    public void display(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            
            temp = temp.next;
        }

        System.out.println();
    }

    public void displayRan(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            if(temp.random == null)
            {
                System.out.print("-1 ");
            }
            else
            {
            System.out.print(temp.random.val + " ");
            }
            
            temp = temp.next;
        }

        System.out.println();
    }
}