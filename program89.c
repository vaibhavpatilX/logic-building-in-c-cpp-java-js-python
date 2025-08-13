/////////////////////////////////////////////////////////////////////////
//program89.c
/////////////////////////////////////////////////////////////////////////
//This program is using for nested loop
#include<stdio.h>

void Display()
{
    int j = 0;
    int i = 0;
    
    for(i = 1; i <= 3; i++)
    {
        for(j = 1; j <= 3;j++)
        {
            printf("*\t");
        }
        printf("\n");
    }
}

int main()
{
    Display();

    return 0;
}

//Time complexiy = 2N
// N is natural number
// where N >= 0 and N <= Infinity