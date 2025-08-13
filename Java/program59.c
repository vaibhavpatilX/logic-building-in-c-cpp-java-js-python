///////////////////////////////////////////////////////
//
//  File name :     program59.c
//  Descreption :   Accept Input and Calculate Factors and Display
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>


int DisplayFactors(int iValue)
{
   int iCnt = 0;

   for(iCnt = 1;iCnt <= (iValue /2);iCnt++)
   {
        if((iValue % iCnt) == 0)
        {
            printf("%d",iCnt);
        }
   }
}

int main()
{
    int iNo = 0;
    
    printf("---- This Application is used to Check Number is Even or Not ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    DisplayFactors(iNo);

    return 0;
}

