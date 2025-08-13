#include<stdio.h>
#include<stdbool.h>

bool CheckSmall(char ch)
{
    if((ch >= 'a') && (ch <= 'z'))
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

    bSmall(cValue);

    if(bRet == true)
    {
        printf("%c is small\n",cValue);
    }
    else
    {
        printf("%c is not small\n",cValue);
    }
    return 0;
}