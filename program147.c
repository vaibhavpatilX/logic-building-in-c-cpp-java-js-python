#include<stdio.h>
#include<stdbool.h>

bool CheckCapital(char ch)
{
    if((ch >= 65) && (ch <= 90))
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
    char cValue='\0';
    bool bRet = false;

    printf("Enter your Character: ");
    scanf("%c",&cValue);

    bRet = CheckCapital(cValue);

    if(bRet == true)
    {
        printf("%c is capital\n",cValue);
    }
    else
    {
        printf("%c is not capital\n",cValue);
    }
    return 0;
}