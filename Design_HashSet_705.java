/* 
Problem Statement :
Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 

Example 1:

Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
 

Constraints:

0 <= key <= 106
At most 104 calls will be made to add, remove, and contains.

*/

import java.util.ArrayList;
import java.util.*;
public class Design_HashSet_705 
{
    public static void main(String[] args) 
    {
        MyHashSet obj = new MyHashSet();
        
        obj.add(1);
        System.out.println(obj.contains(1));
        obj.add(2);
        System.out.println(obj.contains(2));
        obj.remove(2);;
        System.out.println(obj.contains(2));
    }
}

class MyHashSet {

    private boolean[] buc;

    public MyHashSet() 
    {
        buc = new boolean[10000001]; 
    }

    
    
    public void add(int key) 
    {
        buc[key] = true;
    }
    
    public void remove(int key) 
    {
        buc[key] = false;    
    }
    
    public boolean contains(int key) 
    {
        return buc[key];
    }
}


class MyHashSet2 
{
    private ArrayList<Integer> list;

    public MyHashSet2() 
    {
        list = new ArrayList<>();
    }
    
    public void add(int key) 
    {
        if(!contains(key))
        {
            list.add(key);
        }
    }
    
    public void remove(int key) 
    {
        if(!list.isEmpty() && list.contains(key))    
        {
            list.remove(list.indexOf(key));
            
        }
    }
    
    public boolean contains(int key) 
    {
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
