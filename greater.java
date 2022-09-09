/*
 Que :- Write a function which takes in 2 numbers and return the greater of those two
*/

import java.lang.*;
import java.util.*;

class greater 
{   
    public static void printGreater(int n1,int n2)
    {
        if(n1>n2)
        {
            System.out.println(n1 + " is greater than "+ n2);
        }
        else
        {
            System.out.println(n2 + " is greater than "+ n1);
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int num1  = 0, num2 = 0;

        System.out.print("Enter first number :-  ");
        num1 = sc.nextInt();
        System.out.print("Enter second number :-  ");
        num2 = sc.nextInt();

        printGreater(num1,num2);
    }    
}
