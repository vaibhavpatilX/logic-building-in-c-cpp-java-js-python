///////////////////////////////////////////////////////
//
//  File name :     program64.c
//  Descreption :   Accept Input and Calculate Summation of Factors as well as Non-Factors of Number and Display
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

void DisplaySumFactorsNonFactors(int iValue)
{
    int iCnt = 0;
    int iSumFact = 0,iSumNonFact = 0;

    for(iCnt = 1;iCnt <= iValue; iCnt++)
    {
        if((iValue % iCnt) == 0)
        {
            iSumFact = iSumFact + iCnt;
        }
        else
        {
            iSumNonFact = iSumNonFact + iCnt;
        }
    }
    printf("Summation of Factors are : %d\n",iSumFact);
    
    printf("Summation of Non-Factors are : %d\n",iSumNonFact);

}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("---- This Application is used to used to Display Summation of Factors as well as Non-Factors of Number ----\n");

    printf("Enter Number: ");
    scanf("%d",&iNo);

    DisplaySumFactorsNonFactors(iNo);
    
    return 0;
}

