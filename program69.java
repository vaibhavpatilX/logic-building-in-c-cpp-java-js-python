///////////////////////////////////////////////////////
//
//  File name :     program69.java
//  Descreption :   Accept Input Number and Display Count of Frequnecy of 5 from that Number
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public int CountFrequency(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;              //for digit separation
            if(iDigit == 5)
            {
                iCnt++;    
            }
            iNo = iNo / 10;                 //
        }
        return iCnt;
    
    }
}

class program69
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("---- This Application is used to Display Frequency of 5 from that Number ----");

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        
        int iRet = dobj.CountFrequency(iValue);

        System.out.println("Occurance of Digits are: "+iRet);
    }
}