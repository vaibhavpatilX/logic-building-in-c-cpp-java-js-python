///////////////////////////////////////////////////////
//
//  File name :     program41.java
//  Descreption :   Check wheather no. is Perfect or not
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////
//Info : perfect number, a positive integer that is equal to the sum of its proper divisors


import java.util.Scanner;

class CheckPerfect
{
    int iValue;
    boolean Display()
    {        
        boolean bFlag = false;
        int iResult = 0;
        int iCnt = 0;

        if(iValue < 0)
        {
            iValue = -iValue;
        }
        for(iCnt = 1;iCnt <= iValue/2; iCnt++)
        {
            if(iValue % iCnt == 0 )
            {
                iResult = iResult + iCnt;
            }
        }
        if(iValue == iResult)
        {
            bFlag = true;
            return bFlag;
        }

        return bFlag;
    }

}

class program41
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;
        
        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        CheckPerfect cobj = new CheckPerfect();

        cobj.iValue = iValue;

        bRet = cobj.Display();

        if(bRet == true)
        {
            System.out.println(iValue+" Number is a Perfect Number");
        }
        else
        {
            System.out.println(iValue+" Number is not a Perfect Number");
        }
        
    }
}
