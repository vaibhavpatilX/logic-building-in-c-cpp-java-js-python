////////////////////////////////////////////////////
//
//  File name   :   program16.java
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
            System.out.println(iCnt);
        }
    }
}
class program16
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the Value: ");
        iValue = sobj.nextInt();

        Display dobj = new Display(iValue);
    }
}
