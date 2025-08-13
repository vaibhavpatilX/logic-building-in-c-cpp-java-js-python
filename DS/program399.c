#include<stdio.h>

int Addition()
{
    int i = 1,iSum = 0;

    while(i <= 5)
    {
        iSum = iSum + i;
        i++;
    }
    return iSum;
}

int main()
{
    int iRet = 0;

    iRet = Addition();

    printf("Addition is : %d\n",iRet);

    return 0;
}