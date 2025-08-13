#include<stdio.h>

int main()
{
    int iValue = 0;
    
    printf("Enter Number: \n");
    scanf("%d",&iValue);

    printf("Number in Decimal format : %d\n",iValue);
    printf("Number in Decimal format : %o\n",iValue);
    printf("Number in Decimal format : %x\n",iValue);

    return 0;
}