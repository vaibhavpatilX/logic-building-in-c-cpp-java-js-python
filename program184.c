#include<stdio.h>

int main()
{
    char Arr[50] = {'\0'};
    char cValue = '\0';

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    // Problem solved
    printf("Enter the character : \n");
    scanf(" %c",&cValue);   // space before %c

    return 0;
}