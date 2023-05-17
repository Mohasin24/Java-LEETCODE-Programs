/* 
Problem Statement :
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

 

Example 1:

Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
Example 2:

Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 

Constraints:

2 <= arr.length <= 1000
-106 <= arr[i] <= 106
*/

import java.util.Arrays;

public class Can_Make_Arithmetic_Progression_From_Sequence_1502 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.canMakeArithmeticProgression(new int[] {3,5,1}));
    }    
}

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
        Arrays.sort(arr);
        int diff = arr[0]-arr[1];
        for(int i = 2; i<arr.length; i++)
        {
            if(arr[i-1]-arr[i] != diff)
            {
                return false;
            }
        }

        return true;
    }

    private void bubbleSort(int[] a)
    {
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 1; j<a.length-i; j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private void selectionSort(int[] a)
    {
        for(int i = 0; i<a.length; i++)
        {
            int min = i;
            for(int j = i+1; j<a.length; j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    private void insertionSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j>0; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
