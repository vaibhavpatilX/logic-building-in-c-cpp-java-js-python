///////////////////////////////////////////////////////
//
//  File name :     program37.java
//  Descreption :   Display Even Factors with updator with Better time complexity [O(N/2)]
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class DisplayEvenFactors
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

        for(iCnt = 1;iCnt <= (iNo/2);iCnt++)
        {
            if((iNo % iCnt == 0 ) && (iNo % 2 == 0))
            {
                System.out.println("Even Factors is "+iCnt+ "\t");
            }            
        }
    }
}

class program37
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        DisplayEvenFactors dobj = new DisplayEvenFactors();
        dobj.iNo = iValue;

        dobj.Display();
    }
}


