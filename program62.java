///////////////////////////////////////////////////////
//
//  File name :     program62.java
//  Descreption :   Accept Input and Calculate Non-Factors of Number and Display
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public void NonFactors(int iNo)
    {
        int iCnt = 0;
        
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)       //dry run
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program62
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("---- This Application is used to Display Non-Factors of Number ----");

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        System.out.println("Non Factors of "+iValue+" are : ");
        nobj.NonFactors(iValue) ;
    }
}