/* 
Problem Statement :
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the 
final value of X after performing all the operations.

Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
*/

import java.lang.*;

public class Final_value_after_operations 
{
    public static void main(String[] args) 
    {
        String s[] = {"--X","X++","X++"};

        System.out.println(finalValueAfterOperations(s));
    }    

    public static int finalValueAfterOperations(String[] operations) 
    {   
        
        int x = 0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].startsWith("+") || operations[i].endsWith("+") )
            {
                x++;
            }
            else //if(operations[i].charAt(0)== '-')
            {
                x--;
            }
            
        }
        return x; 


    }
}


        // int x = 0;

        // for(int i = 0; i<s.length; i++)
        // {
        //     switch(s[i])
        //     {
        //         case "--X" :
        //             x = x-1;
        //             break;
        //         case "X--"  :
        //             x = x-1;
        //             break;    
        //         case "X++" :
        //             x = x+1;
        //             break;
        //         case "++X" :
        //             x= x+1;
        //             break;   
        //     }
        // }

        // return x; 

        // int x = 0;
        // for(int i=0;i<operations.length;i++)
        // {
        //     if(operations[i]=="++X"||operations[i]=="X++")
        //     {
        //         x++;
        //     }
        //     else if(operations[i]=="--X"||operations[i]=="X--")
        //     {
        //         x--;
        //     }
            
        // }
        // return x;  
        