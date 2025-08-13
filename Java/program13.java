////////////////////////////////////////////////////
//
//  File name   :   program13.java
//  Description :   Iteration : for loop
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025

import java.util.Scanner;

class Display
{
    public Display(int iNo)
    {
        int iCnt = 0;
        
        for(iCnt = 1;iCnt <=5; iCnt++)
        {
            System.out.println(""+iNo);
        }
    }
}
class program13
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
