///////////////////////////////////////////////////////
//
//  File name :     program57.c
//  Descreption :   Accept Input and Perform Addition in Separate Function and Return And Display Result  
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int Addition(int iValue1,int iValue2)
{
    int iResult = 0;

    iResult = iValue1+iValue2;

    return iResult; 
}

int main()
{
    int iNo1 = 0,iNo2 = 0;
    int iRet = 0;
    
    printf("---- This Application is used to perform Addition ----");
    
    printf("Enter first Number: ");
    scanf("%d",&iNo1);

    printf("Enter Second Number: ");
    scanf("%d",&iNo2);

    iRet = Addition(iNo1,iNo2);

    printf("Addition is : %d",iRet);
    
    return 0;
}

