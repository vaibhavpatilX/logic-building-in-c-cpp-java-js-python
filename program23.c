///////////////////////////////////////////////////////
//
//  File name :     program23.c
//  Descreption :   Used to Check Number is Divisible by 5 and 3 or not
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>
#include<stdbool.h>

bool CheckDivisible(int iNo)
{
    bool bResult = false;

    if(((iNo % 5 ) == 0) && ((iNo % 3)== 0))
    {
        bResult =  true;
    }
    else
    {
        bResult =  false;
    }
    return bResult;
}

int main()
{
    int iNo = 0;
    bool bRet = false;

    printf("_____________________________________________________________________\n");
    printf("--------- This program is used to Check Number is Even or Odd ---------\n");
    printf("_____________________________________________________________________\n");

    printf("Enter a number to Check wheather Number is Divisible by 5 and 3: ");
    scanf("%d",&iNo);

    bRet = CheckDivisible(iNo);

    if(bRet == true)
    {
        printf("%d is Divisble by 5 and 3...!",iNo);
    }
    else
    {
        printf("%d is not Divisble by 5 or 3...!",iNo);
    }
    printf("\n_____________________________________________________________________");
    return 0;
}