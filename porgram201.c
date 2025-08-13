#include<stdio.h>
#include<stdbool.h>

bool CheckPalindrome(char *str)
{
    char *start = NULL;
    char *end = NULL;
    bool bFlag = true;

    while(*end != '\0')
    {
        end++;
    }
    end--;

    while(start < end)
    {
        if(start != *end)
        {
            bFlag = false;
            break;
        }
    }
    return bFlag;
}


int main()
{
    char Arr[50] = {'\0'};
    bool bRet = false; 

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr); 

    bRet = CheckPalindrome(Arr);

    if(bRet == true)
    {
        printf("String is Palindrome");
    }
    else
    {
        printf("String is not a Palindrome");
    }
    return 0;
}


//Time complexity = O(N + N/2)