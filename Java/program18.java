////////////////////////////////////////////////////
//
//  File name   :   program18.java
//  Description :   Iteration : for loop
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class Calculate
{
    public Calculate(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println("Summation is : "+iSum);
    }
}
class program18
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        
        System.out.println("Enter the Value: ");
        iValue = sobj.nextInt();

        Calculate dobj = new Calculate(iValue);
    }
}
