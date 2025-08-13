///////////////////////////////////////////////////////
//
//  File name :     program61.java
//  Descreption :   Accept Input and Calculate Summation of Factors and Display
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////


import java.util.*;

class Number
{
    public int SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1;iCnt <= (iNo/2);iCnt++)
        {
            if((iNo%iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        
        }
        return iSum;
    }
}

class program61
{
    public static void main(String A[])
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("---- This Application is used to Display Summation of Factors of Number ----");

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.SumFactors(iValue) ;

        System.out.println("Summation of Factors is: "+iRet);

    }
}