///////////////////////////////////////////////////////
//
//  File name :     program54.c
//  Descreption :   Accept Input and Perform Addition And Display Result  
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int main()
{
    int iNo1 = 0,iNo2 = 0;
    int iResult = 0;

    printf("---- This Application is used to perform Addition ----\n");

    printf("Enter First Number: ");
    scanf("%d",&iNo1);

    printf("Enter Second Number: ");
    scanf("%d",&iNo2);

    iResult = iNo1+ iNo2;

    printf("Addition is : %d",iResult);

    return 0;
}