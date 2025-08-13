#include<stdio.h>
#include<stdbool.h>

bool CheckPrime(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 2;iCnt <= iNo/2; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            break;   
        }
    }
    return (iCnt > (iNo/2));        //
}

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter a number: ");
    scanf("%d",&iValue);

    bRet = CheckPrime(iValue);

    if(bRet == true)
    {
        printf("%d is Prime Number\n",iValue);
    }
    else
    {
        printf("%d is not Prime Number\n",iValue);
    }

    return 0;
}