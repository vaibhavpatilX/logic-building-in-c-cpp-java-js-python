#include<stdio.h>

int main()
{
    char Arr[50];

    printf("Enter your Name: \n");
    scanf("%[^'\n']s",Arr);

    printf("Your name is : %s\n",Arr);
    return 0;
}