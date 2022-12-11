/* 
Que :- Take an array of strings input from the user & find the cumulative (combined) length of all those strings. 
*/

import java.lang.*;
import java.util.*;

public class combined_length 
{   
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg)    
    {
       array_str_len();
    }

    public static void array_str_len()
    {
        int size;
        System.out.print("Enter size of string array :- ");
        size = sc.nextInt();
        
        String arr[] = new String[size];

        int totalLen = 0;

        for(int i=0; i<size; i++)
        {   
            System.out.print("Enter string at index "+i+" :-  " );

            arr[i] = sc.next();

            totalLen = totalLen+arr[i].length();
        }

        System.out.println("The combined length of all string object in an array is :- "+totalLen);
    }
}
