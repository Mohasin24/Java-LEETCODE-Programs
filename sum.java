/*
Que :- Make a function to add 2 numbers and return the sum
*/

import java.lang.*;
import java.util.*;

class sum
{   
    public static int addition(int n1, int n2)
    {
        int sum = 0;
        sum = n1+n2;
        return sum;
    }
    public static void main(String arg[])
    {
        int num1 = 0, num2 = 0, iRet = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number :-  ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number :-  ");
        num2 = sc.nextInt();

        iRet = addition(num1, num2);

        System.out.println("The addition is :- "+iRet);

    }
}