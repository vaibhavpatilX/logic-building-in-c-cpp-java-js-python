#include<stdio.h>
#include<stdlib.h>

int main()
{
   int iLength = 0;
   int *ptr = NULL;  
    int iCnt  =  0;
   printf("Enter the no. of elements:");
   scanf("%d",&iLength);

   //step1=allocate the memory
   ptr = (int*)malloc(iLength*sizeof(int));

    if(ptr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter the elemets: ");

    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }
    
    printf("Elements are: \n");
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        printf("%d\n",ptr[iCnt]);
    }
    //step22=Use the memory
    //USe ptr;

    //step3=free the memory
    free(ptr);  
    return 0;
}