import java.util.Scanner;

class ArrayX
{
    protected int Arr[];      //change Access Specifier

    public ArrayX(int iSize)
    {
        System.out.println("Allocating the resource...");
        Arr = new int[iSize];       // Resource Allocation
    }
    
    protected void finalize()
    {
        System.out.println("Deallocating the resource...");
        Arr = null;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements: ");

        int iCnt = 0;

        for(iCnt = 0;iCnt < this.Arr.length;iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }
        sobj = null;
    }
    
    public void Display()
    {
        System.out.println("Elements of the array are : ");

        int iCnt = 0;
        
        for(iCnt = 0;iCnt < this.Arr.length;iCnt++)
        {
            System.out.println(this.Arr[iCnt]);
        }

    }
}

class NNumbersX extends ArrayX
{
    public NNumbersX(int iSize)
    {
        super(iSize);
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
    
    //Other functions will be here
}

class program224
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Elements : ");

        int iSize = sobj.nextInt();

        NNumbersX nobj = new NNumbersX(iSize);

        nobj.Accept();

        nobj.Display();
        
        int iRet = 0;

        iRet = nobj.CountEven();

        System.out.println("Numner of Even Elements are : "+iRet);

        sobj = null;

        nobj = null;

        System.gc();
    }
}