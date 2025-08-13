#include<stdio.h>

void Display(char str[])
{ 
    for(;*str != '\0';str++)
    {
        printf("%c\n",*str);
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