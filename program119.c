#include<stdio.h>

void Display(int *ptr, int iSize)
{
    printf("Elemets of array are: \n");
    printf("%d\n",*ptr);
    ptr++;
    
    printf("%d\n",*ptr);
    ptr++;
    
    printf("%d\n",*ptr);
    ptr++;

    printf("%d\n",*ptr);
    ptr++;

    printf("%d\n",*ptr);
    ptr++;
}



int main()
{
    int Arr[5];
    int iCnt=0;
    printf("Enter the elements:");

    for(iCnt =0;iCnt<5;iCnt++)
    {
        scanf("%d",&Arr[iCnt]);
    }
    
    Display(Arr,5);         //Display(100,5);

    return 0;
}