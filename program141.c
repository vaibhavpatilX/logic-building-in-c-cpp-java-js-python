#include<stdio.h>
#include<stdlib.h>

int Minimum(int Arr[] ,int iSize)
{
    int iCnt=0;
    int iMin=0;

    if((Arr==NULL) || (iSize<=0))   
    {
        printf("Invalid Input\n");
        return -1;
    }

    iMin = Arr[0];
    
    for(iCnt= 0;iCnt< iSize;iCnt++)
    {
        if((Arr[iCnt]) < iMin)
        {
            iMin = Arr[iCnt];
            
        }
    }
    return iMin;
}
int main()
{
    int iLength = 0;
    int *ptr = NULL;  
    int iCnt  =  0;
    
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


    iRet =Minimum(ptr,iLength);

    printf("Smallest element is : %d\n",iRet);

    free(ptr);
}