///////////////////////////////////////////////////////
//
//  File name :     program21.c
//  Descreption :   Used to Check Even or Odd
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>
#include<stdbool.h>

bool CheckEven(int iNo)
{
    return((iNo % 2) == 0);
}

int main()
{
    int iNo = 0;
    bool bRet = false;

    printf("_____________________________________________________________________\n");
    printf("--------- This program is used to Check Number is Even or Odd ---------\n");
    printf("_____________________________________________________________________\n");

    printf("Enter a number: ");
    scanf("%d",&iNo);

    bRet = CheckEven(iNo);

    if(bRet == true)
    {
        printf("%d is Even Number...!",iNo);
    }
    else
    {
        printf("%d is Odd Number...!",iNo);
    }
    printf("\n_____________________________________________________________________");
    return 0;
}