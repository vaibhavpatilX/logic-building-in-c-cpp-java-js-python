///////////////////////////////////////////////////////
//
//  File name :     program71.java
//  Description :   Accept Input Number and Display Even Digits from that Number
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public void DisplayEven(int iNo)
    {        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            if(((iNo % 10) % 2) == 0)
            {
                System.out.println(iNo % 10);
            }
            iNo = iNo / 10;                 
        }
    }
}

class program71
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("---- This Application is used to Display Even Digits from that Number ----");        

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();


        Digits dobj = new Digits();
        
        dobj.DisplayEven(iValue);

    }
}