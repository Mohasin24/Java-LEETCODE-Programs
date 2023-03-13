/* 
Problem Statement :
You are given an array items, where each items[i] = [typei, colori, namei] describes
the type, color, and name of the ith item. You are also given a rule represented by
two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

 

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
*/

import java.util.*;
public class Count_item_matching_rule_1773 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        List<List<String>> out = new ArrayList<List<String>>();

        out.add(List.of("phone","blue","pixel"));
        out.add(List.of("computer","silver","phone"));
        out.add(List.of("phone","gold","iphone"));

        // for(int i = 0; i<out.size(); i++)
        // {   
        //     List<String> in = out.get(i);

        //     for(int j = 0; j<in.size();j++)
        //     {
        //         System.out.print(in.get(j)+" ");
                
        //     }
        //     System.out.println();
        // }

        System.out.println(sl.countMatches(out, "type", "phone"));
    }    
}

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int res = 0;

        int j = 0;

        switch(ruleKey)
        {
            case "type" :
                j = 0;
                break;
            case "color" :
                j = 1;
                break;
            case "name" :
                j = 2;
                break;     
            
        }

        for(int i = 0; i<items.size(); i++)
        {
            if(items.get(i).get(j).equals(ruleValue))
                res++;
        }  

        return res;  
    }
}
