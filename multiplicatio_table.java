
import java.lang.*;
import java.util.*;

public class multiplicatio_table 
{   
    public static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])    
    {
        System.out.print("Enter a number to print multiplication table :-  ");

        int N = sc.nextInt();

        multiTable(N);
    }

    public static void multiTable(int N)
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println(N + " x   " + i + " = " + (i*N));
        }
    }
}
