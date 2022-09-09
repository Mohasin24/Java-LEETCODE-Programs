/* 
 Make a function to print the table of a given number
*/

import java.lang.*;
import java.util.*;

class table 
{   
    public static void printTable(int n)
    {
        if(n>0)
        {
            for(int i = 1; i<=10; i++)
            {
                System.out.println(n+" * " + i + " = " +(n*i));
                
            }
            return;
        }
        else if(n<=0)
        {
            System.out.println("Enter valid input.");
            return;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter a number to print a table :  ");
        num = sc.nextInt();

        printTable(num);

    }    
}
