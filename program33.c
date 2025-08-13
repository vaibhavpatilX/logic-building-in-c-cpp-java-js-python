///////////////////////////////////////////////////////
//
//  File name :     program33.c
//  Descreption :   Display Factors
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplayFactors(int iNo)
{
    int iCnt = 0;

    printf("Factors of %d are : ",iNo);

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