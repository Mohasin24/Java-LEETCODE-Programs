/* 
Problem Statement :
A sentence is a list of words that are separated by a single space with no leading or 
trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then 
rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 
This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return 
the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", 
then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", 
then remove the numbers.
 

Constraints:

2 <= s.length <= 200
s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
The number of words in s is between 1 and 9.
The words in s are separated by a single space.
s contains no leading or trailing spaces.

*/
import java.lang.*;
import java.util.Arrays;

public class sorting_sentence 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.sortSentence("is2 sentence4 This1 a3"));
    }    
}

class Solution 
{
    public String sortSentence(String s) 
    {
        // create the array of string without spaces 
        String a[] = s.split(" ");

        // array contains string with sorted string by the index
        String ans[] = new String[a.length];

        for (int i = 0; i < a.length; i++) 
        {   
            // gives number at the end of each string. e.g. "This1" here index = 1
            int index = a[i].charAt(a[i].length() - 1) - '0';

            // array index start from 0
            //inserting substring of each string from 0 to string length -1 to ignore the last number 
            // e.g. "This1" a[0] = a[i].substring(0, a[i].length() - 1) = "This"
            ans[index - 1] = a[i].substring(0, a[i].length() - 1);
        }

        return String.join(" ", ans);
    }
}
// class Solution {
//     public String sortSentence(String s) 
//     {
//         int num = 0, start = 0;

//         StringBuilder str = new StringBuilder();

//         for(int i = 0; i<s.length(); i++)
//         {
//             if(s.charAt(i)!=' ')
//             {
//                 str = str.append(s.charAt(i));
//             }

//             if(s.charAt(i)>'0' && s.charAt(i)<='9')
//             {
//                 num++;
//             }
//         }

//         String a[] = new String[num];

//         for(int i = 0; i<num; i++)
//         {
//             for(int j =start; j<str.length(); j++)
//             {                
//                 if((str.charAt(j)>='1' && str.charAt(j)<='9'))
//                 {
                
//                     int index = str.charAt(j)-'0';

//                     a[index-1] = str.substring(start,j);
                  
//                     start = j+1;
                    
//                     break;
//                 }
//             }
//         }

//         str = new StringBuilder();

//         for(int i =0; i<a.length; i++)
//         {   
//             if(i!=a.length-1)
//             {
//                 str = str.append(a[i]).append(" ");
//             }
//             else
//             {
//                 str = str.append(a[i]);
//             }
            
//         }


//         return str.toString();
        
//     }
// }
