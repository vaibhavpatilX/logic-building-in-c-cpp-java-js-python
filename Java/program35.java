///////////////////////////////////////////////////////
//
//  File name :     program35.java
//  Descreption :   Display Factors with updator with Better time complexity [O(N/2)]
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
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        int iCnt = 0;

        System.out.println("Factors of "+iNo +" are : ");

        for(iCnt = 1;iCnt <= (iNo / 2);iCnt++)
        {
            if(iNo % iCnt == 0 )
            {
                System.out.print(iCnt+ "\t");
            }
        }
        System.out.println();
    }
}

class program35
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


