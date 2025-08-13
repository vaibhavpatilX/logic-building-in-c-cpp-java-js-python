#include<stdio.h>

int main()
{
    int Arr[5];
    int iCnt=0;
    printf("Enter the elements:");

    scanf("%d",&Arr[0]);
    scanf("%d",&Arr[1]);
    scanf("%d",&Arr[2]);
    scanf("%d",&Arr[3]);
    scanf("%d",&Arr[4]);

    printf("Elements from the array are:   \n");

    for(iCnt =  0;iCnt<5;iCnt++)
    {
        printf("%d\n",Arr[iCnt]);
    }
    return 0;
}