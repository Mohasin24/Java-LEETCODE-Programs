/* 
Problem Statement :
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if 
sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

*/

public class panagram_sentence 
{
    public static void main(String arg[])    
    {
        Solution sl = new Solution();

        System.out.println(sl.checkIfPangram("thequckbrownfoxjumpsoverthelazydog"));
    }
}

//optimized solution
class Solution {
    public boolean checkIfPangram(String s) 
    {   
        for(char i = 'a'; i<='z'; i++)
        {
            if(s.indexOf(i)==-1)
            {
                return false;
            }
        }
        
        return true;
    }
}

//brute force solution
// class Solution {
//     public boolean checkIfPangram(String s) 
//     {   
//         boolean boolArr[] = new boolean[26];
     
//         for(int i = 0; i<s.length(); i++)
//         {
//             int index = s.charAt(i)-'a';
//             boolArr[index]=true;
//         }

//         for(int i = 0; i<boolArr.length; i++)
//         {
//             if(boolArr[i]==false)
//             {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }