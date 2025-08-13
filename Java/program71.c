///////////////////////////////////////////////////////
//
//  File name :     program71.c
//  Description :   Accept Input Number and Display Even Digits from that Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplayEven(int iValue)
{

    if(iValue < 0)
    {
        iValue = -iValue;
    }
    while(iValue != 0)
    {        
        if( ((iValue % 10) % 2) == 0)
        {
            printf("%d\n",(iValue % 10));
        }
        iValue = iValue / 10;
    }
}

int main()
{
    int iNo = 0;

    printf("---- This Application is used to Display Even Digits from that Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    printf("Even Digits in Number %d are : \n",iNo);
    DisplayEven(iNo);

    return 0;
}
