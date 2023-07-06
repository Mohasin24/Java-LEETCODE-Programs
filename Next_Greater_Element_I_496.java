/* 
Problem Statement :
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 

Constraints:

1 <= nums1.length <= nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 104
All integers in nums1 and nums2 are unique.
All the integers of nums1 also appear in nums2.
 

Follow up: Could you find an O(nums1.length + nums2.length) solution?
*/

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_I_496 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        System.out.println(Arrays.toString(sl.nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4})));
        // System.out.println(Arrays.toString(sl.nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2})));
    }    
}

class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) 
    {
        int num2Len = num2.length;
        int[] resArr2 = new int[num2Len];
        
        int num1Len = num1.length;
        int[] resArr1 = new int[num1Len];

        Stack<Integer> st = new Stack<>();

        resArr2[num2Len-1] = -1;
        st.push(num2[num2Len-1]);

        for(int i = num2Len-2; i>=0; i--)
        {
            resArr2[i] = -1;

            while(!st.isEmpty())
            {
                if(st.peek() > num2[i])
                {
                    resArr2[i] = st.peek();
                    break;
                }
                else
                {
                    st.pop();
                }
            }

            st.push(num2[i]);
        }

        for(int i = 0; i<num1Len; i++)
        {
            for(int j = 0; j<num2Len; j++)
            {
                if(num1[i] == num2[j])
                {
                    resArr1[i] = resArr2[j];
                    break;
                }
            }
        }

        return resArr1;
    }
}

class Solution2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;

        int[] res1 = new int[nums1Len];
        int[] res2 = new int[nums2Len];

        res2[nums2Len-1] = -1;

        for(int i = nums2Len-2; i>=0; i--)
        {
            res2[i] = -1;

            for(int j = i+1; j<nums2Len; j++)
            {
                if(nums2[j]>nums2[i])
                {
                    res2[i] = nums2[j];
                    break;
                }
            }
        }

        for(int i = 0; i<nums1Len; i++)
        {
            for(int j = 0; j<nums2Len; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    res1[i] = res2[j];
                    break;
                }
            }
        }

        return res1;
    }
}
