/* 
Problem Statement :
You are given a non-negative floating point number rounded to two decimal places 
celsius, that denotes the temperature in Celsius.
You should convert Celsius into Kelvin and Fahrenheit and return it as an array 
ans = [kelvin, fahrenheit].
Return the array ans. Answers within 10-5 of the actual answer will be accepted.

Note that:

Kelvin = Celsius + 273.15
Fahrenheit = Celsius * 1.80 + 32.00
 
Example 1:

Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted 
in Fahrenheit is 97.70.
*/

import java.lang.*;
import java.util.*;

public class convert_temperature 
{
    public static void main(String[] args) {
        
        Solution sl = new Solution();

        System.out.println(Arrays.toString(sl.convertTemperature(36.50)));
    }
}

class Solution {
    public double[] convertTemperature(double celsius) 
    {
        return new double[] {(celsius + 273.15),((celsius * 1.80) + 32)};
    }
}