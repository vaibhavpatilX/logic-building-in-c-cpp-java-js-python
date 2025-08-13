////////////////////////////////////////////////////
//
//  File name   :   program22.java
//  Description :   Check Divisible by 5 Number
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class CheckDivisible
{
    public boolean Check(int iNo)
    {
        if((iNo % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program22
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        CheckDivisible dobj = new CheckDivisible();
        bRet = dobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Divisible by 5");
        }
        else
        {
            System.out.println(iValue+" is not Divisible by 5");
        }
    }
}
