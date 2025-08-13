#include<stdio.h>

int Factorial()
{
    static int i = 1,iSum = 1;

    if(i <= 5)
    {
        iSum = iSum * i;
        i++;
        Factorial();
    }
    return iSum;
}

int main()
{
    int iRet = 0;

    iRet = Factorial();

    printf("Factorial is : %d\n",iRet);

    return 0;
}