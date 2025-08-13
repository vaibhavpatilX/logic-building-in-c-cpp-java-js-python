///////////////////////////////////////////////////////
//
//  File name :     program48.java
//  Descreption :   Separate Digit and Count Digits from Input Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class CountDigits
{
    int iValue;

    int Display()
    {
        int iCnt = 0;
        
        while(iValue != 0)
        {
            iValue = iValue / 10;
            iCnt++;
        }
        return iCnt;
    }
}   
class program48
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
        

        CountDigits dobj = new CountDigits();

        dobj.iValue = iNo;

        iRet = dobj.Display();

        System.out.println("Number of Digits in Number "+iNo+" is "+iRet);

    }
}