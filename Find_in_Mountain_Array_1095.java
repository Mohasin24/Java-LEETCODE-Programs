import java.lang.annotation.Target;

/* 
Problem Statement :
(This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

 

Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 

Constraints:

3 <= mountain_arr.length() <= 104
0 <= target <= 109
0 <= mountain_arr.get(index) <= 109
*/
public class Find_in_Mountain_Array_1095 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.findInMountainArray(5, new int[] { 1,2,3,5,3}));
    }
}

class Solution {
    public int findInMountainArray(int target, int[] mountainArr) {
        int n = mountainArr.length;

        int peekIndex = findPeakIndex(mountainArr);

        int iRet1 = findElem(mountainArr, target, 0, peekIndex);
        int iRet2 = findElem(mountainArr, target, peekIndex + 1, n-1);

        // System.out.println(iRet1 + " " + iRet2 + " " + peekIndex);

        if (iRet1 >= 0 && iRet2 >= 0) {
            return Math.min(iRet1, iRet2);
        } else {
            return Math.max(iRet1, iRet2);
        }
        
    }

    private int findElem(int[] a, int target, int start, int end) 
    {
        int mid = 0;
        boolean check = a[start]<a[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if(a[mid]==target)
            {
                return mid;
            }

           if(check)
           {
                if(a[mid]>target)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
           }
           else
           {
                if(a[mid]<target)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
           }
        }
        return -1;
    }

    private int findPeakIndex(int[] a) {
        int start = 0;
        int end = a.length-1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (a[mid] > a[mid + 1]) {
                end = mid;
            } else if (a[mid] < a[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}

