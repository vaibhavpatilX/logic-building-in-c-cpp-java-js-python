///////////////////////////////////////////////////////
//
//  File name :     program26.c
//  Descreption :   Factoria;
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int Factorial(int iValue)
{
    int iCnt = 0;
    int iFact = 1;

    for(iCnt = 1;iCnt <= iValue;iCnt++)
    {
        iFact = iFact * iCnt;
    }
    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("_____________________________________________________________________\n");
    printf("--------- This program is used to do Addition ---------\n");
    printf("_____________________________________________________________________\n");

    printf("Enter a number : ");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);

    printf("Factorial is : %d",iRet);
    printf("\n_____________________________________________________________________");
    return 0;
}