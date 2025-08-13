///////////////////////////////////////////////////////
//
//  File name :     program49.c
//  Descreption :   Separate Digit and Count Even Digits from Number
//  Author :        Vaibhav
//  Date :          12/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int CountEven(int iNo)
{
    int iCnt = 0;
    int iDigit = 0;

    while(iNo != 0)
    {   
        iDigit = iNo % 10;
        iNo = iNo / 10;
        if(iDigit % 2 == 0)
        {
            iCnt++;
        }
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

    iRet = CountEven(iValue);

    printf("Number of Digits are : %d\n",iRet);
    
    return 0;
}