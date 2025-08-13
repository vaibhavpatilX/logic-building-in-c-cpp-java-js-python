///////////////////////////////////////////////////////
//
//  File name :     program35.c
//  Descreption :   Display Even Factors with updator with Better time complexity [O(N/2)]
//  Author :        Vaibhav
//  Date :          11/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplayEvenFactors(int iNo)
{
    int iCnt = 0;

    printf("---------------------------------------------------------------------\n");
    printf("Factors of %d are : \n",iNo);
    
    //Updator
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
    {
        if((iNo % iCnt == 0) && (iCnt %2 ==0) )
        {
            printf("Factor is : %d\n",iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a  number: \n");
    scanf("%d",&iValue);
    
    DisplayEvenFactors(iValue);

    return 0;
}