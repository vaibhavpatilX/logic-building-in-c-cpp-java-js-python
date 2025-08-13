#include<stdio.h>

int main()
{
    char ch='\0';
    printf("Enter your Character: ");
    scanf("%c",&ch);

    printf("ASCII value of %c is: %d",ch,ch);
    return 0;
}