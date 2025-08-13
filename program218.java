import java.util.Scanner;

class NNumbersX
{
    public int Arr[];

    public NNumbersX(int iSize)
    {
        Arr = new int[iSize];
    }

    public int CountEven()
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

class program218
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Elements : ");
        int iSize = sobj.nextInt();

        NNumbersX nobj = new NNumbersX(iSize);
        
        System.out.println("Enter the Elements: ");

        int iCnt = 0;

        for(iCnt = 0;iCnt < nobj.Arr.length;iCnt++)
        {
            nobj.Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");

        for(iCnt = 0;iCnt < nobj.Arr.length;iCnt++)
        {
            System.out.println(nobj.Arr[iCnt]);
        }

        int iRet = 0;

        iRet = nobj.CountEven();

        System.out.println("Numner of Even Elements are : "+iRet);

        sobj = null;
    }
}