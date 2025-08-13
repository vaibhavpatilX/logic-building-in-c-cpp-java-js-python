///////////////////////////////////////////////////////
//
//  File name :     program50.java
//  Descreption :   Separate Digit and Do Summation of Digits from Input Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class CountEven
{
    int iValue;

    int Display()
    {       
        int iDigit = 0;
        int iSum = 0;
        
        while(iValue != 0)
        {   
            iDigit = iValue % 10; 
            iSum = iSum + iDigit;
            iValue = iValue / 10;
        }
        return iSum;
    }
}   
class program50
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Number Received is "+iNo);
        System.out.println("-----------------------------------------------------------------------------------------------");
        

        CountEven cobj = new CountEven();

        cobj.iValue = iNo;

        iRet = cobj.Display();

        System.out.println("Summation of Digits of Number "+iNo+" is "+iRet);
    }
}