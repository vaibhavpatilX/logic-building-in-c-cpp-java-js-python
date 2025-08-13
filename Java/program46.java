///////////////////////////////////////////////////////
//
//  File name :     program46.java
//  Descreption :   Separate Digit and Display in Reverse from Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class DisplayDigits
{
    int iValue;

    void Display()
    {
        int iDigit = 0;
        
        while(iValue != 0)
        {
            iDigit = iValue % 10;
            System.out.println("Digit is : "+iDigit);     
            iValue = iValue / 10;
        }
    }
}   
class program46
{
    public static void main(String A[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Number Received is "+iNo);
        System.out.println("-----------------------------------------------------------------------------------------------");
        

        DisplayDigits dobj = new DisplayDigits();

        dobj.iValue = iNo;

        dobj.Display();

    }
}