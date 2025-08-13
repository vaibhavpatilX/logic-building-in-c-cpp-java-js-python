////////////////////////////////////////////////////
//
//  File name   :   program19.java
//  Description :   Check Even Number
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class CheckEven
{
    public void Check(int iNo)
    {
        if((iNo % 2) == 0)
        {
            System.out.println(iNo+" is Even Number");
        }
        else
        {
            System.out.println(iNo+" is Odd Number");
        }
    }
}
class program19
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        
        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        CheckEven dobj = new CheckEven();
        dobj.Check(iValue);
    }
}
