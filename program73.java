///////////////////////////////////////////////////////
//
//  File name :     program73.java
//  Description :   Accept Input Number and Display Reverse that Number
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public int Reverse(int iNo)
    {
        int iDigit = 0,iRev = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;              //for digit separation
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;                 //
        }
        return iRev;
    }
}

class program73
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("---- This Application is used to Display Reverse that Number ----");        

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        
        int iRet = dobj.Reverse(iValue);
        System.out.println("Reverse number is : "+iRet);
    }
}