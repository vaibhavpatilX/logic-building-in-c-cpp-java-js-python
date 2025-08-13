/////////////////////////////////////////////////////////////////////////
//program88.c
/////////////////////////////////////////////////////////////////////////
//This program is using for loop again and again
#include<stdio.h>

void Display()
{
    int j = 0;
    
    for(j = 1; j <= 3;j++)
    {
        printf("*\t");
    }
    printf("\n");

    for(j = 1; j <= 3;j++)
    {
        printf("*\t");
    }
    printf("\n");

    for(j = 1; j <= 3;j++)
    {
        printf("*\t");
    }
    printf("\n");
}

int main()
{
    Display();

    return 0;
}

//Time complexiy = 2N
// N is natural number
// where N >= 0 and N <= Infinity