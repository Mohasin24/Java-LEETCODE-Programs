/* 
Problem Statement :- 
Given a string, remove the vowels from the string.

Example 1:

Input: S = "welcome to geeksforgeeks"
Output: wlcm t gksfrgks
Explanation: Ignore vowels and print other
characters

Your task:
Your task is to complete the function removeVowels() which takes a single string as input and returns the modified string. You need not take any input or print anything.

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(1)

Constraints:
1 <= |S| <= 105
Alphabets are lower cases only
*/

import java.lang.*;
import java.util.*;

public class Remove_vowels_from_string {

    
    public static void main(String[] args) {

        String name = "patel";

        System.out.println(removeVowels(name));
        
    }

    public static String removeVowels(String S) {
        String ret = new String();
        int n =S.length();

        // for(int i=0; i<n; i++)
        // {
        //     if(S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i' || S.charAt(i)=='o' || S.charAt(i)=='u')
        //     {
        //         continue;
        //     }
        //     else{
        //         ret = ret+S.charAt(i);
        //     }
        
        // }

        // to achieve best time complexiety use the below function
        ret=S.replaceAll("[AEIOUaeiou]", "");

        return ret;
    }
    
}
