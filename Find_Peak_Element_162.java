/* 
Problem Statement :
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 

Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.
*/

public class Find_Peak_Element_162 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
    }
}

class Solution {
    public int findPeakElement(int[] a) {
        int n = a.length;
        int start = 0;
        int end = n - 1;

        // check if the array has only single element
        if (n == 1) {
            return start;
        }

        // if 0th element is greater than the 1st element then the array is not an
        // mountain array
        if (a[0] > a[1]) {
            return 0;
        }

        // if last element is greater than the second last element then return the last
        // element index
        if (a[n - 1] > a[n - 2]) {
            return (n - 1);
        }

        // search for peak element in the remainig array
        while (start < end) {
            int mid = start + (end - start) / 2;

            // if middle element is greater than middle+1 then go left side
            if (a[mid] > a[mid + 1]) {
                end = mid;
            }
            // if middle element is less than middle+1 then go right side
            else {
                start = mid + 1;
            }
        }

        // here start is return as at the end both will point at the same index so can
        // return end/start
        return start;
    }

}