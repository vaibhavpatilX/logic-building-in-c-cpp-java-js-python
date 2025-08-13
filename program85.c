/////////////////////////////////////////////////////////////////////////
//  Input = 4   #
//  Output = #  #   #   #
//
//  Input = 5   &
//  Output = &  &   &   &   &
//
//  Input = 3   z
//  Output = z  z   z
/////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo,char ch)
{
    int iCnt = 0;

    if(iNo <= 0)
    {
        iNo = -iNo;
    }
    printf("Output: \n");
    for(iCnt = 1;iCnt <= iNo; iCnt++)      
    {
        printf("%c\t",ch);
    }
    printf("\n");  
}

int main()
{
    int iValue = 0;
    char cValue = '\0';

    printf("Enter frequency: \n");
    scanf("%d",&iValue);

    printf("Enter character: \n");
    scanf("%c",&cValue);                    //problem here

    printf("Aceepted character : %c\n",cValue);
    Display(iValue,cValue);

    return 0;
}

//Time complexiy = 2N
// N is natural number
// where N >= 0 and N <= Infinity