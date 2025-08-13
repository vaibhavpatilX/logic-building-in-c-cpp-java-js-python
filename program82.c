/////////////////////////////////////////////////////////////////////////
//  Input = 4
//  Output = -4     -3      -2      -1
/////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    if(iNo <= 0)
    {
        iNo = -(iNo);
    }
    printf("Output: \n");
    for(iCnt = -iNo;iCnt <= 0; iCnt++)
    {
        printf("%d\t",iCnt);
    }

    printf("\n");  
}

int main()
{
    int iValue = 0;

    printf("Enter frequency: \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}

//Time complexiy = O(N) 
// N is natural number
// where N >= 0 and N <= Infinity

/*
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    if(iNo > 0)
    {
        iNo = -(-iNo);
    }
    printf("Output: \n");
    for(iCnt = iNo;iCnt >= 0; iCnt--)
    {
        printf("-%d\t",iCnt);
    }  
    printf("\n");  
}

int main()
{
    int iValue = 0;

    printf("Enter frequency: \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}

//Time complexiy = O(N) 
// N is natural number
// where N >= 0 and N <= Infinity
*/