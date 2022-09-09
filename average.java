/* 
 Que :- Enter three numbers from the user & make a function to print their average.
*/

import java.lang.*;
import java.util.*;

class average {
    public static void printAverage(int n1, int n2, int n3) {
        int avg = 0;

        avg = (n1 + n2 + n3) / 3;
        System.out.println("Average = " + avg);
        return;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;

        System.out.print("Number 1 :  ");
        num1 = sc.nextInt();
        System.out.print("Number 2 :  ");
        num2 = sc.nextInt();
        System.out.print("Number 3 :  ");
        num3 = sc.nextInt();

        printAverage(num1, num2, num3);

    }

}
