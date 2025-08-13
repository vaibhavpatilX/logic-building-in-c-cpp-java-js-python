///////////////////////////////////////////////////////
//
//  File name :     program70.java
//  Description :   Accept Input Number and Display Even Digits from that Number
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public void DisplayEven(int iNo)
    {
        int iDigit = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;              //for digit separation
            if((iDigit % 2) == 0)
            {
                System.out.println(iDigit);
            }
            iNo = iNo / 10;                 //
        }
    }
}

class program70
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("---- This Application is used to Display Even Digits from that Number ----");        
        
        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        System.out.println("Even Digits in Number "+iValue+" are : ");
        Digits dobj = new Digits();
        
        dobj.DisplayEven(iValue);

    }
}