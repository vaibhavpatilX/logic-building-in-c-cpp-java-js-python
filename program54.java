///////////////////////////////////////////////////////
//
//  File name :     program54.java
//  Descreption :   Accept Input and Perform Addition And Display Result  
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////


import java.util.*;


class program54
{
    public static void main(String A[])
    {
        Scanner sobj = null;
        int iNo1 = 0,iNo2 = 0, iAns = 0;
        sobj = new Scanner(System.in);
        System.out.println("---- This Application is used to perform Addition ----");
        System.out.println("Enter First number: ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        iNo2 = sobj.nextInt();

        iAns = iNo1+iNo2;

        System.out.println("Addition is : "+iAns);
    }
}