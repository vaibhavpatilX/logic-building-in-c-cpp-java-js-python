///////////////////////////////////////////////////////
//
//  File name :     program64.java
//  Descreption :   Accept Input and Calculate Summation of Factors as well as Non-Factors of Number and Display
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public void Sum(int iNo)
    {
        int iCnt = 0;
        int iSum1 = 0,iSum2 = 0;
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)       //dry run
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }
        System.out.println("Summation of Factors are : "+iSum2);            //python can return 2 values also
        System.out.println("Summation of Non-Factors are : "+iSum1);
    }
}

class program64
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("---- This Application is used to Display Summation of Factors as well as Non-Factors of Number ----");

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.Sum(iValue) ;

        
    }
}