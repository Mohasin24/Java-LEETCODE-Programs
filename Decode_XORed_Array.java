/* 
Problem statement :
There is a hidden integer array arr that consists of n non-negative integers.
It was encoded into another integer array encoded of length n - 1, such that 
encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first 
element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

Example 1:

Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
*/

import java.lang.*;
import java.util.*;

public class Decode_XORed_Array 
{
    public static void main(String arg[])
    {
        int encode[] = {1,2,3};
        int firstElem = 1;

        Solution sl = new Solution();

        int iRet[] = sl.decode_brute(encode, firstElem);

        System.out.println(Arrays.toString(iRet));

        iRet = sl.decode_list(encode, firstElem);

        System.out.println("Using arrayList : " + Arrays.toString(iRet));

    }    
}

class Solution {
    public int[] decode_brute(int[] encoded, int first) 
    {
        int arr[] = new int[encoded.length+1];
        arr[0] = first;

        for(int i = 1; i<arr.length; i++)
        {
            arr[i] = arr[i-1] ^ encoded[i-1];
        }    

        return arr;
    }

    public int[] decode_list(int[] encoded, int first) {
        List<Integer> stored = new ArrayList<>();
        stored.add(first);
        
        for(int i = 0; i < encoded.length; i++){
            int value = stored.get(i) ^ encoded[i];
            stored.add(value);
        }
        int [] ret = new int[stored.size()];
        for(int i = 0; i < stored.size(); i++){
            ret[i] = stored.get(i);
        }

        return ret;
    }
}
