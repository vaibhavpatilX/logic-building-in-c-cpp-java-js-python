///////////////////////////////////////////////////////
//
//  File name :     program34.c
//  Descreption :   Display Factors with updator
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplayFactors(int iNo)
{
    int iCnt = 0;

    printf("Factors of %d are : ",iNo);

    //Updator
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1;iCnt < iNo;iCnt++)
    {
        if(iNo % iCnt == 0 )
        {
            printf("%d\t",iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a  number: \n");
    scanf("%d",&iValue);
    
    DisplayFactors(iValue);

    return 0;
}