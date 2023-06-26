/**
 * @file 01_perimeter_rectangle.c
 * @author Mohasin Patel
 * @brief
 * @version 0.1
 * @date 2022-06-02
 *
 * @problem statement :- write a program to calculate perimeter of rectangle, take side a & b from user.
 *
 * formula P = 2(l*w)
 */

#include <stdio.h>

float periMeter(float, float);

int main()
{
    auto float a = 0.0;
    auto float b = 0.0;
    auto float Ret = 0.0;

    printf("Please enter the first side of rectangle :-\n");
    scanf("%f", &a);

    printf("Please enter the second side of rectangle :-\n");
    scanf("%f", &b);

    Ret = periMeter(a, b);

    printf("The perimeter of rectangle is :- %0.2f\n", Ret);

    return 0;
}

float periMeter(float fNo1, float fNo2)
{
    auto float Ans = 2 * (fNo1 * fNo2);
    return Ans;
}
