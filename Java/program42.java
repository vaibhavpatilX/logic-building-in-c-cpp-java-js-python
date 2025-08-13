///////////////////////////////////////////////////////
//
//  File name :     program42.java
//  Descreption :   Check wheather no. is Prime or not
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////
//Info : A prime number is a whole number with exactly two factors: one and itself

import java.util.Scanner;

class CheckPrime
{
    int iValue;

    boolean Display()
    {   
        int iCnt = 0,iResult = 0;
        boolean bFlag = true;

        if(iValue < 0)
        {
            iValue = -iValue;
        }
        if(iValue <= 1)  
        {
            bFlag = false;
            return bFlag;
        }

        for(iCnt = 2;iCnt <= iValue/2;iCnt++)
        {
            if((iValue % iCnt)== 0)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}

class program42
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iNo = sobj.nextInt();

        CheckPrime cobj = new CheckPrime();
        
        cobj.iValue = iNo;
        bRet = cobj.Display();

        if(bRet == true)
        {
            System.out.println(iNo+" is a Prime Number");
        }
        else
        {
            System.out.println(iNo+" is not a Prime Number");
        }
    }
}