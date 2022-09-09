/*
 Que :- Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered; Also you show how many numbers are entered by the user.
*/

import java.lang.*;
import java.util.*;

class infiniteNum 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int user = 0, positive = 0, negative = 0, zeros = 0, totalNum = 0;

        System.out.print("How many number's you want to input? :  ");
        user = sc.nextInt();

        int arr[] = new int[user];

        for(int i = 0; i<user; i++)
        {
            System.out.print("Enter a number at index "+i+" :  ");
            arr[i] = sc.nextInt();
            totalNum++;

            if(arr[i]> 0)
            {
                System.out.println("You have entered a positive number.");
                positive++;
            }
            else if(arr[i]<0)
            {
                System.out.println("You have entered a negative number.");
                negative++;
            }
            else if(arr[i]==0)
            {
                System.out.println("You have entered zero.");
                zeros++;
            }
        }

        System.out.println("Total numbers enetered : "+totalNum);
        System.out.println("Total positive numbers entered : "+positive);
        System.out.println("Total negative numbers entered : "+negative);
        System.out.println("Total zero's entered : "+zeros);
    }    
}
