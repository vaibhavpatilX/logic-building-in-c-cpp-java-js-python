
#include<stdio.h>

void Display()
{
    static int iCnt = 1;

    if(iCnt <= 5)
    {
        printf("Jay Ganesh... : %d\n",iCnt);
        iCnt++;
        Display();
    }

}

int main()
{
    Display();
    return 0;
}