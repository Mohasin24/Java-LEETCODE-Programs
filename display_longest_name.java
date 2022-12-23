// Given a list of names, display the longest name.


// Example:

// Input:
// N = 5
// names[] = { "Hello", "Hi", "Welcome","Namste", "Hi Namste welcome" };

// Output:
// Hi Namste welcome

import java.lang.*;
import java.util.*;

public class display_longest_name 
{
    public static void main(String[] args) 
    {
        String names[] = { "Hello", "Hi", "Welcome","Namste", "Hi Namste welcome" };

        String iRet = longest(names, names.length);

        System.out.println(iRet);
    }

    public static String longest(String names[], int n) 
    {   
        String longestName= names[0];
        for(int i = 0; i<n; i++)
        {
           if(names[i].length()>longestName.length())
           {
               longestName = names[i];
           }
        }
        return longestName;
    }
}
