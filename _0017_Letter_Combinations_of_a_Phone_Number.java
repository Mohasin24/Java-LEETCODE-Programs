/* 
Poblem Statement :
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/

import java.util.List;
import java.util.ArrayList;

public class _0017_Letter_Combinations_of_a_Phone_Number
{
    public static void main(String[] args)
    {
        Solution sl = new Solution();
        System.out.println(sl.letterCombinations("23"));
    }
}

class Solution {
    public List<String> letterCombinations(String digits) 
    {
        ArrayList<String> list = new ArrayList<>();

        String[] kp = {"","","abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        combination(digits, kp, "",list);

        return list;    
    }

    private void combination(String dig,String[] kp, String res, ArrayList<String> list)
    {
        if(dig.length() == 0)
        {
            if(!res.equals(""))
            {
                list.add(res);
            }
            return;
        }

        int currIdx = dig.charAt(0) -'0';
        String curr = kp[currIdx];

        for(int i = 0; i<curr.length(); i++)
        {
            combination(dig.substring(1),kp,res+curr.charAt(i),list);
        }
    }
}