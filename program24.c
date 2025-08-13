///////////////////////////////////////////////////////
//
//  File name :     program24.c
//  Descreption :   Used to Check Number is Divisible by 5 and 3 or not
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int Summation(int iValue)
{
    int iCnt = 0;
    int iSum =0;

    for(iCnt = 1;iCnt <= iValue;iCnt++)
    {
        iSum = iSum + iCnt;

    }
    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("_____________________________________________________________________\n");
    printf("--------- This program is used to do Addition ---------\n");
    printf("_____________________________________________________________________\n");

    printf("Enter a number to : ");
    scanf("%d",&iValue);

    iRet = Summation(iValue);

    printf("Addition is : %d",iRet);
    printf("\n_____________________________________________________________________");
    return 0;
}