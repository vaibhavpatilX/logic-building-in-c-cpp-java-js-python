#include<stdio.h>

void ReverseDisplay(char *str)
{
    int iCount = 0;
    char *start = NULL;

    start = str;

    while (*str != '\0')
    {
        iCount++;
        str++;
    }

    str--;

    while (str >= start)
    {
        printf("%c",*str);
        str--;
    }
    
    printf("\n");
}

int main()
{
    char Arr[50] = {'\0'};
    
    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    ReverseDisplay(Arr);

    return 0;
}