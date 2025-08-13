#include<stdio.h>

int strlenX(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        iCount++;
        str++;
    }
    return iCount;
}

int main()
{
    char Arr[50];
    int iRet = 0;

    printf("Enter String: \n");
    scanf("%[^'\n']s",Arr);

    iRet = strlenX(Arr);

    printf("Numbers of character are : %d\n",iRet);

    return 0;
}