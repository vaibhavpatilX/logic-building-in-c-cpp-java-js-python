#include<stdio.h>
#include<stdbool.h>

bool CheckPerfect(int iNo)
{
    bool bResult = false;
    int iSum = 0;
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1;iCnt <= (iNo/2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iSum = iSum + iCnt;
        } 
    }
    if(iNo == iSum)
    {
        return true;
    }
    else
    {
        return false;    
    }
}


int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter a number: ");
    scanf("%d",&iValue);

    bRet = CheckPerfect(iValue);

    if(bRet == true)
    {
        printf("%d is Perfect Number\n",iValue);
    }
    else
    {
        printf("%d is not Perfect Number\n",iValue);
    }

    return 0;
}