import java.util.Arrays;

/* 
Problme Statement :
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/
public class Rotate_Array_189 {
    public static void main(String[] args) {
        Solution2 sl2 = new Solution2();

        int nums[] = {1,2,3,4,5,6,7};

        sl2.rotate(nums, 3);

        System.out.println(Arrays.toString(nums));
    }
}

// 37 test cases passed out of 38
class Solution1 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        for (int i = 0; i < k; i++) {
            int temp = nums[len - 1];

            for (int j = len - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = temp;
        }

    }
}

// most optimised solution
class Solution2 
{
    public void rotate(int[] nums, int k)
    {
        int n = nums.length;
        k%=n;
        reverseArray(nums, 0, n);
        reverseArray(nums, 0, k);
        reverseArray(nums, k, n+k);
  
    }

    private void reverseArray(int[] a, int start, int end)
    {
        for(int i = start; i<end/2; i++)
        {
            int temp = a[end-1-i];
            a[end-1-i] = a[i];
            a[i]=temp;
        }
    }
}

// medium optimised solution 
class Solution3 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);

    }

    private void reverseArray(int[] a, int start, int end) 
    {
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end]  = temp;
            start++;
            end--;
        }    
    }
}