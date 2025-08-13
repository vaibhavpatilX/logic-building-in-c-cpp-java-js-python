#include<stdio.h>

int CountSpace(char *str)
{
    int iCountSpace = 0;

    while(*str != '\0')
    {
        if((*str == ' ') )
        {
            iCountSpace++;
        }
        str++;
    }
    return iCountSpace;

}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);

    iRet = CountSpace(Arr);

    printf("Number of White Spaces are: %d",iRet);
    return 0;
}