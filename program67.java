///////////////////////////////////////////////////////
//
//  File name :     program67.java
//  Descreption :   Accept Input Number and Display Count of Digits from that Number
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;
        //int iDigit = 0;
        
        while(iNo > 0)
        {
            // iDigit = iNo % 10;              //for digit separation
            iNo = iNo / 10;                 //
            iCnt++;
        }
    return iCnt;
    }
}

class program67
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("---- This Application is used to Display  Display Count of Digits from that Number ----");
        
        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        
        int iRet = dobj.CountDigits(iValue);

        System.out.println("Number of Digits are: "+iRet);
    }
}