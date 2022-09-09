/* 
 Que :- Write a function that takes in age as input and return if that person is eligible to vote or not. A person of Age > 18 is eligible to vote
*/

import java.lang.*;
import java.util.*;

class vote
{   
    public static void check(int num) 
    {
        if(num>18)
        {
            System.out.println("Your eligible to vote.");
            return;
        }
        else
        {
            System.out.println("Your are not eligible to vote.");
            return;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        while(true)  // infinite while loop
        {   
            
            System.out.print("Enter age :  ");
            age = sc.nextInt();
            
            if(age>0)
            {
                break;
            }
            else
            {
                System.out.println("Enter valid age.");
            }
        }
        
        check(age);

    }
}