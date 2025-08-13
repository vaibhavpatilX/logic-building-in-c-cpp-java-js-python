#include<stdio.h>

void struprX(char *str)
{
    while(*str != '\0')
    {
        if((*str >= 'A') && (*str <= 'Z') )
        {
            *str = *str - ('a'-'A');
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

    struprX(Arr);

    printf("Updated String is : %s\n",Arr);
    return 0;
}