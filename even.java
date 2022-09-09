/* 
 Que :- Make a function to check if a given number n is even or not.
*/

import java.lang.*;
import java.util.*;

class even {
    public static int checkNum(int n) {
        int ret = 0;

        if (n > 0) {
            if (n % 2 == 0) {
                ret = 1;
            } else {
                ret = 0;
            }
        } else if (n < 0) {
            ret = -1;
        }

        return ret;
    }

    public static void display(int n1) {
        int iRet = 0;
        iRet = checkNum(n1);

        if (iRet == 1) {
            System.out.println("Given number " + n1 + " is a even number.");
        } else if (iRet == -1) {
            System.out.println("Enter valid input.");
        } else if (iRet == 0) {
            System.out.println("Given number " + n1 + " is not an even number.");
        }
    }

    public static void main(String arg[]) {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number :  ");
        num = sc.nextInt();

        display(num);

    }
}
