/* 
 Que :- Write a function that takes in the radius as input and returns the circumference of a circle.
*/

import java.lang.*;
import java.util.*;

class circleCircum 
{
    public static void circleCir(float rad)
    {
        double iRet = 2*3.14*rad;

        System.out.println("Circumference of circle = "+iRet);
        return;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        float radius = 0;
        System.out.print("Enter radius :-  ");
        radius = sc.nextFloat();

        circleCir(radius);
    }    
}
