///////////////////////////////////////////////////////
//
//  File name :     program36.java
//  Descreption :   Display Factors with updator
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class DisplayFactorNonFactors
{
    public int iNo;
    
    public void Display()
    {
        System.out.println("---------------------------------------------------------------------");    

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        int iCnt = 0;

        for(iCnt = 1;iCnt < iNo;iCnt++)
        {
            if(iNo % iCnt == 0 )
            {
                System.out.println("Factors is "+iCnt+ "\t");
            }            
            else
            {
                System.out.println("Non Factors is "+iCnt+ "\t");
            }
        }
        System.out.println();
    }
}

class program36
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        DisplayFactorNonFactors dobj = new DisplayFactorNonFactors();
        dobj.iNo = iValue;

        dobj.Display();
    }
}


