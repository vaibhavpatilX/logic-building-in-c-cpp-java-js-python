#include<stdio.h>

// Input : deRm2dfr
// Char : R

// Output : 3 (Wrong)

// Case insensitive
int CharFrequency(char *str, char ch)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if((*str == ch) || (*str == ch + 32) || (*str == ch - 32))
        {
            iCount++;
        }
        str++;
    }
    return iCount;
}

int main()
{
    char Arr[50] = {'\0'};
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    iRet = CharFrequency(Arr,cValue);

    printf("%c occurs %d times\n",cValue, iRet);

    return 0;
}