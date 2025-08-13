#include<stdio.h>
/*
int CharFrequnecy(str[],char ch)
{
    pass;
}*/

int main()
{
    char Arr[50] = {'\0'};
    char cValue = '\0';
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);

    //problem solved
    printf("Enter Character you want to search: ");
    scanf(" %c",&ch);       //space before %c

   /* iRet = CharFrequnecy(Arr,cValue);

    printf("Count of Chracter %c is %d",ch,iRet);
*/
    return 0;
}