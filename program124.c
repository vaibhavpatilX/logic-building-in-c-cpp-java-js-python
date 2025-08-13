#include<stdio.h>
#include<stdlib.h>

int main()
{
   int iLength = 0;
   int *ptr = NULL;  
   
   printf("Enter the no. of elements:");
   scanf("%d",&iLength);

   //step1=allocate the memory
   ptr = (int*)malloc(iLength*sizeof(int));

    if(ptr = NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    //step22=Use the memory
    //USe ptr;

    //step3=free the memory
    free(ptr);  
    return 0;
}