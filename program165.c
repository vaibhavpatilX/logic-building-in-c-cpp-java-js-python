#include<stdio.h>

void Display(char str[])
{
    int iCnt = 0;

    for(iCnt = 0;str[iCnt] != '\0';iCnt++)
    {
        printf("%c\n",str[iCnt]);
    }

}
int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);

    Display(Arr);

    return 0;
}