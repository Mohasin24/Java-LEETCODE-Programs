import java.lang.annotation.Target;

/*
Problem Statement :
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
*/
public class Search_in_Rotated_Sorted_Array_33 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = new int[] { 5, 1, 3 };
        System.out.println(sl.search(nums, 5));
    }
}

// Binary Search
// Time Complexiety = O(log N)
class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (target <= nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}

// Two Pointer approch
// Time Complexiety = O(N)
class Solution1 {
    public int search(int[] nums, int target) {
        int i = 0, sum = 0, j = nums.length - 1;

        while (i <= j) {
            sum = nums[i] + nums[j];

            if (nums[i] == target) {
                return i;
            } else if (nums[j] == target) {
                return j;
            } else if (sum == target) {
                i++;
                j--;
            } else if (sum > target) {
                j--;

            } else if (sum < target) {
                i++;

            }
        }

        return -1;
    }
}

// Brute force approch
// Time Complexiety = O(N)
class Solution2 {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}