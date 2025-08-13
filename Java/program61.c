///////////////////////////////////////////////////////
//
//  File name :     program61.c
//  Descreption :   Accept Input and Calculate Summation of Factors and Display
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int DisplaySumFactors(int iValue)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1;iCnt <= (iValue / 2); iCnt++)
    {
        if((iValue % iCnt) == 0)
        {
            iSum = iSum + iCnt;
        }
    }
    return iSum;
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("---- This Application is used to Display Summation of Factors of a Number----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    iRet = DisplaySumFactors(iNo);

    printf("Summation of Factors is : %d",iRet);

    return 0;
}

