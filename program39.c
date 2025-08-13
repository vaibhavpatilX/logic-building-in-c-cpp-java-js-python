///////////////////////////////////////////////////////
//
//  File name :     program39.c
//  Descreption :   Check wheather no. is perfect or not
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>
#include<stdbool.h>

int CheckPerfect(int iNo)
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
    if(iNo == iResult)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int iValue = 0; 
    bool bRet = false;
    
    printf("Enter a  number: \n");
    scanf("%d",&iValue);
    
    bRet = CheckPerfect(iValue);

    if(bRet == true)
    {
        printf("%d is Perfect number\n",iValue);
    }
    else
    {
        printf("%d is not a Perfect number\n",iValue);
    }

    return 0;
}