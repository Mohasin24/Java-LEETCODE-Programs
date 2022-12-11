/* 
Que :- Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”

*/
import java.lang.*;
import java.util.*;

public class replace_string 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg)
    {
        System.out.print("Enter the string :- ");
        String original = sc.next();

        String iRet_str = replace_string(original);
        
        System.out.println("The original String is :- "+original);
        System.out.println("Replaced String is :- "+iRet_str);
        
    }

    public static String replace_string(String original)
    {
        String result="";

        for(int i=0; i<original.length(); i++)
        {
            if(original.charAt(i)=='e')
            {
                result=result+'i';
            }
            else
            {
                result = result+original.charAt(i);
            }

        }
        return result;
    }
}
