/* 
Problem Statement :
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
*/

import java.lang.reflect.Array;
import java.util.*;

public class _0015_3Sum 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.threeSum(new int[]{0,0,0}));
    }    
}

//Two Pointer 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;

        for(int i = 0; i<n; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i+1;
            int k = n-1;

            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];

                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    list.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    j++;
                    k--;

                    while(j<n && nums[j]==nums[j-1])
                    {
                        j++;
                    }

                    while(k>j && nums[k]==nums[k+1])
                    {
                        k--;
                    }
                }

                
            }
        }

        return list;
    }
}

//optmised brute force

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> list = new ArrayList<>();
        Set<ArrayList<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i<n; i++)
        {
            Set<Integer> temp = new HashSet<>();

            for(int j = i+1; j<n; j++)
            {
               int k = -(nums[i]+nums[j]);

               if(!temp.isEmpty() && temp.contains(k))
               {
                   ArrayList<Integer> al = new ArrayList<>(List.of(nums[i],nums[j],k));
                   Collections.sort(al);
                   set.add(al);
               }

               temp.add(nums[j]);
            }
            
        }   
    
       for(ArrayList<Integer> x : set)
       {
        list.add(x);
       }
       
        return list;
    }
}

// Brute Force
class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> list = new ArrayList<>();
        Set<ArrayList<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                for(int k = j+1; k<n; k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {   
                        ArrayList<Integer> al = new ArrayList<Integer>(List.of(nums[i],nums[j],nums[k]));
                        
                        Collections.sort(al);
                        set.add(al);
                        break;     
                    }
                }
            }
            
        }   
        System.out.println(set);
       for(ArrayList<Integer> x : set)
       {
        list.add(x);
       }
       
        return list;
    }
}