#include<stdio.h>

int Factorial(int iNo)
{
    static int i = 1,iSum = 1;

    if(i <= iNo)
    {
        iSum = iSum * i;
        i++;
        Factorial(iNo);
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