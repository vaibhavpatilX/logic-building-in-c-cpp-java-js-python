#include<stdio.h>

void Change(char *str)
{
    while(*str != '\0')
    {
        if((*str == 'a') )
        {
            *str = 'A';
        }
        str++;
    }
}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);

    Change(Arr);

    printf("Updated String is : %s\n",Arr);
    return 0;
}