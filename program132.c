//couteve

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Search(int Arr[],int iSize)
{
    int iCnt = 0;
    int iCount = 0,iSum=0;
    
    printf("Entered elements are : \n");
    for(iCnt= 0;iCnt< iSize;iCnt++)
    {
        if(Arr[iCnt]==11)
        {
            break;
        }
        else
        {
            return false;
        }
    }
    
}

int main()
{
   int iLength = 0;
   int *ptr = NULL;  
    int iCnt  =  0;
    bool bRet = 0;
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
        scanf("%d",&ptr[iCnt]);
    }
    //step22=Use the memory
    //USe ptr;
    iRet = Search(ptr,iLength);

    printf("CoutOdd is : %d",iRet);
    //step3=free the memory
    free(ptr);  
    return 0;
}