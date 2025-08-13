#include<stdio.h>

void CountCapitalSmallDigits(char *str)
{
    int iCountCap = 0 , iCountSmall = 0, iCountDigit = 0;

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
        else if((*str >= '0') && (*str <= '9'))
        {
            iCountDigit++;
        }
        str++;
    }
    printf("Number of Capital Letters are : %d\n",iCountCap);
    printf("Number of Small Letters are : %d\n",iCountSmall);
    printf("Number of Digits are : %d\n",iCountDigit);

}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);

    CountCapitalSmallDigits(Arr);

    return 0;
}