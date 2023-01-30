/* 
Problem Statement :
Insert an element at the particular index and also it should not overwrite the present elements.

Note : There must be a empty position available to feel;

Example :-
index = 2;
number 111;
a[] = [5, 9, 6, 10, 12, 7, 0, 0, 0, 0]
a[] = [5, 9, 111, 6, 10, 12, 7, 0, 0, 0]
*/

import java.lang.*;
import java.util.*;
public class pr_inserting_element_array 
{
    public static void main(String arg[])    
    {
        int a[] = new int[10];

        a[0] = 5;
        a[1] = 9;
        a[2] = 6;
        a[3] = 10;
        a[4] = 12;
       
        
        int index = 6; 
        int num = 111;
        System.out.println(Arrays.toString(a));
        inserElementArray(index, num, a);
        System.out.println(Arrays.toString(a));

    }

    public static void inserElementArray(int index, int n, int []a)
    {   
        for(int i = a.length-1; i>index; i-- )
        {
            a[i]= a[i-1];
        }
        a[index] = n;
    }
}
