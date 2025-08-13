import java.util.Scanner;

class NNumbersX
{
    public int CountEven(int Arr[])
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program217
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements: ");

        int iCnt = 0;

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        NNumbersX nobj = new NNumbersX();

        int iRet = 0;

        iRet = nobj.CountEven(Arr);

        System.out.println("Numner of Even Elements are : "+iRet);

        Arr = null;
        sobj = null;
    }
}