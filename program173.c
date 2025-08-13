#include<stdio.h>

void CountCapitalSmall(char *str)
{
    int iCountCap = 0 , iCountSmall = 0;

    while(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCountSmall++;
        }
        else if((*str >= 'A') && (*str <= 'Z'))
        {
            iCountCap++;
        }
        str++;
    }
    printf("Captail Letters are : %d\n",iCountCap);
    printf("Small Letters are : %d\n",iCountSmall);

}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);

    CountCapitalSmall(Arr);

    return 0;
}