/* 
Problem Statement :
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

 

Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
 

Constraints:

3 <= salary.length <= 100
1000 <= salary[i] <= 106
All the integers of salary are unique.
*/

public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary_1491 
{
    public static void main(String[] args) {
        Solution sl =  new Solution();
        System.out.println(sl.average(new int[] {4000,3000,1000,2000}));

    }    
}

class Solution {
    public double average(int[] salary) 
    {
        int max = salary[0]; 
        int min = salary[0];
        int sum = 0;

        for(int x : salary)
        {
            sum += x;

            if(x>max)
            {
                max = x;
            }

            if(x<min)
            {
                min = x;
            }
        }   

        return (double)(sum-max-min)/(salary.length-2);
    }
}