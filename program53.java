///////////////////////////////////////////////////////
//
//  File name :     program53.java
//  Descreption :   Accept Input and Perform Addition And Display Result  
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class program53
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("---- This Application is used to perform Addition ----");
        System.out.println("Enter First number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        int iNo2 = sobj.nextInt();

        int iAns = iNo1+iNo2;

        System.out.println("Addition is : "+iAns);
    }
}