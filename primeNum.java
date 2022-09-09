/*
Que : -Make a function to check if a number is prime or not 
*/

import java.lang.*;
import java.util.*;

class primeNum 
{
    public static void checkNum(int n)
    {
        if(n%2==0)
        {
            System.out.println("The numebr " + n + " is a prime number.");
        }
        else
        {
            System.out.println("The numebr " + n + " is not a prime number.");   
        }
    }   
    
    public static void main(String arg[])
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :-  ");
        num = sc.nextInt();

        checkNum(num);
    }
}
