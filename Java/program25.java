////////////////////////////////////////////////////
//
//  File name   :   program25.java
//  Description :   Summation
//  Input       :   5
//  Output     :   1 + 2 + 3 + 4 + 5
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class Summation
{
    public int Sum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            iSum = iSum+iCnt;
        }
        return iSum;
    }
}
class program25
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Summation dobj = new Summation();
        iRet = dobj.Sum(iValue);

        System.out.println("Summation is : "+iRet);
    }
}
