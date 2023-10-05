/* 
Problem Statement :
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109

*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class _0229_Majority_Element_II 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.majorityElement(new int[] {6,5,8,5}));
    }    
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Sort the input array in ascending order
        Arrays.sort(nums);
        
        // Initialize a list to store the majority elements
        List<Integer> list = new ArrayList<>();

        // Get the length of the input array
        int n = nums.length;
        
        // Calculate the minimum occurrence count for an element to be considered a majority element
        int occ = n / 3;
        
        // Initialize the count and previous element to the first element in the sorted array
        int prev = nums[0];
        int cnt = 1;

        // Iterate through the sorted array starting from the second element
        for (int i = 1; i < n; i++) {
            if (nums[i] != prev) {
                // If the current element is different from the previous one
                if (cnt > occ) {
                    // If the count of the previous element is greater than the minimum occurrence count,
                    // add it to the list of majority elements
                    list.add(prev);
                }
                // Update the previous element and reset the count
                prev = nums[i];
                cnt = 1;
            } else {
                // If the current element is the same as the previous one, increment the count
                cnt++;
            }
        }

        // Check if the last element is a majority element
        if (cnt > occ) {
            list.add(prev);
        }

        // Return the list of majority elements
        return list;
    }
}
