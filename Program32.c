///////////////////////////////////////////////////////
//
//  File name :     program26.c
//  Descreption :   Factoria;
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>
#define ERR_INVALID -1


unsigned long Factorial(unsigned int iValue)
{
    int iCnt = 0;
    unsigned long iFact = 1;

    if(iValue < 0)
    {
        return ERR_INVALID;
    }
    for(iCnt = iValue;iCnt >= 1;iCnt--)
    {
        iFact = iFact * iCnt;
    }
    return iFact;
}

int main()
{
    unsigned int iValue = 0;
    unsigned long iRet = 0;

    printf("_____________________________________________________________________\n");
    printf("--------- This program is used for Factorial ---------\n");
    printf("_____________________________________________________________________\n");

    printf("Enter a number : ");
    scanf("%u",&iValue);

    iRet = Factorial(iValue);

    if(iRet == ERR_INVALID)
    {
        printf("Invalid Input..!");
    }
    else
    {
        printf("Factorial is : %lu\n",iRet);
    }
    printf("\n_____________________________________________________________________");
    return 0;
}