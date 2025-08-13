///////////////////////////////////////////////////////
//
//  File name :     program50.c
//  Descreption :   Separate Digit and Do Summation of Digits from Input Number
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

#include<stdio.h>

int SumDigits(int iNo)
{
    int iDigit = 0;
    int iSum = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo != 0)
    {   
        iDigit = iNo % 10;
        iNo = iNo / 10;
        iSum = iSum + iDigit;
    }
    return iSum;
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

    iRet = SumDigits(iValue);

    printf("Addition of Digits are : %d\n",iRet);
    
    return 0;
}