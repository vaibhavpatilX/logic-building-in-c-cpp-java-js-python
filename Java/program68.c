///////////////////////////////////////////////////////
//
//  File name :     program68.c
//  Descreption :   Accept Input Number and and Display Count of Digits from that Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int CountDigits(int iValue)
{
    int iCnt = 0;

    if(iValue < 0)
    {
        iValue = -iValue;
    }
    while(iValue > 0)
    {
        iValue = iValue / 10;
        iCnt++;
    }
    return iCnt;    
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("---- This Application is used to used to  Display Count of Digits from that Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    iRet = CountDigits(iNo);
 
    printf("Number of Digits in %d Number is %d",iNo,iRet);

    return 0;
}

