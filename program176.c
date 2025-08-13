#include<stdio.h>

int Count(char *str)
{
    int iCountSpace = 0;

    while(*str != '\0')
    {
        if((*str == 'a') )
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

    iRet = Count(Arr);

    printf("Number of Small a character are: %d",iRet);
    return 0;
}