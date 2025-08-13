////////////////////////////////////////////////////
//
//  File name   :   program21.java
//  Description :   Check Even Number with using bool return value function
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class CheckEven
{
    public boolean Check(int iNo)
    {
        return ((iNo % 2) == 0);
    }
}
class program21
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        CheckEven dobj = new CheckEven();
        bRet = dobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Even Number");
        }
        else
        {
            System.out.println(iValue+" is Odd Number");
        }
    }
}
