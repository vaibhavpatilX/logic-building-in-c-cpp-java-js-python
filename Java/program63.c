///////////////////////////////////////////////////////
//
//  File name :     program63.c
//  Descreption :   Accept Input and Calculate Summation of Non-Factors of Number and Display
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int DisplaySumNonFactors(int iValue)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1;iCnt <= iValue; iCnt++)
    {
        if((iValue % iCnt) != 0)
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

    printf("---- This Application is used to used to Display Summation of Non-Factors of Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    iRet = DisplaySumNonFactors(iNo);

    printf("Summation of Non Factors are : %d",iRet);
    
    return 0;
}

