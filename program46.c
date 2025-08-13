///////////////////////////////////////////////////////
//
//  File name :     program46.c
//  Descreption :   Separate Digit and Display in Reverse from Number
//  Author :        Vaibhav
//  Date :          12/05/2025
//
///////////////////////////////////////////////////////


#include<stdio.h>

void DisplayDigits(int iNo)
{
    int iDigit = 0;

    while(iNo != 0)
    {
        
        iDigit = iNo % 10;
        printf("%d\n",iDigit);
        iNo = iNo / 10;
    }
}

int main()
{
    int iValue = 0;
    
    printf("Enter number: \n");
    scanf("%d",&iValue);
    
    printf("-----------------------------------------------------------------------------------------------\n");
    printf("Number Received is %d\n",iValue);
    printf("-----------------------------------------------------------------------------------------------\n");

    
    DisplayDigits(iValue);
    return 0;
}