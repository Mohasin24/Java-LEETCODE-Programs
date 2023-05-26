/* 
Problme Statement :
There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.

You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.

Return a list of groups such that each person i is in a group of size groupSizes[i].

Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them. It is guaranteed that there will be at least one valid solution for the given input.

 

Example 1:

Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation: 
The first group is [5]. The size is 1, and groupSizes[5] = 1.
The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
Example 2:

Input: groupSizes = [2,1,3,3,3,2]
Output: [[1],[0,5],[2,3,4]]
 

Constraints:

groupSizes.length == n
1 <= n <= 500
1 <= groupSizes[i] <= n
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_the_People_Given_the_Group_Size_They_Belong_To_1282 
{
    public static void main(String[] args)
    {
        Solution sl = new Solution();
        
        sl.groupThePeople(new int[] {3,3,3,3,3,1,3});
    }    
}

class Solution {
    // public List<List<Integer>> groupThePeople(int[] g) 
    // {
    //     List<List<Integer>> out = new ArrayList<List<Integer>>();

    //     HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

    //     for(int i = 0; i<g.length; i++)
    //     {
    //         if(!hm.containsKey(g[i]))
    //         {
    //             hm.put(g[i], new ArrayList<>());
    //         }

    //         hm.get(g[i]).add(i);
    //     }

    //     for(int s : hm.keySet())
    //     {
    //         int size = hm.get(s).size();

    //         int len = 0;
    //         ArrayList<Integer> in = new ArrayList<>();

    //         for(int i = 0; i<size;)
    //         {

    //             if(len<s)
    //             {
    //                 in.add(hm.get(s).get(i));
    //                 len++;
    //                 i++;
    //             }
    //             else
    //             {
    //                 len = 0;
    //                 out.add(in);
    //                 in = new ArrayList<>();
    //             }
    //         }
    //     }

    //     display(out);
    //     return out;
    // }

       public List<List<Integer>> groupThePeople(int[] groupSizes) 
       {
        HashMap<Integer, List<Integer>> hm = new HashMap();
        List<List<Integer>> out = new ArrayList<List<Integer>>();

        
        for(int i = 0; i<groupSizes.length; i++)
        {
            if(!hm.containsKey(groupSizes[i]))
            {
                hm.put(groupSizes[i], new ArrayList<>());
            }

            hm.get(groupSizes[i]).add(i);

            if(hm.get(groupSizes[i]).size() == groupSizes[i])
            {
                out.add(hm.get(groupSizes[i]));
                hm.remove(groupSizes[i]);
            }
        }
        
        return out;
    }
    
    

    private int findMax(int[] a)
    {
        int max = a[0];

        for(int i = 1; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }

        return max;
    }

    private void display(List<List<Integer>> out )
    {
        for(int i = 0; i<out.size(); i++)
        {
            for(int j = 0; j<out.get(i).size(); j++)
            {
                System.out.print(out.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

