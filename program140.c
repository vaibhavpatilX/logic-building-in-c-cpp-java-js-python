#include<stdio.h>
#include<stdlib.h>

int Maximum(int Arr[] ,int iSize)
{
    int iCnt=0;
    int iMax=0;

    if((Arr==NULL) || (iSize<=0))
    {
        printf("Invalid Input\n");
        return -1;
    }

    iMax = Arr[0];
    
    for(iCnt= 0;iCnt< iSize;iCnt++)
    {
        if((Arr[iCnt]) > iMax)
        {
            iMax = Arr[iCnt];
            
        }
    }
    return iMax;
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


    iRet = Maximum(ptr,iLength);

    printf("Largest elemet is : %d\n",iRet);

    free(ptr);
}