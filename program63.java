///////////////////////////////////////////////////////
//
//  File name :     program63.java
//  Descreption :   Accept Input and Calculate Summation of Non-Factors of Number and Display
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public int SumNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)       //dry run
            {
                iSum = iSum+ iCnt;
            }
        }
        return iSum;
    }
}

class program63
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("---- This Application is used to Display Summation of Non-Factors of Number ----");

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.SumNonFactors(iValue) ;

        System.out.println("Summation of Non factors are : "+iRet);
    }
}