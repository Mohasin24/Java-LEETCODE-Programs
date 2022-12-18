/* 
Problem Statement :-
A and B are good friend and programmers. They are always in a healthy competition with each 
other. They decide to judge the best among them by competing. They do so by comparing their 
three skills as per their values. Please help them doing so as they are busy.

Set for A are like [a1, a2, a3]
Set for B are like [b1, b2, b3]

Compare ith skill of A with ith skill of B
if a[i] > b[i] , A's score increases by 1
if a[i] < b[i] , B's score increases by 1
if a[i] = b[i] , nothing happens

Example 1:

Input : 
A = {4, 2, 7}
B = {5, 6, 3}
Output : 
1 2 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function scores() 
which takes the array A[], B[] as inputs and two reference variables ca and cb to store the 
final answer. Store the score of A in ca and score of B in cb.
*/

import java.lang.*;
import java.util.*;

public class skills 
{
    public static Scanner sc = new Scanner(System.in);
    static long ca=0, cb=0;
    public static void main(String arg[])
    {   
        int size = 0;
        System.out.print("Enter size of array :  ");
        size = sc.nextInt();
        
        long Arr[] = new long[size];
        long Brr[] = new long[size];

        for(int i = 0; i<size; i++)
        {
            System.out.print("Enter elemnt at Arr["+i+"] :  " );
            Arr[i] = sc.nextLong();
            
            System.out.print("Enter elemnt at Brr["+i+"] :  " );
            Brr[i] = sc.nextLong();
            System.out.println();
        }

        scores(Arr, Brr);

        System.out.println(ca + "  "+cb);

    }

    public static void scores(long a[], long b[]) {
        
        skills.ca=0;
        skills.cb=0;
        for(int i=0; i<a.length; i++)
        {
   
                if(a[i]>b[i])
                {
                    skills.ca++;
                }
                else if(a[i]<b[i])
                {
                    skills.cb++;
                }
        }
    }
}
