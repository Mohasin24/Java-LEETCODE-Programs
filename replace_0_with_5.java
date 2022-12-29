/* 
You are given an integer N. You need to convert all zeroes of N to 5.
Example 1:

Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
*/
import java.lang.*;
import java.util.*;

public class replace_0_with_5 
{
    public static void main(String arg[])
    {
        int iNum = 140080405;

        int iRet = convertfive3(iNum);

        System.out.println(iRet);
    }

    // first method 
    public static int convertfive1(int num) 
    {
        // converted integer to string
        String S = Integer.toString(num);

        //repplaced all zero with 5
        String modified = S.replace('0','5');
        
        // converted string to integer using parseInt method
        int result = Integer.parseInt(modified);
        
        return result;
    }

    // second method 

    public static int convertfive2(int num) 
    {   
        int newNum = num + replaceZero(num);
        return newNum;
    }

    public static int replaceZero(int num)
    {
        // replace 0's with 5

        int result = 0;
        int remainder = 0;
        int decimal = 1;

        if(num==0)
        {
            result = result+(5*decimal);
            return result;
        }
        else
        {
            while (num > 0) 
            {   
                remainder = num % 10;

                if (remainder == 0) 
                {
                    result = result + (5 * decimal);
                }

                num = num / 10;

                 // update decimal by 1 place
                 decimal = decimal * 10;
            }
            System.out.println(result);
            return result;
        }
    }

    // third method 
    public static int convertfive3(int num) 
    {
        int remainder = 0;
        int result = 0;
        int reverseNum = 0;
        while(num>0)
        {
            remainder = num%10;

            if(remainder==0)
            {
                result = result*10 + 5;
            }
            else
            {
                result = result*10 + remainder;
            }
            
            num = num/10;

        }

        // reverse the number

        remainder = 0;

        while(result>0)
        {
            remainder = result%10;

            reverseNum = reverseNum*10 + remainder;

            result = result/10;
        }

        return reverseNum;
    }
}
