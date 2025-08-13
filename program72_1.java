///////////////////////////////////////////////////////
//
//  File name :     program72_1.java
//  Description :   Accept Input Number and Display Summation of Even Digits from that Number
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public int CountEven(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;              //for digit separation
            if((iDigit % 2) == 0)
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;                 //
        }
        return iSum;
    }
}

class program72_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("---- This Application is used to Display Summation of Even Digits from that Number ----");        

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();


        Digits dobj = new Digits();
        
        int iRet = dobj.CountEven(iValue);

        System.out.println("Summation of Even Digits in Number "+iValue+" are : "+iRet);
    }
}