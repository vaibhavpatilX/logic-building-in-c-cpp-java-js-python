///////////////////////////////////////////////////////
//
//  File name :     program62.c
//  Descreption :   Accept Input and Calculate Non-Factors of Number and Display
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplayNonFactors(int iValue)
{
    int iCnt = 0;

    for(iCnt = 1;iCnt <= iValue; iCnt++)
    {
        if((iValue % iCnt) != 0)
        {
            printf("%d\n",iCnt);
        }
    }
}

int main()
{
    int iNo = 0;

    printf("---- This Application is used to used to Display Non-Factors of Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    DisplayNonFactors(iNo);

    return 0;
}

