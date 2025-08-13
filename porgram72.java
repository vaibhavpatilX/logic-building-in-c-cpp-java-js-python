import java.util.*;

class Digits
{
    public int CountEven(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;              //for digit separation
            if((iDigit % 2) == 0)
            {
                iCnt++;
            }
            iNo = iNo / 10;                 //
        }
        return iCnt;
    }
}

class program72
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();


        Digits dobj = new Digits();
        
        int iRet = dobj.CountEven(iValue);
        System.out.println(iRet);
    }
}