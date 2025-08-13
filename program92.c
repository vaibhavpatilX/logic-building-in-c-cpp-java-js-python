/////////////////////////////////////////////////////////////////////////
//program90.c
//  Input =     4   4
/*
Output =    1   1   1   1
            2   2   2   2
            3   3   3   3
            4   4   4   4

            */      
/////////////////////////////////////////////////////////////////////////
//This program is using for nested loop
#include<stdio.h>

void Display(int iRow,int iCol)
{
    int jCnt = 0;
    int iCnt = 0;
    
    for(iCnt = 1; iCnt <= iRow; iCnt++)
    {
        for(jCnt = 1; jCnt <= iCol;jCnt++)
        {
            printf("%d\t",iCnt);
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter number of rows: ");
    scanf("%d",&iValue1);

    printf("Enter number of columns: ");
    scanf("%d",&iValue2);

    Display(iValue1,iValue2);

    return 0;
}

//Time complexiy = 2N
// N is natural number
// where N >= 0 and N <= Infinity