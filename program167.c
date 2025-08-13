#include<stdio.h>
#include<string.h>

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);

    iRet = strlen(Arr);

    printf("Number of Characters are : %d\n",iRet);

    return 0;
}