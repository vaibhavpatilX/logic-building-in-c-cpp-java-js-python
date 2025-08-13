///////////////////////////////////////////////////////
//
//  File name :     program32.java
//  Descreption :   Factorial;
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class Factorial
{   
    public static final int ERR_INVALID = -1;
    public int Fact(int iNo)
    {   
        int iCnt = 0;
        int iFact = 1;

        if(iNo < 0)
        {
            return ERR_INVALID;
        }
        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}

class program32
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("_____________________________________________________________________");
        System.out.println("--------- This program is used for Factorial ---------");
        System.out.println("_____________________________________________________________________");

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();         
        
        Factorial dobj = new Factorial();
        iRet = dobj.Fact(iValue);

        if (iRet == Factorial.ERR_INVALID)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Factorial is  "+iRet);
        }
    }
}