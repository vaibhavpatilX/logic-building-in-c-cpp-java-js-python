#include<stdio.h>
#include<stdlib.h>

void MaximumMinimum(int Arr[] ,int iSize)
{
    int iCnt=0;
    int iMax =0,iMin=0;

    if((Arr==NULL) || (iSize<=0))   
    {
        printf("Invalid Input\n");
        return;
    }

    iMin = Arr[0];
    iMax = Arr[0];

    for(iCnt= 0;iCnt< iSize;iCnt++)
    {
        if((Arr[iCnt]) < iMin)
        {
            iMin = Arr[iCnt];
            
        }
        if((Arr[iCnt]) > iMax)
        {
            iMax = Arr[iCnt];
        }
    }

    printf("Maximum element is : %d\n",iMax);
    printf("Minimum element is : %d\n",iMin);

}
int main()
{
    int iLength = 0;
    int *ptr = NULL;  
    int iCnt  =  0;

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


    MaximumMinimum(ptr,iLength);

    free(ptr);
}

// O(N)