#include<stdio.h>

void Display(char str[])
{

    while(*str != '\0')
    {
        printf("%c\n",*str);
        str++;
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