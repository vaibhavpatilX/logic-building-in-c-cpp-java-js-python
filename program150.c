#include<stdio.h>
#include<stdbool.h>

bool CheckDigit(char ch)
{
    if((ch >= '0') && (ch <= '9'))
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

    CheckDigit(cValue);

    if(bRet == true)
    {
        printf("%c is digit\n",cValue);
    }
    else
    {
        printf("%c is not digit\n",cValue);
    }
    return 0;
}