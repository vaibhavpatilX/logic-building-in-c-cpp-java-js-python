///////////////////////////////////////////////////////
//
//  File name :     program49.java
//  Descreption :   Separate Digit and Count Even Digits from Input Number
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
        int iCnt = 0;
        
        while(iValue != 0)
        {   
            iDigit = iValue % 10; 
            if((iDigit % 2) == 0)
            {
                iCnt++;
            }
            iValue = iValue / 10;
        }
        return iCnt;
    }
}   
class program49
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

        System.out.println("Number of Even Digits in Number "+iNo+" is "+iRet);

    }
}