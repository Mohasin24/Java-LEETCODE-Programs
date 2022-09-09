/*
 Que : Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
*/

import java.lang.*;
import java.util.*;

class power 
{   
    public static int calcuPower(int x, int n)
    {   
        int ret = 1;
        while(n>0)
        {
            ret = ret*x;
            n--;
        }
        return ret;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, power;

        System.out.print("Enter first number :  ");
        num1 = sc.nextInt();

        System.out.print("Enter second number :  ");
        num2 = sc.nextInt();

        power = calcuPower(num1, num2);

        System.out.println(num1+" to the power "+num2 + " = "+ power);
        

    }

}
