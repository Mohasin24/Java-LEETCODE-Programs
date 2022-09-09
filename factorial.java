/*
 Que :- find the factorial of a number
*/

import java.lang.*;
import java.util.*;

class factorial {
    public static void factorialCal(int n) 
    {
        int facto = 1;
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        } 
        else 
        {
            for (int i = 1; i <= n; i++) {
                facto = facto * i;
            }
            
        }
        System.out.println("Factorial of "+n+" is "+facto);
        return;
    }

    public static void main(String arg[]) {
        int num = 0, iRet = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        num = sc.nextInt();
        factorialCal(num);
        
    }
}
