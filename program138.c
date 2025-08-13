#include<stdio.h>
#include<stdlib.h>


int Frequency(int Arr[] ,int iSize,int iNo)
{
    int iCnt=0;
    int iCount=0;

    for(iCnt= 0;iCnt< iSize;iCnt++)
    {
        if((Arr[iCnt])==iNo)
        {
            iCount++;
            
        }
    }
    return iCount;
}
int main()
{
    int iLength = 0;
    int *ptr = NULL;  
    int iCnt  =  0,iValue=0;
    
    int iRet = 0;

    printf("Enter the no. of elements:");
    scanf("%d",&iLength);

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

    printf("Enter the elemet: ");
    scanf("%d",&iValue);

    iRet = Frequency(ptr,iLength,iValue);

    if(iRet==-1)
    {
        printf("There is issue in the input");
    }
    else
    {
        printf("%d is appears at %d time in array",iValue,iRet);
    }
}