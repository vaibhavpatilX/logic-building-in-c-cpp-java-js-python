///////////////////////////////////////////////////////
//
//  File name :     program33.java
//  Descreption :   Display Factors
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class DisplayFactor
{
    public int iNo;
    
    public void Display()
    {
        int iCnt = 0;

        System.out.println("Factors of "+iNo +" are : ");

        for(iCnt = 1;iCnt < iNo;iCnt++)
        {
            if(iNo % iCnt == 0 )
            {
                System.out.print(iCnt+ "\t");
            }
        }
        System.out.println();
    }
}

class program33
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        DisplayFactor dobj = new DisplayFactor();
        dobj.iNo = iValue;

        dobj.Display();
    }
}


