/**
 * @file 02_cube.c
 * @author Mohasin Patel
 * @brief
 * @version 0.1
 * @date 2022-06-02
 *
 * @problem statement :- Take a number n from user and output its cube(n*n*n)
 *
 */

#include <stdio.h>

int cube(int);

int main()
{

    int n = 0;
    int iRet = 0;
    printf("Please enter the number :-\n");
    scanf("%d", &n);

    iRet = cube(n);

    printf("The cube of %d is :- %d\n", n, iRet);

    return 0;
}

int cube(int iNum)
{
    int iAns = iNum * iNum * iNum;
    return iAns;
}