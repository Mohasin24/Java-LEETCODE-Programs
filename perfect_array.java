
/* 
Problem Statement :
Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".

Example 1:

Input : Arr[] = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1] 
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.
User Task:
The task is to complete the function IsPerfect(), which takes an array (a), size of the array (n), and return the boolean value true if it Perfect else false. The drivercode automatically adds a new line.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
*/
import java.lang.*;
import java.util.*;

public class perfect_array {
    public static void main(String[] args) {
        int Arr[] = { 1, 2, 3, 4, 5 };

        boolean iRet = IsPerfect(Arr, 5);
        System.out.println(iRet);
    }

    public static boolean IsPerfect(int a[], int n) {
        boolean bVal = true;

        int b[] = new int[n];
        int count = 0;
        int j = 0;
        for (int i = (n - 1); i >= 0; i--) {

            b[count] = a[i];
            count++;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != b[j]) {
                bVal = false;
                break;
            }
            j++;
        }

        return bVal;
    }
}
