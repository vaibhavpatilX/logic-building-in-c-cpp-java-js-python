///////////////////////////////////////////////////////
//
//  File name :     program72_1.c
//  Description :   Accept Input Number and Display Summation of Even Digits from that Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int DisplayEven(int iValue)
{
    int iSum = 0;
    int iDigit = 0;

    if(iValue < 0)
    {
        iValue = -iValue;
    }
    while(iValue != 0)
    {        
        iDigit = iValue % 10;

        if( (iDigit % 2) == 0)
        {
            iSum = iSum + iDigit;
        }
        iValue = iValue / 10;
    }
    return iSum;
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("---- This Application is used to Display Summation of Even Digits from that Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);
    
    iRet = DisplayEven(iNo);
    
    printf("Summation of Even Digits in Number %d are : %d\n",iNo,iRet);

    return 0;
}
