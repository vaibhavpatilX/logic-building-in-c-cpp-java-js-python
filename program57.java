///////////////////////////////////////////////////////
//
//  File name :     program57.java
//  Descreption :   Accept Input and Perform Addition in Separate Class And Display Result  
//  Author :        Vaibhav
//  Date :          
//
///////////////////////////////////////////////////////

import java.util.*;

class Arithmatic
{
    public int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

}
class program57
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("---- This Application is used to perform Addition ----");
        System.out.println("Enter First number: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        iValue2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        iRet = aobj.Addition(iValue1,iValue2);

        System.out.println("Addition is : "+iRet);
    }
}