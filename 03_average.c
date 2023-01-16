/**
 * @file 03_average.c
 * @author Mohasin Patel
 * @brief
 * @version 0.1
 * @date 2022-06-02
 *
 * @problem statement :- Write a program to calculate average of 3 numbers. Take input from user.
 *
 */

#include <stdio.h>

// function declaration
float claculateAvgerage(float, float, float);

int main()
{
    float fRet = 0, iNo1 = 0, iNo2 = 0, iNo3 = 0;

    printf("Enter no. 1 :-\n");
    scanf("%f", &iNo1);
    printf("Enter no. 2 :-\n");
    scanf("%f", &iNo2);
    printf("Enter no. 3 :-\n");
    scanf("%f", &iNo3);

    //      function call
    fRet = claculateAvgerage(iNo1, iNo2, iNo3);

    printf("The average of three numbers is :- %0.2f\n", fRet);

    return 0;
}

// function definition
float claculateAvgerage(float iNum1, float iNum2, float iNum3)
{
    float fAns = (iNum1 + iNum2 + iNum3) / 3;
    return fAns;
}