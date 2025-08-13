#include<stdio.h>

int Summation(int ptr[], int iSize)
{
    int iCnt=0; 
    int iSum = 0;

    printf("Elemets of array are: \n");
    
    for(iCnt = 0;iCnt < iSize;iCnt++)
    {
        iSum =iSum + ptr[iCnt];
    }
   return iSum;
}

int main()
{
    int Arr[5];
    int iCnt=0;
    int iRet =  0;
    printf("Enter the elements: \n");

    for(iCnt =0;iCnt<5;iCnt++)
    {
        scanf("%d",&Arr[iCnt]);
    }
    
    iRet=Summation(Arr,5);         //Summation(100,5);

    printf("Summation of elemets are: %d\n",iRet);
    return 0;
}