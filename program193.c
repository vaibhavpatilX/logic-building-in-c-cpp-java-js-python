#include<stdio.h>
#include<stdbool.h>

bool CheckCharacter(char *str, char ch)
{
    while(*str != '\0')
    {
        if(*str  == ch)
        {
            break;
        }
        str++;
    }

    if(*str == '\0')
    {
        return false;
    }
    else
    {
        return true;
    }
}

int main()
{
    char Arr[50] = {'\0'};
    char cValue = '\0';
    bool bRet = false;
    
    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    bRet = CheckCharacter(Arr,cValue);

    if(bRet == true)
    {
        printf("%c is present in %s\n",cValue,Arr);
    }
    else
    {
        printf("%c is not present in %s\n",cValue,Arr);
    }

    return 0;
}