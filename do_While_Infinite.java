/*
 Que :- Write an infinte loop using do while loop.
*/

import java.lang.*;
import java.util.*;

class do_While_Infinite 
{
    public static void main(String arg[])    
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do 
        {
            if(num==1)
            {
                System.out.println("Exited");
                break;
            }
            System.out.println("This is an infinte loop.");
            System.out.print("Press 1 to exit else press any key to continue : ");
            num = sc.nextInt();

        }while(true);
    }
}
