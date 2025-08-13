///////////////////////////////////////////////////////
//
//  File name :     program40.c
//  Descreption :   Check wheather no. is Prime or not
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////
//Info : A prime number is a whole number with exactly two factors: one and itself


#include<stdio.h>
#include<stdbool.h>

int CheckPrime(int iNo)
{
    int iCnt = 0;
    bool bFlag = true;

    //Updator
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(iNo <= 1)  
    {
        bFlag = false;
        return bFlag;
    }

    for(iCnt = 2 ; iCnt <= iNo/2 ; iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            bFlag = false;
            break;
        }
    }
    return bFlag;
}

int main()
{
    int iValue = 0; 
    bool bRet = false;
    
    printf("Enter a  number: \n");
    scanf("%d",&iValue);
    
    bRet = CheckPrime(iValue);

    if(bRet == true)
    {
        printf("%d is Prime number\n",iValue);
    }
    else
    {
        printf("%d is not a Prime number\n",iValue);
    }

    return 0;

    //dry run last 2 codes
}