////////////////////////////////////////////////////
//
//  File name   :   program14.java
//  Description :   Iteration : for loop
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class Display
{
    public Display(int iNo)
    {
        int iCnt = 0;
        
        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            System.out.println("Hello");
        }
    }
}
class program14
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequency: ");
        iValue = sobj.nextInt();

        Display dobj = new Display(iValue);
    }
}
