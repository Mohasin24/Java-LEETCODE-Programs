/* 
 Que :- Write a function to print the sum of all odd numbers from 1 to n
*/

import java.lang.*;
import java.util.*;

class oddSum    
{
    public static void printSum(int n)
    {
        int Sum = 0;

        for(int i = 1; i<=n; i++)
        {   
            if(i%2!=0)
            {
                Sum = Sum + i;
            }
        }
        System.out.println("Sum of all odd number till "+n+" = "+Sum);
        return;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a number :  ");
        num = sc.nextInt();

        printSum(num);
    }    
}
