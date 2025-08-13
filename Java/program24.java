////////////////////////////////////////////////////
//
//  File name   :   program24.java
//  Description :   loop
//  Input       :   5
//  Output     :   1  2  3  4  5
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class Summation
{
    public void Sum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            System.out.println(""+iCnt);
        }
    }
}
class program24
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Summation dobj = new Summation();
        dobj.Sum(iValue);

    }
}
