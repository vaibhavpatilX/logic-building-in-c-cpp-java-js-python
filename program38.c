///////////////////////////////////////////////////////
//
//  File name :     program38.c
//  Descreption :   Display Sum of Factors with updator with Better time complexity [O(N/2)]
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int SumFactors(int iNo)
{
    int iCnt = 0;
    int iResult = 0;

    //Updator
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iResult = iCnt + iResult; 
        }
    }
    return iResult;
}

int main()
{
    int iValue = 0, iRet = 0;
    
    printf("Enter a  number: \n");
    scanf("%d",&iValue);
    
    iRet = SumFactors(iValue);

    printf("Addition of factors are: %d",iRet);

    return 0;
}