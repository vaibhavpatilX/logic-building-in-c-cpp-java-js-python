///////////////////////////////////////////////////////
//
//  File name :     program69.c
//  Descreption :   Accept Input Number and Display Count of Frequnecy of 5 from that Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int CountFrequency(int iValue)
{
    int iCnt = 0;
    int iDigit = 0;

    if(iValue < 0)
    {
        iValue = -iValue;
    }
    while(iValue != 0)
    {
        iDigit = iValue % 10;
        
        if(iDigit == 5)
        {
            iCnt++;         
        }
        iValue = iValue / 10;
    }
    return iCnt;    
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("---- This Application is used to Display Frequency of 5 from that Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    iRet = CountFrequency(iNo);
 
    printf("5 Number in %d Number is %d",iNo,iRet);

    return 0;
}

