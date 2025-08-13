/////////////////////////////////////////////////////////////////////////
//program102.java
//  Input =     4   4
/*
Output =    1   2   3   4
            5   6   7   8
            9   10  11  12  
            13  14  15  16     
*/      
/////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0,j = 0;
        int iCnt = 0;

        for (i = 1,iCnt = 1;i<=iRow; i++)
        {
            for(j = 1;j <= iCol; j++,iCnt++)
            {
                System.out.print(iCnt+"\t");
            }
            System.out.println();
        }
    }
}

class program102
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