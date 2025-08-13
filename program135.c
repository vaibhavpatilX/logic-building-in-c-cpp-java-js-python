#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>


bool Search(int Arr[] ,int iSize,int iNo)
{
    int iCnt=0;
    for(iCnt= 0;iCnt< iSize;iCnt++)
    {
        if((Arr[iCnt])==iNo)
        {
            break;
        }
    }
}
int main()
{
    int iLength = 0;
    int *ptr = NULL;  
    int iCnt  =  0,iValue=0;
    
    bool Ret = 0;

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

    Ret = Search(ptr,iLength,iValue);


}