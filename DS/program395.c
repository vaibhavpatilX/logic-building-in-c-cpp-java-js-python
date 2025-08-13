#include<stdio.h>

void Display()
{
    int iCnt = 0;

    printf("Jay Ganesh...:%d\n",iCnt);
    iCnt++;
    Display();
}

int main()
{
    Display();
    return 0;
}