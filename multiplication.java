/*
 make a function to multiply 2 numbers and return the product
*/

import java.lang.*;
import java.util.*;

class multiplicatio
{   
    public static float multi(float n1, float n2)
    {   
        float mul = n1*n2;
        return mul;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        float num1,num2,iRet;

        System.out.print("Enter 1st number :-  ");
        num1 = sc.nextFloat();
        System.out.print("Enter 2nd number :-  ");
        num2 = sc.nextFloat();

        iRet = multi(num1, num2);

        System.out.println("Multiplication of two number is :- ");
        System.out.format("%.2f",iRet); // to format a number upto n decimal places
    }
}