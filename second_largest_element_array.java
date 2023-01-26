/* 
Problem statement : Find the second largest element in an array
*/
import java.lang.*;

public class second_largest_element_array 
{
   public static void main(String arg[]) 
   {
        int A[] = {3,9,7,8,12,6,15,5,4,10,25,45};

        int iRet = second_largest(A);

        System.out.println("Second largest element is : "+ iRet);
   }

   public static int second_largest(int [] A)
   {
        int first = A[0], second = 0;

        for(int i = 0; i<A.length; i++)
        {
            if(A[i]>first)
            {
                second = first;
                first = A[i];
            }
            else if(A[i]>second)
            {
                second = A[i];
            }
        }

        return second;
   }
}
