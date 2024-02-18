/*
There are two types of variables local and global
BSS :- Block Starting with symbol
Non-BSS :- Block starting with value

*/

#include <stdio.h>

int iNo1 = 11; // Global initialised variable memory location Non-BSS of data section

int iNo2; // Global non-initialised variable memory location BSS of data section
          // default value '0' in case of integer, for float/double and character it is '0.0' , '\0

int main()
{
    int A = 21; // Local intialised variable memory location stack

    int B; // Local non-intialised variable memory location stack may contain garbage

    printf("Global initialised variable (iNo1):-%d\n", iNo1);
    printf("Global non-initialised variable with default value (iNo1) :-%d\n", iNo2);
    printf("Local initialised variable (A):- %d\n", A);
    printf("Local non-initialised variable (B) may contain garbage :-%d\n", B);
    return 0;
}