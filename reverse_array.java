/* 
Problem Statement : reverse an given array

Input :
arr[] = {1,2,3,4,5};

Output :
arr[] = {5,4,3,2,1}
*/

import java.lang.*;
import java.util.*;

public class reverse_array 
{
    public static void main(String[] args) 
    {
        int arr[] = { 1,2,3,4,5};
        reverse_array(arr);

        System.out.println(Arrays.toString(arr));

    }   
    
    public static void reverse_array(int arr[])
    {   
        int n = arr.length;
  
      // for(int i = 0; i<n; i++)
      // {
      //   for(int j=1; j<n-i; j++)
      //   {
  
      //     int temp = arr[j-1];
      //     arr[j-1] = arr[j];
      //     arr[j] = temp;
      //   }
      // }
        
        for(int i = 0; i<n/2; i++)
        {
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
      
    }
}
