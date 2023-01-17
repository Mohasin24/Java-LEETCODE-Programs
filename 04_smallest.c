/**
 * @file 04_smallest.c
 * @author Mohasin Patel
 * @brief 
 * @version 0.1
 * @date 2022-06-02
 * 
 * @problem statement :- Write a program to print the smallest number of two.
 * 
 */

#include<stdio.h>

int main()
{
    int iNum1 = 0, iNum2 = 0;
    
    printf("Please enter first number :-\n");
    scanf("%d",&iNum1);
    printf("Please enter second number :-\n");
    scanf("%d",&iNum2);

    if(iNum1<iNum2)
    {
        printf("Number %d is smallest.\n",iNum1);
    }
    else
    {
        printf("Number %d is smallest.\n",iNum2);
    }

    return 0;
}