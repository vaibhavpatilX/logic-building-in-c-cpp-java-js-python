///////////////////////////////////////////////////////
//
//  File name :     program59.java
//  Descreption :   Accept Input and Check Wheather Number is Even or not..!
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Number
{
    public boolean CheckEven(int iNo)
    {
        if ((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program59
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("---- This Application is used to Check Wheather Number is Even or not ----");
        
        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckEven(iValue) ;

        if(bRet == true)
        {
            System.out.println(iValue+" is Even");
        }
        else
        {
            System.out.println(iValue+" is Odd");
        }
        //if(nobj.CheckEven)
    }
}