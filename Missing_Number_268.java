/* 
Problem Statement :
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in 
the range [0,2]. 2 is the missing number in the range since it does 
not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in 
the range [0,9]. 8 is the missing number in the range since it does 
not appear in nums.
 

Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 

Follow up: Could you implement a solution using only O(1) extra space 
complexity and O(n) runtime complexity?
*/

public class Missing_Number_268 {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        Solution1 sl1 = new Solution1();
        Solution2 sl2 = new Solution2();
        Solution3 sl3 = new Solution3();

        System.out.println("Solution 1 : " + sl1.missingNumber(arr));
        System.out.println("Solution 2 : " + sl2.missingNumber(arr));
        System.out.println("Solution 3 : " + sl3.missingNumber(arr));

    }
}

// method 1 : using actual sum and current sum difference
class Solution1 {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int sum = 0;
        int i = 0;

        while (i < nums.length) {
            sum += nums[i];
            actualSum += i;
            i++;
        }
        actualSum += i;
        return actualSum - sum;
    }
}

// method 2 : using actual sum and current sum difference in optimized way
// by using The formula (length * (length + 1) / 2) is used to calculate the sum
// of a series of numbers from 0 to length.

class Solution2 {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        int sum = 0;
        int actualSum = len * (len + 1) / 2;

        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }

        int iRet = actualSum - sum;

        return iRet;
    }
}

// By using the cyclic sort algorithm by sorting the array and then seraching
// for an element in the array
class Solution3 {
    public int missingNumber(int[] nums) {
        sort(nums);
        return search(nums);
    }

    private void sort(int[] a) {
        int i = 0;
        int len = a.length;

        while (i < len) {
            if (a[i] != i && a[i] != len) {
                swap(a, i, a[i]);
            } else {
                i++;
            }
        }

    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private int search(int[] a) {
        int i = 0;

        while (i < a.length) {
            if (a[i] != i) {
                return i;
            }
            i++;
        }

        return i;
    }
}