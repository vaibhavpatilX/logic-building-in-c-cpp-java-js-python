////////////////////////////////////////////////////
//
//  File name   :   program26.java
//  Description :   Factorial
//  Input       :   5
//  Output      :   120
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class Factorial
{
    public int Fact(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;

        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}
class program26
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Factorial dobj = new Factorial();
        iRet = dobj.Fact(iValue);

        System.out.println("Factorial is : "+iRet);
    }
}
