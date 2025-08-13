///////////////////////////////////////////////////////
//
//  File name :     program48.c
//  Descreption :   Separate Digit and Count Digits from Number
//  Author :        Vaibhav
//  Date :          12/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int CountDigits(int iNo)
{
    int iCnt = 0;

    while(iNo != 0)
    {
        iNo = iNo / 10;
        iCnt++;
    }
    return iCnt;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter number: \n");
    scanf("%d",&iValue);

    printf("-----------------------------------------------------------------------------------------------\n");
    printf("Number Received is %d\n",iValue);
    printf("-----------------------------------------------------------------------------------------------\n");


    iRet = CountDigits(iValue);

    printf("Number of Digits are : %d\n",iRet);
    
    return 0;
}