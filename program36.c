///////////////////////////////////////////////////////
//
//  File name :     program36.c
//  Descreption :   Display Factors with updator
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplayFactorsNonFactors(int iNo)
{
    int iCnt = 0;

    printf("---------------------------------------------------------------------\n");    
    //Updator
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1 ; iCnt < iNo ; iCnt++)
    {
        if(iNo % iCnt == 0 )
        {
            printf("Factors is : %d\n",iCnt);
        }
        else
        {
            printf("Non Factors is : %d\n",iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a  number: \n");
    scanf("%d",&iValue);
    
    DisplayFactorsNonFactors(iValue);

    return 0;
}