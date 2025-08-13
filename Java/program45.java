///////////////////////////////////////////////////////
//
//  File name :     program45.java
//  Descreption :   Separate Digit and Display from Number
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class program45
{
    public static void main(String A[])
    {
        int iNo = 751;
        int iDigit = 0; 

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Number Received is "+iNo);
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);       // 1
        iNo = iNo / 10;
        System.out.println("Updated iNo is "+iNo);      //75

        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);       //5
        iNo = iNo / 10;
        System.out.println("Updated iNo is "+iNo);      //7

        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);       //7
        iNo = iNo / 10;
        System.out.println("Updated iNo is "+iNo);      //0
        
    }
}