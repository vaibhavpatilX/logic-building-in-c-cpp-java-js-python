///////////////////////////////////////////////////////
//
//  File name :     program73.c
//  Description :   Accept Input Number and Display //  Description :   Accept Input Number and Display Reverse that Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int Reverse(int iValue)
{
    int iDigit = 0,iRev = 0;

    if(iValue < 0)
    {
        iValue = -iValue;
    }

    while(iValue != 0)
    {        
        iDigit = iValue % 10;
        iRev = iRev * 10 + iDigit;
        iValue = iValue / 10;
    }
    return iRev;
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("---- This Application is used to Display Reverse that Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);
    
    iRet = Reverse(iNo);

    printf("Reverse Number is : %d",iRet);
    
    return 0;
}
