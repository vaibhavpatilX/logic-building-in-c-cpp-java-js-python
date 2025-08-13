///////////////////////////////////////////////////////
//
//  File name :     program38.java
//  Descreption :   Display Sum of Factors with updator with Better time complexity [O(N/2)]
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class SumFactors
{
    public int iNo;
    
    public int Display()
    {
        int iSum = 0;

        System.out.println("---------------------------------------------------------------------");    

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        int iCnt = 0;

        for(iCnt = 1;iCnt <= (iNo/2);iCnt++)
        {
            if(iNo % iCnt == 0 )
            {
                iSum = iSum+iCnt;
            }            
        }
        return iSum;
    }
}

class program38
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0,iRet = 0;

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        SumFactors dobj = new SumFactors();
        dobj.iNo = iValue;

        iRet = dobj.Display();

        System.out.println("Summation of Numbers is : "+iRet);
    }
}


