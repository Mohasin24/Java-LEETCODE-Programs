/*
1> In c there is four major datatypes as character, integer, float and double
*/

#include <stdio.h>

int main()
{
    char c = 'A';
    int i = 11;
    float f = 3.14;     // less accuracy
    double d = 51.2586; // more accuracy

    printf("The size of character :- %d bytes.\n", sizeof(c));
    printf("The size of integer :- %d bytes.\n", sizeof(i));
    printf("The size of float :- %d bytes.\n", sizeof(f));
    printf("The size of double :- %d bytes.\n", sizeof(d));

    return 0;
}