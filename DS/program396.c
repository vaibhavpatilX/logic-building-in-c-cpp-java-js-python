//infinite REcursion
#include<stdio.h>

void Display()
{
    static int iCnt = 0;

    printf("Jay Ganesh...:%d\n",iCnt);
    iCnt++;
    Display();
}

int main()
{
    Display();
    return 0;
}