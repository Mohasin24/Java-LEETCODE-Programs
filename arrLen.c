#include<stdio.h>
int arrLen(int []);
int main()
{
    int iCnt = 1;
    
    int arr[] = {10,20,30,40,50,60,70,80};
    int i = arrLen(arr);

    // int arrLen = sizeof(arr)/sizeof(arr[0]);
    
    printf("The length of array is %d\n",arrLen);
    

    return 0;
}

int arrLen(int arr[])
{   
    printf("size %d\n",sizeof(arr));
    int arrLen = sizeof(arr)/sizeof(arr[0]);
    return arrLen;
}