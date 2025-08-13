/////////////////////////////////////////////////////////////////////////
//program99.java
//  Input =     4   4
/*
Output =    A   A   A   A
            B   B   B   B
            C   C   C   C
            D   D   D   D   
*/      
/////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0,j = 0;
        char ch = '\0';

        for (i = 1,ch = 'A';i <=iRow; i++,ch++)
        {
            for(j = 1;j <= iCol; j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}

class program99
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter number of rows: ");
        iValue1 = sobj.nextInt(); 

        System.out.println("Enter number of columns: ");
        iValue2 = sobj.nextInt(); 

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}