#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[],int iSize)
{
    int iCnt = 0;
    int iSum = 0;
    
    printf("Entered elements are : \n");
    for(iCnt= 0;iCnt< iSize;iCnt++)
    {
        iSum =iSum+Arr[iCnt];
    }
    return iSum;
}

int main()
{
   int iLength = 0;
   int *ptr = NULL;  
    int iCnt  =  0,iRet = 0;
   printf("Enter the no. of elements:");
   scanf("%d",&iLength);

   //step1=allocate the memory
   ptr = (int*)malloc(iLength*sizeof(int));

    if(ptr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    
    printf("Elements are: \n");
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d\n",&ptr[iCnt]);
    }
    //step22=Use the memory
    //USe ptr;
    iRet= Summation(ptr,iLength);

    printf("Summation is : %d",iRet);
    //step3=free the memory
    free(ptr);  
    return 0;
}