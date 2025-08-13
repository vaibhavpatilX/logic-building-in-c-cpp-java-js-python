#include<stdio.h>

int Factorial(int iNo)
{
    int i = 1,iSum = 1;

    while(i <= iNo)
    {
        iSum = iSum * i;
        i++;
    }
    return iSum;
}

int main()
{
    int iRet = 0;
    int iValue = 6;

    iRet = Factorial(iValue);

    printf("Factorial is : %d\n",iRet);

    return 0;
}