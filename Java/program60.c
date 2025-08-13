///////////////////////////////////////////////////////
//
//  File name :     program60.c
//  Descreption :   Accept Input and Calculate Factors and Display
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplayFactors(int iValue)
{
    int iCnt = 0;

    for(iCnt = 1;iCnt <= (iValue / 2); iCnt++)
    {
        if((iValue % iCnt) == 0)
        {
            printf("%d\n",iCnt);    
        }
    }
}

int main()
{
    int iNo = 0;
    
    printf("---- This Application is used to Display Factors of a Number----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    DisplayFactors(iNo);

    return 0;
}

