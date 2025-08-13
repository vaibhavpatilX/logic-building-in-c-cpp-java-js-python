
#include<stdio.h>

void Display()
{
    static int iCnt = 1;

    if(iCnt <= 3)
    {
        printf("Jay Ganesh... : %d\n",iCnt);
        iCnt++;
        Display();
    }

}

int main()
{
    Display();
    printf("End of main\n");
    return 0;
}